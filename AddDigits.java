import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(Integer.parseInt(new Scanner(System.in).nextLine())));
    }

    public static int addDigits(int num) {
        String numString = num + "";
        while (numString.length() > 1) {
            int current = 0;
            for (int i = 0; i < numString.length(); i++) {
                current += Integer.parseInt((numString).charAt(i) + "");
            }
            num = current;
            numString = "" + num;
        }
        return num;
    }
}
