import java.util.Scanner;

public class FindFirstPalindromicStringInTheArray {
    public static void main(String[] args) {
        System.out.println(firstPalindrome(new Scanner(System.in).nextLine().split(",")));
    }

    public static String firstPalindrome(String[] words) {
        for (String word : words) {
            if (word.equals(new StringBuilder(word).reverse() + "")) return word;
        }
        return "";
    }
}
