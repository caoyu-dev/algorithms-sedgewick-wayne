package algorithms_1_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class example14 {
    public static class ResizingArrayQueueOfStrings<Item> implements Iterable<Item> {
        private Item[] queue = (Item[]) new Object[1];
        private int N = 0;
        private int first;
        private int last;

        public boolean isEmpty() {
            return N == 0;
        }

        public int size() {
            return N;
        }

        private void resize(int max) {
            Item[] temp = (Item[]) new Object[max];

            for (int i = 0; i < N; i++) {
                temp[i] = queue[i];
            }

            queue = temp;
            first = 0;
            last = N;
        }

        public void add(Item item) {
            if (N == queue.length) {
                resize(2 * queue.length);
            }
            queue[last++] = item;

            if (last == queue.length) {
                last = 0;
            }

            N++;
        }

        public Item poll() {
            Item item = queue[first];
            queue[first] = null;
            N--;
            first++;

            if (first == queue.length) {
                first = 0;
            }

            if (N > 0 && N == queue.length / 4) {
                resize(queue.length / 2);
            }

            return item;
        }

        @Override
        public Iterator<Item> iterator() {
            return new ArrayIterator();
        }

        private class ArrayIterator implements Iterator<Item> {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < N;
            }

            @Override
            public Item next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Item item = queue[(index + first) % queue.length];
                index++;
                return item;
            }

            @Override
            public void remove() {
                Iterator.super.remove();
            }
        }
    }

    // it was - the best - of times - - - it was - the - -
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        ResizingArrayQueueOfStrings queue = new ResizingArrayQueueOfStrings();

        String[] items = line.split(" ");

        for (String item : items) {
            if (!item.equals("-")) {
                queue.add(item);
            } else if (!queue.isEmpty()) {
                System.out.print(queue.poll() + " ");
            }
        }
        System.out.println("\n배열의 크기: " + queue.size());
    }
}
