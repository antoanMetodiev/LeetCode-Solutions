import java.util.Scanner;

public class ToLowerCase {
    public static void main(String[] args) {
        System.out.println(toLowerCase(new Scanner(System.in).nextLine()));
    }

    public static String toLowerCase(String s) {
        return s.toLowerCase();
    }
}