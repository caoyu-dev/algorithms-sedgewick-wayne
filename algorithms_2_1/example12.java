package algorithms_2_1;

import java.util.Random;

public class example12 {
    private static long compareCount = 0;

    public static void sort(double[] arr) {
        int n = arr.length;
        int gap = 1;

        while (gap < n/3) {
            gap = 3 * gap + 1;
        }
        while (gap >= 1) {
            for (int i = gap; i < n; i++) {
                for (int j = i; j >= gap && less(arr[j], arr[j - gap]); j -= gap) {
                    exchange(arr, j, j - gap);
                }
            }
            gap = gap/3;
            System.out.println("compare count per element for gap(" + gap + "): " + ((double) compareCount) / n);
            compareCount = 0;
        }
    }

    private static boolean less(double v, double w) {
        compareCount = compareCount + 1;
        return v < w;
    }

    private static void exchange(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static double[] generateRandomArray(int n) {
        double[] arr = new double[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextDouble();
        }
        return arr;
    }

    public static void main(String[] args) {
        for (int n = 100; n <= 1000000; n *= 10) {
            double[] arr = example12.generateRandomArray(n);
            example12.sort(arr);
            System.out.println("finding sorting array of size: " + n);
        }
    }
}
