package algorithms_1_1;

public class example14 {
    public static void main(String[] args) {
        System.out.println("1) " + lg(16));
        System.out.println("1) Expected : 4");
        System.out.println("2) " + lg(15));
        System.out.println("2) Expected : 3");
        System.out.println("3) " + lg(7));
        System.out.println("3) Expected : 2");
    }

    private static int lg(int N) {
        if (N < 0) {
            throw new IllegalArgumentException("");
        }

        int count = 0;

        while (N > 1) {
            N = N / 2;
            count++;
        }
        return count;
    }
}
