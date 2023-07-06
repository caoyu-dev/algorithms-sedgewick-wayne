package algorithms_1_3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class example24<Item> implements Iterable<Item> {

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

    public void removeAfter(Item item) {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        Node temp = first;
        while (temp != null) {
            if (temp.item.equals(item)) {
                if (temp.next == null) {
                    break;
                }

                Node prevNode = temp;
                Node deletedNode = prevNode.next;
                Node nextNode = deletedNode.next;

                if (nextNode == null) {
                    prevNode.next = null;
                } else {
                    prevNode.next = nextNode;
                }
                deletedNode.item = null;
                deletedNode.next = null;
                size--;
            }
            temp = temp.next;
        }
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
        example24<Integer> list = new example24<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.print("1) list -> ");
        for (int item : list) {
            System.out.print(item + " ");
        }
        System.out.println();

        list.removeAfter(1);

        System.out.print("2) list -> ");
        for (int item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
