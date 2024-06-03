import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(Integer.parseInt(new Scanner(System.in).nextLine())));
    }

    public static boolean isPalindrome(int x) {
        if (("" + x).contains("-")) return false;
        return Long.parseLong(new StringBuilder("" + x).reverse().toString()) == x;
    }
}
