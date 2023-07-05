package algorithms_1_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class example10_re {

    // cannot solve it
    public static String getInfixToPostfix(String input) {
        Stack<String> operands = new Stack<>();
        Stack<String> operators = new Stack<>();

        String[] value = input.split(" ");

        for (int i = 0; i < value.length; i++) {
            if (getProcedure(value[i]) == 1) {
                operators.push(value[i]);
            } else if (getProcedure(value[i]) == 2) {
                if (operators.isEmpty()) {
                    String op1 = operands.pop();
                    String operator = value[i];
                    String op2 = value[i + 1];
                }
            }
        }
        return null;
    }

    private static int getProcedure(String operator) {
        switch (operator) {
            case "+", "-": return 1;
            case "*", "/": return 2;
        }
        return -1;
    }

    // 3 + 4 * 5 / 6
    // 3 4 5 * 6 / +
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        System.out.println(getInfixToPostfix(line));
    }
}
