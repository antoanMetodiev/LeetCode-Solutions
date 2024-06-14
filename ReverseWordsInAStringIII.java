import java.util.*;
import java.util.stream.Collectors;

public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        System.out.println(reverseWords(new Scanner(System.in).nextLine()));
    }

    public static String reverseWords(String s) {
        return Arrays.stream(s.split("\\s+")).map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}
