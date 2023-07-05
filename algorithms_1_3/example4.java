package algorithms_1_3;

import java.io.*;
import java.util.Stack;

public class example4 {
    // [()]{} {[()()]()}
    // {[[]}]
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        char[] parentheses = input.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char ch : parentheses) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (!stack.isEmpty()) {
                    char character = stack.peek();

                    if (ch == ')' && character == '('
                            || ch == '}' && character == '{'
                            || ch == ']' && character == '[') {
                        stack.pop();
                    }

                } else {
                    stack.push(ch);
                    break;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("true\n");
        } else {
            System.out.println("false\n");
        }
    }
}
