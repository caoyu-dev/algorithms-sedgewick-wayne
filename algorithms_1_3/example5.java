package algorithms_1_3;

import java.util.Stack;

public class example5 {
    // 010011
    public static void main(String[] args) {
        int N = 50;
        Stack<Integer> stack = new Stack<>();

        while (N > 0) {
            stack.push(N % 2);
            N = N / 2;
        }

        for (int d : stack) {
            System.out.print(d);
        }
        System.out.println();
    }
}
