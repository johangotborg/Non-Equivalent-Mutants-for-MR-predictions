package processing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;

import java.lang.reflect.Method;
public class Processing {

    String writeString = System.getProperty("user.dir") + "\\info\\";
    String readString = System.getProperty("user.dir") + "\\data_set\\";
    ClassLoader classLoader = ClassLoader.getSystemClassLoader();

    Class<?>[] acceptedReturnTypes = new Class<?>[] {
      int.class,
      Integer.class, 
      int[].class,
      Integer[].class,
      double.class,
      Double.class,
      double[].class,
      Double[].class,
    };

    Class<?>[] necessaryParamTypes = new Class<?>[] {
      Integer[].class,
      int[].class,
      double[].class,
      Double[].class
    };

    ArrayList<String> minimized = new ArrayList<>();
    Integer mutantPosition;

    /** NAIVE MUTANT
     *  Returns first observed mutant which satisfies the condition, if any
     *  mutantPosition defines where to start searching for sample in array
     */
    public Executable getNaiveMutant(Executable[] mutants, String operator) {
      if (mutantPosition >= mutants.length) {
        return null;
      }
      for (Integer i=mutantPosition; i<mutants.length; i++) {
        if (mutants[i].method.getName().contains(operator)) {
          mutantPosition = i + 1;
          return mutants[i];
        }
      }
      return null;
    }


    /** GENERATE EXECUTABLE 
     *  Maps each loaded class sample to an Executable object
    */
    public HashMap<Executable, Executable[]> MapToExecutable(HashMap<Class<?>, ArrayList<Class<?>>> classMap) {
      HashMap<Executable, Executable[]> mapper = new HashMap<>(classMap.size());
      for (Map.Entry<Class<?>, ArrayList<Class<?>>> entry : classMap.entrySet()) {
        ArrayList<Class<?>> mutantClasses = entry.getValue();
        ArrayList<Method> mutantMethods = this.LoadClassMethods(mutantClasses);
        ArrayList<Class<?>[]> mutantParameters = this.LoadParameterTypes(mutantMethods);
        ArrayList<Class<?>> mutantReturns = this.LoadReturnTypes(mutantMethods);
        
        Executable[] mutantExecutables = new Executable[mutantClasses.size()];
        for (int i=0; i<mutantClasses.size();i++) {
          mutantExecutables[i] = new Executable(mutantClasses.get(i), mutantMethods.get(i), mutantParameters.get(i), mutantReturns.get(i));
        }
        Method ogMethod = Reflection.getMethod(entry.getKey());
        Class<?>[] ogParams = Reflection.getParameterTypes(ogMethod);
        Class<?> ogReturns = Reflection.getReturnTypes(ogMethod);
        mapper.put(new Executable(entry.getKey(), ogMethod, ogParams, ogReturns), mutantExecutables);
      }
      return mapper;
    }

    public Executable[] MapToExecutable(ArrayList<Class<?>> classList) {
      Executable[] lister = new Executable[classList.size()];
      int i = 0;
      for (Class<?> cl : classList) {
        Method m = this.LoadClassMethods(cl);
        Class<?>[] p = this.LoadParameterType(m);
        Class<?> r = this.LoadReturnType(m);
        lister[i++] = new Executable(cl, m, p, r);
      }
      return lister;
    }

    
    /** FILTERING 
     *  Filtering of non-comparable samples
    */
    public HashMap<Executable, Executable[]> FilterExecutables(HashMap<Executable, Executable[]> exec) {
      HashMap<Executable, Executable[]> mapper = new HashMap<>();
      for (Executable og : exec.keySet()) {
        if (this.checkIfValidExecutable(og)) {
          ArrayList<Executable> accepted = new ArrayList<>(); 
          for (Executable ex : exec.get(og)) {
            if (this.checkIfValidExecutable(ex)) {
              accepted.add(ex);
            }      
          }
          Executable[] arr = new Executable[accepted.size()];
          int i = 0;
          for (Executable acc : accepted) {
            arr[i++] = acc;
          } 
          mapper.put(og, arr); 
        } else {
          System.out.println(og.method.getName());
        }
         
      }
      return mapper;
    }


