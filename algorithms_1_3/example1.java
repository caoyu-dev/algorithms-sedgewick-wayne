package algorithms_1_3;

import edu.princeton.cs.algs4.StdOut;

public class example1 {
    public static void main(String[] args) {
        FixedCapacityStackOfStrings sampleA = new FixedCapacityStackOfStrings(2);
        StdOut.println("sampleA is full? " + sampleA.isFull());
        StdOut.println("Expected: false\n");

        sampleA.push("apple");
        sampleA.push("banana");
        StdOut.println("sampleA is full? " + sampleA.isFull());
        StdOut.println("Expected: true\n");
    }

    public static class FixedCapacityStackOfStrings {
        private String[] a;
        private int N;

        public FixedCapacityStackOfStrings(int cap) {
            a = new String[cap];
        }

        public boolean isEmpty() {
            return N == 0;
        }

        public int size() {
            return N;
        }

        public void push(String item) {
            a[N++] = item;
        }

        public String pop() {
            return a[--N];
        }

        public boolean isFull() {
            return N == a.length;
        }
    }
}
