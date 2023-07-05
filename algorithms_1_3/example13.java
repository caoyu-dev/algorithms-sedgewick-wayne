package algorithms_1_3;

import java.util.LinkedList;
import java.util.Queue;

public class example13 {
    public static boolean isPermutation(int[] permutation) {
        Queue<Integer> queue = new LinkedList<>();
        int j = 0;

        for (int i = 0; i < permutation.length; i++) {
            queue.add(i);

            while (!queue.isEmpty()
                    && j < permutation.length
                    && queue.peek() == permutation[j]) {
                queue.poll();
                j++;
            }
        }
        return queue.isEmpty();
    }
    public static void main(String[] args) {
        int[][] permutations = {
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {4, 6, 8, 7, 5, 3, 2, 9, 0, 1},
                {2, 5, 6, 7, 4, 8, 9, 3, 1, 0},
                {4, 3, 2, 1, 0, 5, 6, 7, 8, 9}
        };

        char label = 'a';
        for (int[] permutation : permutations) {
            if (!isPermutation(permutation)) {
                System.out.println(label + ". " + "is not a valid permutation.");
            }
            label++;
        }
    }
}
