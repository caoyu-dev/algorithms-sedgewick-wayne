package algorithms_1_3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class example20<Item> implements Iterable<Item> {

    private Node first;
    private int size;

    private class Node {
        Item item;
        Node next;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(Item item) {
        if (isEmpty()) {
            first = new Node();
            first.item = item;
        } else {
            Node temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node newNode = new Node();
            temp.next = newNode;
            newNode.item = item;
        }
        size++;
    }

    public void delete(int index) {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        Node prevNode = search(index - 1);
        Node deletedNode = prevNode.next;
        Node nextNode = deletedNode.next;

        prevNode.next = nextNode;

        deletedNode.item = null;
        deletedNode.next = null;
        size--;
    }

    private Node search(int index) {
        Node temp = first;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    @Override
    public Iterator<Item> iterator() {
        return new Iterator<Item>() {
            Node temp = first;
            @Override
            public boolean hasNext() {
                return temp != null;
            }

            @Override
            public Item next() {
                Item item = temp.item;
                temp = temp.next;
                return item;
            }
        };
    }

    public static void main(String[] args) {
        example20<Integer> list = new example20<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.print("1) list -> ");
        for (int item : list) {
            System.out.print(item + " ");
        }
        System.out.println();

        list.delete(1);

        System.out.print("1) delete 1 : list -> ");
        for (int item : list) {
            System.out.print(item + " ");
        }
        System.out.println();

        example20<String> list2 = new example20<>();
        list2.add("banana");
        list2.add("cat");
        list2.add("happy");

        System.out.print("2) list -> ");
        for (String item : list2) {
            System.out.print(item + " ");
        }
        System.out.println();

        list2.delete(1);

        System.out.print("2) delete 1 : list -> ");
        for (String item : list2) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
