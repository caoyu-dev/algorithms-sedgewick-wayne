package algorithms_1_3;

import java.util.NoSuchElementException;

public class example7 {

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

        public Item peek() {
            if (isEmpty()) {
                throw new NoSuchElementException();
            }

            return first.item;
        }
    }
    public static void main(String[] args) {
        Stack<String> sampleA = new Stack<>();
        sampleA.push("cat");

        System.out.println("Is there a cat?");
        if (sampleA.peek() == "cat") {
            System.out.println("Yes, There is a cat on the table.\n");
        } else {
            System.out.println("No, Where is a cat?\n");
        }

        sampleA.push("dog");

        System.out.println("Is there a dog?");
        if (sampleA.peek() == "dog") {
            System.out.println("Yes, There is a dog over there.\n");
        } else {
            System.out.println("No, Where is a dog?\n");
        }
    }
}
