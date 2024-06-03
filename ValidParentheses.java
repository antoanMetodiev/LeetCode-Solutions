import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid(new Scanner(System.in).nextLine()));
    }

    public static boolean isValid(String s) {
        Deque<Character> openedBrackets = new ArrayDeque<>();
        for (char symbol : s.toCharArray()) {
            if (symbol == '(' || symbol == '{' || symbol == '[') {
                openedBrackets.push(symbol);
                continue;
            }

            if (openedBrackets.isEmpty()) return false; // check if string start with closedBracket!

            char openBracket = openedBrackets.pop();
            if ((openBracket == '[' && symbol != ']') || (openBracket == '{' && symbol != '}')
                    || (openBracket == '(' && symbol != ')')) {
                return false;
            }
        }
        return openedBrackets.isEmpty();
    }
}