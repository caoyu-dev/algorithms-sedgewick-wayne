package algorithms_1_2;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class example1 {
    public static void main(String[] args) {
//        int N = Integer.parseInt("5");
        int N = Integer.parseInt(args[0]);
        Point2D[] points = new Point2D[N];

        drawPoint2D(N, points);
        calculatePoints(N, points);
    }

    private static void calculatePoints(int N, Point2D[] points) {
        if (N > 1) {
            double minDistance = points[0].distanceTo(points[1]);
            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    double distance = points[i].distanceTo(points[j]);
                    if (distance < minDistance) {
                        minDistance = distance;
                    }
                }
            }
            StdOut.println("가장 가까이 있는 두 점의 거리 : " + minDistance);
        } else {
            StdOut.println("점이 최소 2개 이상 있어야 계산이 가능합니다.");
        }
    }

    private static void drawPoint2D(int N, Point2D[] points) {
        for (int i = 0; i < N; i++) {
            double x = StdRandom.uniformDouble();
            double y = StdRandom.uniformDouble();
            points[i] = new Point2D(x, y);
        }
    }
}
