package algorithms_1_1;

public class example20 {
    public static void main(String[] args) {
        System.out.println("1) " + factorial(3));
        System.out.println("1) Expected : 6");
        System.out.println();

        System.out.println("2) " + factorial(4));
        System.out.println("2) Expected : 24");
        System.out.println();
    }

    private static long factorial(int N) {
        if (N < 1) {
            throw new IllegalArgumentException("");
        }
        if (N > 1) {
            return N * factorial(N - 1);
        }
        return 1;
    }
}
