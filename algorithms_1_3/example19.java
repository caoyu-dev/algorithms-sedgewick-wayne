package algorithms_1_3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class example19<Item> implements Iterable<Item> {

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
            newNode.item = item;
            temp.next = newNode;
        }
        size++;
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (first.next == null) {
            first = null;
        } else {
            Node temp = first;
            Node beforeTemp = null; // 마지막 노드를 제거하려면 이전 노드에서의 참조를 해제해야 함
            while (temp.next != null) {
                beforeTemp = temp;
                temp = temp.next;
            }
            beforeTemp.next = null;
        }
        size--;
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
        example19<Integer> list = new example19<>();
        list.add(0);
        list.add(1);
        list.add(2);

        System.out.print("list -> ");
        for (int item : list) {
            System.out.print(item + " ");
        }
        System.out.println();

        list.removeLast();

        System.out.print("list -> ");
        for (int item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
