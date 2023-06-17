package algorithms_1_1;

import java.util.Scanner;

public class example21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String name = scanner.next();
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            double result = (double) num1 / num2;

            System.out.printf("%s %d %d %.3f\n", name, num1, num2, result);
            System.out.println();
        }

        scanner.close();
    }
}
