package algorithms_1_1;

public class example17 {
    public static void main(String[] args) {
        System.out.println(exR2(3));    // stackOverflowError occurs
    }

    private static String exR2(int n) {
        String s = exR2(n - 3) + n + exR2(n - 2) + n;
        if (n <= 0) {
            return "";
        }
        return s;
    }
}
