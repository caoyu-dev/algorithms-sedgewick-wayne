package algorithms_1_3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class example6 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("one");
        queue.add("two");
        queue.add("three");

        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
