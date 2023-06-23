package algorithms_1_2;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

public class example10 {
    private int N;
    private int max;
    private int operationCount;
    private int counter;

    public example10(int N, int max) {
        this.N = N;
        this.max = max;
        this.operationCount = 0;
        this.counter = 0;
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(-max, max);
        StdDraw.setPenRadius(0.015);
    }

    public void increment() {
        if (operationCount < N && counter < max) {
            counter++;
            operationCount++;
            StdOut.println("카운터 값이 증가 했습니다. : " + counter);
            StdDraw.point(operationCount, counter);
        } else {
            StdOut.println("카운터 값이 더이상 증가 할 수 없습니다.");
            StdDraw.point(operationCount, counter);
        }
    }

    public void decrement() {
        if (operationCount < N && counter > -max) {
            counter--;
            operationCount++;
            StdOut.println("카운터 값이 감소 했습니다. : " + counter);
            StdDraw.point(operationCount, counter);
        } else {
            StdOut.println("카운터 값이 더이상 감소 할 수 없습니다.");
            StdDraw.point(operationCount, counter);
        }
    }

    public static void main(String[] args) {
        example10 example10 = new example10(10, 5);
        example10.increment();
        example10.increment();
        example10.decrement();
        example10.increment();
        example10.increment();
        example10.increment();
        example10.decrement();
        example10.decrement();
        example10.decrement();
        example10.decrement();
    }
}
