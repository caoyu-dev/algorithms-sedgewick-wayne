package algorithms_2_1;

public class ShellSort {
    private int numberSort(int[] arr) {
        int n = arr.length;
        for (int gap = n/2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
        return 0;
    }

    private static void printArray(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    private static void characterSort(String[] arr) {
        int n = arr.length;
        int gap = 1;
        while (gap < n / 3) {
            gap = 3 * gap + 1;
        }
        while (gap >= 1) {
            for (int i = gap; i < n; i++) {
                for (int j = i; j >= gap && less(arr[j], arr[j - gap]); j -= gap) {
                    exchange(arr, j, j - gap);
                    System.out.println("gap: " + gap + ", i: " + i + ", j: " + j);
                    for (int t = 0; t < n; t++) {
                        System.out.print(arr[t] + " ");
                    }
                    System.out.println();
                    System.out.println();
                }
            }
            gap = gap / 3;
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

    private static void printArray(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args)
    {
//        int arr[] = {12, 34, 54, 2, 3, 53, 43, 21, 26};
//        System.out.println("Array before sorting");
//        printArray(arr);
//
//        ShellSort ob = new ShellSort();
//        ob.numberSort(arr);
//
//        System.out.println("Array after sorting");
//        printArray(arr);

        String[] a = new String[] {
                "E", "A", "S", "Y", "S", "H", "E", "L", "L", "S", "O", "R", "T", "Q", "U", "E", "S", "T", "I", "O", "N"
        };
        ShellSort.characterSort(a);
        printArray(a);
    }
}
