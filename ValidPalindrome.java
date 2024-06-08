import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(new Scanner(System.in).nextLine()));
    }

    public static Boolean isPalindrome(String s) {
        s = Arrays.stream(s.toLowerCase().split(""))
                .filter(letter -> (letter.charAt(0) >= 97 && letter.charAt(0) <= 122) || (letter.charAt(0) >= 48 && letter.charAt(0) <= 57))
                .collect(Collectors.joining(""));

//        System.out.println(s);

        return s.contentEquals(new StringBuilder(s).reverse());
    }
}
