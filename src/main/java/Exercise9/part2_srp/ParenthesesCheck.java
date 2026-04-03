package Exercise9.part2_srp;
import java.util.*;

public class ParenthesesCheck {
    public static void main(String[] args) {
        // try-with-resources 写法：程序结束会自动关闭Scanner，彻底解决警告
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter parentheses: ");
            String str = sc.nextLine();

            Deque<Character> stack = new ArrayDeque<>();
            boolean balanced = true;

            for (char c : str.toCharArray()) {
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        balanced = false;
                        break;
                    }
                    char top = stack.pop();
                    if (!isMatch(top, c)) {
                        balanced = false;
                        break;
                    }
                }
            }

            if (!stack.isEmpty()) {
                balanced = false;
            }

            System.out.println(balanced ? "Balanced" : "Not balanced");
        }
    }

    private static boolean isMatch(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
}