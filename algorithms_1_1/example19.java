package algorithms_1_1;

public class example19 {
    // 꼬리재귀로 풀면 풀려요
    public static void main(String[] args) {
        for (int N = 0; N < 90; N++) {
            System.out.println(N + " " + F(N));
        }
    }

    private static long F(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        return F(N - 1) + F(N - 2);
    }
}
