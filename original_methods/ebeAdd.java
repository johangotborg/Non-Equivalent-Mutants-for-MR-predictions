package original_methods;


public class ebeAdd {
        public static Double[] ebeAdd_m(Double[] a, Double[] b) {
                if (a.length != b.length) {
                        return null;
                }
                final Double[] result = a.clone();
                for (int i = 0; i < a.length; i++) {
                        result[i] += b[i];
                }
                return result;
        }
}