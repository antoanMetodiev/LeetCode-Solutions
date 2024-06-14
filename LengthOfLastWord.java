import java.util.Scanner;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(new Scanner(System.in).nextLine()));
    }

    public static int lengthOfLastWord(String s) {
        String[] arr = s.split("\\s+");
        return arr[arr.length - 1].length();
    }
}
