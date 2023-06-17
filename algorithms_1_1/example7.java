package algorithms_1_1;

public class example7 {
    public static void main(String[] args) {
        testA();
        testB();
        testC();
    }

    public static void testA() {
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001) {
            t = (9.0/t + t) / 2.0;
            System.out.println("== " + t);
        }
        System.out.println("최종 : " + t);
    }

    public static void testB() {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
                System.out.println("i : " + i + ", j : " + j + ", sum : " + sum);
            }
        }
        System.out.println("testB : " + sum);
    }

    public static void testC() {
        int sum = 0;
        for (int i = 1; i < 1000; i *=2) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        System.out.println("testC : " + sum);
    }
}
