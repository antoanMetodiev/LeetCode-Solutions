import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        System.out.println(reverseVowels(new Scanner(System.in).nextLine()));
    }

    public static String reverseVowels(String s) {
        String allVowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            if (allVowels.indexOf(chars[left]) == -1) {
                left++;
                continue;
            }
            if (allVowels.indexOf(chars[right]) == -1) {
                right--;
                continue;
            }
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
