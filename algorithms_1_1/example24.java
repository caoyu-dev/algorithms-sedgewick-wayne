package algorithms_1_1;

public class example24 {
    public static void main(String[] args) {
        int gcd = gcd(105, 24);

        System.out.println(gcd);
        System.out.println();

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int gcd2 = gcd(num1, num2);
        System.out.println("gcd2 : " + gcd2);
        System.out.println();

        int gcd3 = gcd(1111111, 1234567);
        System.out.println("gcd3 : " + gcd3);
        System.out.println();
    }

    public static int gcd(int p, int q) {
        // 105, 24
        System.out.println("p : " + p + ", q : " + q);
        // p : 105, q : 24

        if (q == 0) {
            return p;
        }
        // r = 105 / 24 = 24 * 4 + 9 => 9
        int r = p % q;
        // gcd(24, 9)
        return gcd(q, r);
    }
}
