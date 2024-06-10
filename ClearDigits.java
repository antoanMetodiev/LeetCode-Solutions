import java.util.Scanner;

public class ClearDigits {
    public static void main(String[] args) {
        System.out.println(clearDigits(new Scanner(System.in).nextLine()));
    }

    public static String clearDigits(String s) {
        StringBuilder sb = new StringBuilder(s);

        while (true) {
            int digitIndex = -1;

            for (int i = 0; i < sb.length(); i++) {
                if (Character.isDigit(sb.charAt(i))) {
                    digitIndex = i;
                    break;
                }
            }

            if (digitIndex == -1) break;

            int nonDigitIndex = -1;
            for (int i = digitIndex - 1; i >= 0; i--) {
                if (!Character.isDigit(sb.charAt(i))) {
                    nonDigitIndex = i;
                    break;
                }
            }

            sb.deleteCharAt(digitIndex);
            if (nonDigitIndex != -1) sb.deleteCharAt(nonDigitIndex);
        }

        return sb.toString();
    }
}
