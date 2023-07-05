package algorithms_1_3;

import java.util.Stack;

public class example3 {
    public static boolean isPermutation(int[] permutation) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;

        for (int i = 0; i < permutation.length; i++) {
            stack.push(i);

            while (!stack.isEmpty()
                    && j < permutation.length
                    && stack.peek() == permutation[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        int[][] permutations = {
                {4, 3, 2, 1, 0, 9, 8, 7, 6, 5},
                {4, 6, 8, 7, 5, 3, 2, 9, 0, 1},
                {2, 5, 6, 7, 4, 8, 9, 3, 1, 0},
                {4, 3, 2, 1, 0, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 9, 8, 7, 0},
                {0, 4, 6, 5, 3, 8, 1, 7, 2, 9},
                {1, 4, 7, 9, 8, 6, 5, 3, 0, 2},
                {2, 1, 4, 3, 6, 5, 8, 7, 9, 0}
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
