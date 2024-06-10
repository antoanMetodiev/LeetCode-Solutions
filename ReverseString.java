import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        reverseString(new char[]{'a', 'b', 'v', 'g'});
    }

    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char currentSymbol = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = currentSymbol;
        }
    }
}
