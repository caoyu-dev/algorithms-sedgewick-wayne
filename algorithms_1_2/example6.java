package algorithms_1_2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class example6 {
    public static void main(String[] args) {
        StdOut.println("첫 번째 문자열을 입력하세요:");
        String first = StdIn.readLine();
        StdOut.println("두 번째 문자열을 입력하세요:");
        String second = StdIn.readLine();

        StdOut.println(isCircularShift(first, second));
    }

    public static boolean isCircularShift(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        String doubled = second + second;
        return doubled.contains(first);
    }
}
