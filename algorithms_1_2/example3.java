package algorithms_1_2;

import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.StdRandom;

public class example3 {
    // cannot solve
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double min = Double.parseDouble(args[1]);
        double max = Double.parseDouble(args[2]);

        Interval2D[] intervals = new Interval2D[N];

        for (int i = 0; i < N; i++) {
            double xmin = StdRandom.uniformDouble(min, max);
            double ymin = StdRandom.uniformDouble(min, max);
        }
    }
}
