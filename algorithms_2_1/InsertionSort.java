package algorithms_2_1;

public class InsertionSort {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                 arr[j + 1] = arr[j];
                 j = j - 1;
            }
            arr[j + 1] = key;

        }
    }

    private void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        InsertionSort in = new InsertionSort();
        int arr[] = { 12, 11, 13, 5, 6 };

        in.sort(arr);
        in.printArray(arr);
    }
}
