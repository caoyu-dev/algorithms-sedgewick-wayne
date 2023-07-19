package algorithms_2_1;

public class example11 {
    public static void sort(String[] arr) {
        int n = arr.length;
        for (int gap = n/2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                for (int j = i; j >= gap && less(arr[j], arr[j - gap]); j -= gap) {
                    exchange(arr, j, j - gap);
                }
            }
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exchange(Object[] arr, int i, int j) {
        Object swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
    }

    private static void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        String[] arr = new String[] {
                "E", "A", "S", "Y", "S", "H", "E", "L", "L", "S", "O", "R", "T", "Q", "U", "E", "S", "T", "I", "O", "N"
        };
        example11.sort(arr);
        printArray(arr);
    }
}
