import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(Integer.parseInt(new Scanner(System.in).nextLine())));
    }

    public static int addDigits(int num) {
        while ((num + "").length() > 1) {
            int current = 0;
            for (int i = 0; i < (num + "").length(); i++) {
                current += Integer.parseInt((num + "").charAt(i) + "");
            }
            num = current;
        }
        return num;
    }
}
