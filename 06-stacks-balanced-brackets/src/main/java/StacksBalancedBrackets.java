import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StacksBalancedBrackets {
    public static boolean isBalanced(String expression) {
        Map<String, String> pairs = new HashMap<>();
        pairs.put(")", "(");
        pairs.put("]", "[");
        pairs.put("}", "{");

        Deque<String> stack = new ArrayDeque<>();

        for (String entry: expression.split("")) {
            if (pairs.containsValue(entry)) {
                // input is an opening bracket
                stack.push(entry);
            } else if (!stack.isEmpty() && entry.length() > 0) {
                String s = stack.pop();
                if (!s.equals(pairs.get(entry))) {
                    return false;
                }
            } else if (stack.isEmpty() && pairs.containsKey(entry)) {
                // input starts with a closing bracket
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println((isBalanced(expression)) ? "YES" : "NO");
        }
    }
}
