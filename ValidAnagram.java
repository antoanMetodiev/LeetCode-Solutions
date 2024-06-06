import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(isAnagram(scanner.nextLine(), scanner.nextLine()));
    }

    public static boolean isAnagram(String s, String t) {
        List<String> sLetters = Arrays.stream(s.split("")).collect(Collectors.toList());
        List<String> tLetters = Arrays.stream(t.split("")).collect(Collectors.toList());

        if (sLetters.size() != tLetters.size()) return false;

        for (int i = 0; i < sLetters.size(); i++) {
            if (tLetters.contains(sLetters.get(i))) tLetters.remove(sLetters.get(i));
            else return false;
        }
        return true;
    }
}
