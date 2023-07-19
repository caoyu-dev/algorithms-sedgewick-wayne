package algorithms_2_1;

public class example1 {
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);

            System.out.println(i + " : ");
            System.out.println("i : " + i + ", min : " + min + ", j : ");
            for (int j = 0; j < a.length; j++) {
                System.out.println(a[j]);
            }
            System.out.println();
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        String[] a = new String[] {"E", "A", "S", "Y", "Q", "U", "E", "S", "T", "I", "O", "N"};
        example1.sort(a);
        show(a);
    }
}
