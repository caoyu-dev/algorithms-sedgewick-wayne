package algorithms_1_3;

import java.util.Iterator;
import java.util.Objects;

public class example21<Item> implements Iterable<Item> {

    private Node first;
    private int size;

    private class Node {
        Node next;
        Item item;
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
            newNode.item = item;
            temp.next = newNode;
        }
        size++;
    }

    public boolean find(Item item) {
        Node temp = first;
        boolean hasValue = false;

        while (temp != null) {
            if (temp.item.equals(item)) {
                hasValue = true;
            }
            temp = temp.next;
        }
        return hasValue;
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
        example21<Integer> list = new example21<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.print("list -> ");
        for (int item : list) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println("1) Is there number 3? " + list.find(3));
        System.out.println("1) expected : true\n");

        System.out.println("2) Is there number 4? " + list.find(4));
        System.out.println("2) expected : false\n");
    }
}
