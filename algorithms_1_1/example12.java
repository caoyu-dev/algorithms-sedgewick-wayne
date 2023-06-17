package algorithms_1_1;

public class example12 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
            System.out.println("i : " + i + ", a[" + i + "] : " + a[i]);
        }
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
            System.out.println("i : " + i + ", a[" + a[i] + "] : " + a[a[i]]);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("a[" + i + "] : " + a[i]);
        }
    }
}
