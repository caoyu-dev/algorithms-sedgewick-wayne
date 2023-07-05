package algorithms_1_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class example9 {
    public static String getBalancedExpression(String input) {
        String[] line = input.split(" ");
        Stack<String> stack = new Stack<>();

        for (String ch : line) {
            if (!ch.equals(")")) {
                stack.push(ch);
            } else {
                String op1 = stack.pop();
                String operator = stack.pop();
                String op3 = stack.pop();
                String expression = "( " + op3 + " " + operator + " " + op1 + " )";
                stack.push(expression);
            }
        }
        return stack.pop();
    }

    // 1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )
    // 1 + 2 ) * 3 + 4 ) ) * 3 - 4 ) * 5 - 6 ) ) )
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        System.out.println(getBalancedExpression(line));
    }
}