    /** CLASS LOADER 
     *  Loads all sample classes from .class files
     *  Allows for reflection, execution, and finally testing of samples
    */
    public HashMap<Class<?>, ArrayList<Class<?>>> LoadClasses() throws ClassNotFoundException {
      HashMap<Class<?>, ArrayList<Class<?>>> mapper = new HashMap<>();
      File sourceDir = new File(readString);
      if (sourceDir.isDirectory()) {
        File[] dirs = sourceDir.listFiles();
        for (File dir : dirs) {
          if (dir.isDirectory()) {
            ArrayList<Class<?>> classes = new ArrayList<>();
            File mutDir = new File(dir.getAbsolutePath() + "\\mutations");
            for (File mut : mutDir.listFiles()) {
              String className = mut.getName();
              if(className.endsWith(".class")) {
                className = sourceDir.getName() + "." + dir.getName() + "." + mutDir.getName() + "." + className.substring(0, className.length() - 6);
                classes.add(classLoader.loadClass(className));
              }  
            }
            File ogDir = new File(dir.getAbsolutePath() + "\\original");
            for (File og : ogDir.listFiles()) {
              String className = og.getName();
              if (className.endsWith(".class")) {
                className = sourceDir.getName() + "." + dir.getName() + "." + ogDir.getName() + "." + className.substring(0, className.length() - 6);
                Class<?> ogClass = classLoader.loadClass(className);
                mapper.put(ogClass, classes);
              }
            }
          }
        }
      }
      return mapper;
    }


    /** REFLECTIONS
     *  Methods to perform introspection using Java Reflection API managed using Reflection.java
     */
    public ArrayList<Class<?>> LoadClasses(File path) throws ClassNotFoundException {
      if (path.isDirectory()) {
        ArrayList<Class<?>> classes = new ArrayList<>();
        File[] files = path.listFiles();
        for (File file : files) {
          String className = file.getName();
          if (className.endsWith(".class")) {
            className = "minimized_data_set" + "." + path.getName() + "." + className.substring(0, className.length() - 6);
            classes.add(classLoader.loadClass(className));
          }
        }
        return classes;
      }
      return null;
    }

    public ArrayList<Method> LoadClassMethods(ArrayList<Class<?>> classes) {
        ArrayList<Method> classMethods = new ArrayList<>();
        for (Class<?> cl : classes) {
            classMethods.add(Reflection.getMethod(cl));
        }
        return classMethods;
    }

    public Method LoadClassMethods(Class<?> cl) {
      return Reflection.getMethod(cl);
  }

    public ArrayList<Class<?>[]> LoadParameterTypes(ArrayList<Method> methods) {
        ArrayList<Class<?>[]> parameterTypes = new ArrayList<>();
        for (Method method : methods) {
            parameterTypes.add(Reflection.getParameterTypes(method));
        }
        return parameterTypes;
    }

    public Class<?>[] LoadParameterType(Method method) {
      return Reflection.getParameterTypes(method);
    }

    public ArrayList<Class<?>> LoadReturnTypes(ArrayList<Method> methods) {
      ArrayList<Class<?>> returnTypes = new ArrayList<>();
      for (Method method : methods) {
          returnTypes.add(Reflection.getReturnTypes(method));
      }
      return returnTypes;
    }

    public Class<?> LoadReturnType(Method method) {
      return Reflection.getReturnTypes(method);
    }



    /** OUTPUT METHODS
     *  Writes to files in necessary structure to allow for consistent management
     */

    public void writeMinimizedDataSet(Executable ex) throws IOException {
      BufferedWriter writer = new BufferedWriter(new FileWriter(String.format("%s%s.csv", writeString, "Minimized_data_set"), true));
      writer.write(String.format("%s%n", ex.method.getName()));
      writer.close();
    }

    public void writeMetamorphicLabels(Executable ex, String path) throws IOException {
      BufferedWriter writerPermutative = new BufferedWriter(new FileWriter(String.format("%s_permutative_labels.csv", path), true));
      writerPermutative.write(String.format("%s,%d%n", ex.method.getName(), ex.isPermutative ? 1 : -1));
      writerPermutative.close();
      
      BufferedWriter writerAdditive = new BufferedWriter(new FileWriter(String.format("%s_additive_labels.csv", path), true));
      writerAdditive.write(String.format("%s,%d%n", ex.method.getName(), ex.isAdditive ? 1 : -1));
      writerAdditive.close();

      BufferedWriter writerInclusive = new BufferedWriter(new FileWriter(String.format("%s_inclusive_labels.csv", path), true));
      writerInclusive.write(String.format("%s,%d%n", ex.method.getName(), ex.isInclusive ? 1 : -1));
      writerInclusive.close();
    }


    /** VALIDATE SAMPLES
     *  Applied to none-reduced dataset to filter non-comparable samples
     */
    public boolean checkIfValidExecutable(Executable ex) {
      for (Class<?> exParamType : ex.paramTypes) {
        for (Class<?> paramType : this.necessaryParamTypes) {
          if (exParamType.equals(paramType)) {
            for (Class<?> returnType : this.acceptedReturnTypes) {
              if (ex.returnType == returnType) {
                return true;
              }
            }
            return false;
          }
        }
      }
      return false;
    }
}
