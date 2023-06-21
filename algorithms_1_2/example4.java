package algorithms_1_2;

import edu.princeton.cs.algs4.StdOut;

public class example4 {
    public static void main(String[] args) {
        String string1 = "hello";   // string1: hello
        String string2 = string1;   // string1: hello, string2: hello
        string1 = "world";          // string1: world, string2: hello
        StdOut.println(string1 + ", Expected: world");
        StdOut.println(string2 + ", Expected: hello");
    }
}
