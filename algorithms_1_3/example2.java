package algorithms_1_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

public class example2 {
    public static class Stack<Item> {
        private Node first;
        private int n;

        public class Node {
            Item item;
            Node next;
        }

        public boolean isEmpty() {
            return first == null;
        }

        public int size() {
            return n;
        }

        public void push(Item item) {
            Node oldFirst = first;

            first = new Node();
            first.item = item;
            first.next = oldFirst;
            n++;
        }

        public Item pop() {
            if (isEmpty()) {
                throw new NoSuchElementException();
            }
            Item item = first.item;
            first = first.next;
            n--;

            return item;
        }
    }

    // it was - the best - of times - - - it was - the - -
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> stack = new Stack<>();
        String line = br.readLine();

        String[] items = line.split(" ");

        for (String item : items) {
            if (!item.equals("-")) {
                stack.push(item);
            } else if (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }
        }
        System.out.println("\n(" + stack.size() + " left on stack)");
    }
}
