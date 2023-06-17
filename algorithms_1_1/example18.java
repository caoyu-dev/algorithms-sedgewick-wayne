package algorithms_1_1;

public class example18 {
    public static void main(String[] args) {
        System.out.println(mystery(2, 25));     // 50
        System.out.println(mystery(3, 11));     // 33
        System.out.println();

        System.out.println(mysteryB(2, 25));    // 33554432
        System.out.println(mysteryB(3, 11));    // 177147
    }

    private static int mystery(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b % 2 == 0) {
            return mystery(a + a, b / 2);
        }
        return mystery(a + a, b /2) + a;
    }

    private static int mysteryB(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            return mysteryB(a *a, b / 2);
        }
        return mysteryB(a * a, b /2) * a;
    }
}
