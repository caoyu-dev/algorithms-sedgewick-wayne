package algorithms_1_2;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class example9 {
    public static void main(String[] args) {
        int[] allowlist = new int[args.length - 1];
        for (int i = 0; i < args.length - 1; i++) {
            allowlist[i] = Integer.parseInt(args[i]);
        }

        Counter counter = new Counter("counter examine");
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, allowlist, counter) == -1) {
                StdOut.println(key);
            }
        }
        StdOut.println(counter);
    }

    private static int rank(int key, int[] a, Counter counter) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            counter.increment();
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
