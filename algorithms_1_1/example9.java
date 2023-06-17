package algorithms_1_1;

public class example9 {
    public static void main(String[] args) {
        System.out.println("1) " + toBinaryString(4));
        System.out.println("1) Expected: 100");
        System.out.println("2) " + toBinaryString(7));
        System.out.println("2) Expected: 111");
        System.out.println("3) " + toBinaryString(32));
        System.out.println("3) Expected: 100000");
    }

    private static String toBinaryString(int n) {
        int value = n / 2;
        int remain = n % 2;

        if (value > 1) {
            return toBinaryString(value) + remain;
        }

        return String.valueOf(value) + remain;
    }
}
