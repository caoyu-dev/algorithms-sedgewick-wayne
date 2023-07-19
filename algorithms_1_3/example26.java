package algorithms_1_3;

import java.util.Iterator;

public class example26<Item> implements Iterable<Item> {

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

    public void remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        // 연결 리스트와 문자열 키를 인수로 받아서 키에 해당하는 노드들을 리스트에서 모두 삭제하는 remove() 메서드를 작성하라.
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    public static void main(String[] args) {

    }
}
