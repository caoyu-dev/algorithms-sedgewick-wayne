package algorithms_1_3.linkedList;

import java.util.NoSuchElementException;

public class LinkedList<E> implements List<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public Node<E> search(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    @Override
    public void add(int index, E value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        // addFirst
        if (index == 0) {
            addFirst(value);
        }
        // addLast
        else if (index == size) {
            addLast(value);
        }
        // add
        else {
            Node<E> prevNode = search(index - 1);
            Node<E> nextNode = prevNode.next;
            Node<E> newNode = new Node<>(value);

            prevNode.next = newNode;
            newNode.next = nextNode;
            size++;
        }
    }

    private void addLast(E value) {
        Node<E> last = new Node<>(value);
        if (tail != null) {
            tail.next = last;
        }
        tail = last;
        if (head == null) {
            head = tail;
        }
        size++;
    }

    private void addFirst(E value) {
        Node<E> first = new Node<>(value);
        first.next = head;
        head = first;
        size++;

        if (head.next == null) {
            tail = head;
        }
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            return removeFirst();
        }

        Node<E> prevNode = search(index - 1);
        Node<E> removedNode = prevNode.next;
        Node<E> nextNode = removedNode.next;

        prevNode.next = nextNode;

        E element = removedNode.data;

        removedNode.data = null;
        removedNode.next = null;
        size--;

        if (prevNode.next == null) {
            tail = prevNode;
        }

        return element;
    }

    private E removeFirst() {
        Node<E> first = head;

        if (first == null) {
            throw new NoSuchElementException();
        }

        E element = first.data;

        Node<E> nextNode = head.next;

        first.data = null;
        first.next = null;

        head = nextNode;
        size--;

        if (size == 0) {
            tail = null;
        }

        return element;
    }

    @Override
    public boolean remove(Object value) {
        Node<E> temp = head;
        boolean hasValue = false;

        for (; temp != null; temp = temp.next) {
            if (value.equals(temp.data)) {
                hasValue = true;
            }
        }
        return hasValue;
    }

    @Override
    public E get(int index) {
        return search(index).data;
    }

    @Override
    public void set(int index, E value) {
        Node<E> replacedNode = search(index);
        replacedNode.data = value;
    }

    @Override
    public boolean contains(Object value) {
        return indexOf(value) >= 0;
    }

    @Override
    public int indexOf(Object value) {
        int index = 0;

        Node<E> temp = head;
        for (; temp != null; temp = temp.next) {
            if (value.equals(temp.data)) {
                return index;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        Node<E> temp = head;
        for (; temp != null ; temp = temp.next) {
            Node<E> nextNode = temp.next;
            temp.data = null;
            temp.next = null;
            temp = nextNode;
        }
        head = null;
        tail = null;
        size = 0;
    }
}
