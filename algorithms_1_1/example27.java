package algorithms_1_1;

public class example27 {
    private static int count = 0;

    public static void main(String[] args) {
        System.out.println(binomial(100, 50, 0.25));
    }

    public static double binomial(int N, int k, double p) {
        count++;

        // System.out.println("count : " + count);

        if ((N == 0) && (k == 0)) {
            return 1.0;
        }

        if ((N < 0) || (k < 0)) {
            return 0.0;
        }

        return (1 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
    }

    public static double binomial2(int N, int k, double p) {
        double[][] array = new double[N + 1][k + 1];

        for (int i = 0; i < array.length; i++) {
            return 0;
        }
        return p;
    }
}
