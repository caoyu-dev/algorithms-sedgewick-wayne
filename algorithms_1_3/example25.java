package algorithms_1_3;

import java.util.Iterator;

public class example25<Item> implements Iterable<Item> {

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

    public void insertAfter(Item item1, Item item2) {
        add(item1);
        add(item2);
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
        example25<Integer> list = new example25<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.print("1) line -> ");
        for (int item : list) {
            System.out.print(item + " ");
        }
        System.out.println();

        list.insertAfter(7, 8);

        System.out.print("2) line -> ");
        for (int item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
