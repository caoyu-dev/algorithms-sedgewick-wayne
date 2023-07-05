package algorithms_1_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class example8 {

    public static class ResizingArrayStack<Item> implements Iterable<Item> {
        private Item[] a = (Item[]) new Object[1];
        private int N = 0;

        public boolean isEmpty() {
            return N == 0;
        }

        public int size() {
            return N;
        }

        private void resize(int max) {
            Item[] temp = (Item[]) new Object[max];

            for (int i = 0; i < N; i++) {
                temp[i] = a[i];
            }

            a = temp;
        }

        public void push(Item item) {
            if (N == a.length) {
                resize(2 * a.length);
            }
            a[N++] = item;
        }

        public Item pop() {
            Item item = a[--N];
            a[N] = null;

            if (N > 0 && N == a.length / 4) {
                resize(a.length / 2);
            }

            return item;
        }

        @Override
        public Iterator<Item> iterator() {
            return new ReverseArrayIterator();
        }

        private class ReverseArrayIterator implements Iterator<Item> {
            private int index = N;

            @Override
            public boolean hasNext() {
                return index > 0;
            }

            @Override
            public Item next() {
                return a[--index];
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

        ResizingArrayStack<String> stack = new ResizingArrayStack<>();

        String[] items = line.split(" ");

        for (String item : items) {
            if (!item.equals("-")) {
                stack.push(item);
            } else if (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }
        }
        System.out.println("\n배열의 크기: " + stack.size());
    }
}
