package algorithms_1_2;

import edu.princeton.cs.algs4.StdOut;

public class example5 {
    public static void main(String[] args) {
        String s = "Hello World";
        s.toUpperCase();    // HELLO WORLD
        s.substring(6, 11); // World
        StdOut.println(s + ", Expected: Hello World");
    }
}
