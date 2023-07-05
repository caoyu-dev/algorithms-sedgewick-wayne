package algorithms_1_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class example15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        String line = br.readLine();
        String[] arr = line.split(" ");

        Queue<String> queue = generateQueue(arr);
        printKthFromLast(k, arr, queue);
    }

    private static void printKthFromLast(int k, String[] arr, Queue<String> queue) {
        int count = 0;

        for (String s : arr) {
            count++;

            if (count == queue.size() - (k - 1)) {
                System.out.println(s);
                break;
            }
        }
    }

    private static Queue<String> generateQueue(String[] arr) {
        Queue<String> queue = new LinkedList<>();

        for (String q : arr) {
            queue.add(q);
        }
        return queue;
    }
}
