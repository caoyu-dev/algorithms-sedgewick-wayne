package algorithms_1_2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class example15 {
    public static int[] readAllInts(String name) {
        In in = new In(name);
        String input = in.readAll();
        String[] words = input.split("\\s+");
        int[] ints = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            ints[i] = Integer.parseInt(words[i]);
        }
        return ints;
    }

    public static void main(String[] args) {
        String location = "/Users/caoyu/algorithms-sedgewick-wayne/algorithms_1_2/hello.txt";

        int[] result = example15.readAllInts(location);
        int[] expected = new int[]{1, 2, 3, 4, 5};

        StdOut.println("Result: " + Arrays.toString(result)
                + ", Expected: " + Arrays.toString(expected));
    }
}
