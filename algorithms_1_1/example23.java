package algorithms_1_1;

import java.util.Arrays;

public class example23 {
    public static void main(String[] args) {
        int[] array = { 3, 2, 1 };
        int key = 1;

        Arrays.sort(array);

        // 1, [1,2,3], 0 , 2, 0
        System.out.println(array.length - 1);
        int index = rank(key, array, 0, array.length - 1, 0); // 0

        System.out.println();
        System.out.println("Index : " + index); // Index : 0
    }

    public static int rank(int key, int[] a, int depth) {
        depth = depth + 1;
        System.out.println("depth : " + depth);
        return rank(key, a, 0, a.length - 1, depth);
    }

    public static int rank(int key, int[] a, int lo, int hi, int depth) {
        // 1, [1,2,3], 0 , 2, 0
        // 1, [1, 2, 3], 0, 0, 1
        if (lo > hi) {
            return -1;
        }

        // 1, [1,2,3], 0 , 2, 0
        // 1, [1, 2, 3], 0, 0, 1
        System.out.println("lo : " + lo + ", hi : " + hi);
        // lo : 0, hi : 2
        // lo : 0, hi : 0

        int mid = lo + (hi - lo) / 2;
        // mid = 0 + (2 - 0) / 2 = 1
        // mid = 0

        // 1 < a[1] = 2
        // 1 < a[0] = 1
        if (key < a[mid]) {
            // 1
            depth = depth + 1;
            System.out.println("depth : " + depth);
            // rank(1, [1, 2, 3], 0, 0, 1);
            return rank(key, a, lo, mid - 1, depth);
        }
        else if (key > a[mid]) {
            depth = depth + 1;
            return rank(key, a, mid + 1, hi, depth);
        }
        else {
            // 0
            return mid;
        }
    }
}
