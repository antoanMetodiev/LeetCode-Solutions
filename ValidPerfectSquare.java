import java.text.DecimalFormat;
import java.util.Scanner;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(Integer.parseInt(new Scanner(System.in).nextLine())));
    }

    public static boolean isPerfectSquare(int num) {
        return !new DecimalFormat("0.#################################").format((Math.sqrt(num))).contains(".");
    }
}
