package algorithms_1_1;

public class example26 {
    public static void main(String[] args) {
        int a = 100;
        int b = 70;
        int c = 50;
        int t = 30;

        if (a > b) {
            t = a; // t = 100
            a = b; // a = 70
            b = t; // b = 100
            System.out.println("1) a : " + a + ", b : " + b + ", t : " + t);
        }
        // 70 > 50
        if (a > c) {
            t = a; // t = 70
            a = c; // a = 50
            c = t; // c = 70
            System.out.println("2) a : " + a + ", c : " + c + ", t : " + t);
        }
        // 100 > 70
        if (b > c) {
            t = b; // t = 100
            b = c; // b = 70
            c = t; // c = 100
            System.out.println("3) b : " + b + ", c : " + c + ", t : " + t);
        }

        System.out.println("4) a : " + a + ", b : " + b + ", c : " + c);
    }
}
