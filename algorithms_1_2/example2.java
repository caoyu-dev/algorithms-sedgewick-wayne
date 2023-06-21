package algorithms_1_2;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class example2 {
    // echo "0.1 0.5 0.4 0.9 0.7 1.3" | java -classpath ".:./*" algorithms_1_2.example2 3
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Interval1D[] intervals = new Interval1D[N];

        for (int i = 0; i < N; i++) {
            double lo = StdIn.readDouble();
            double hi = StdIn.readDouble();
            intervals[i] = new Interval1D(lo, hi);
        }

        Arrays.sort(intervals, (o1, o2) -> {
            if (o1.min() < o2.min()) {
                return -1;
            } else if (o1.min() > o2.min()) {
                return 1;
            } else {
                if (o1.max() < o2.max()) {
                    return -1;
                } else if (o1.max() > o2.max()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        for (int i = 0; i < N - 1; i++) {
            if (intervals[i].intersects(intervals[i + 1])) {
                StdOut.println(intervals[i] + "와(과) " + intervals[i + 1] + "은(는) 서로 교차한다.");
            }
        }

//        if (N > 1) {
//            for (int i = 0; i < N - 1; i++) {
//                for (int j = i + 1; j < N; j++) {
//                    if (intervals[i].intersects(intervals[j])) {
//                        StdOut.println(intervals[i] + "와(과) " + intervals[j] + "은(는) 서로 교차한다.");
//                    }
//                }
//            }
//        }
    }
}
