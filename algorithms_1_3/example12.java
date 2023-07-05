package algorithms_1_3;

import edu.princeton.cs.algs4.StdOut;

import java.util.NoSuchElementException;
import java.util.Stack;

public class example12 {
    public static Stack<String> copy(Stack<String> stack) {
        Stack<String> temp = new Stack<>();
        Stack<String> copy = new Stack<>();

        for (String s : stack) {
            temp.push(s);
        }
        for (String s : temp) {
            copy.push(s);
        }
        return copy;
    }
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("blue");
        stack.push("green");
        stack.push("pink");

        Stack<String> copy = copy(stack);

        while (!copy.isEmpty()) {
            StdOut.println("pop: " + copy.pop());
        }

        System.out.println("\nExpected: ");
        System.out.println("pop: pink");
        System.out.println("pop: green");
        System.out.println("pop: blue");
    }
}
