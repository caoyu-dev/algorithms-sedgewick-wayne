package algorithms_1_1;

public class example15 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] arrayA = histogram(a, 5);

        int[] b = {1, 2, 3, 9};
        int[] arrayB = histogram(b, 7);

        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + " ");
        }
        System.out.println("\nExpected : 0 1 1 1 1");
        System.out.println();

        for (int i = 0; i < arrayB.length; i++) {
            System.out.print(arrayB[i] + " ");
        }
        System.out.println("\nExpected : 0 1 1 1 0 0 0");
        System.out.println();
    }

    private static int[] histogram(int[] arr, int n) {
        int[] array = new int[n];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] < n) {
                array[arr[i]]++;
            }
        }
        return array;
    }
}
