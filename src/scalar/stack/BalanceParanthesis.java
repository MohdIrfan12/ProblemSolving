package scalar.stack;

import java.util.Stack;

public class BalanceParanthesis {

    public static int solve(String data) {
        Stack<Character> stack = new Stack<>();
        for (Character item : data.toCharArray()) {
            if (item == '{' || item == '(' || item == '[' || stack.isEmpty()) {
                stack.push(item);
                continue;
            }
            if (item == '}' && stack.peek() == '{'
                    || item == ')' && stack.peek() == '('
                    || item == ']' && stack.peek() == '[') {
                stack.pop();
            } else {
                stack.push(item);
            }
        }
        if (stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(solve("{([])}"));
        System.out.println(solve("(){"));
        System.out.println(solve("()[]"));
    }
}
