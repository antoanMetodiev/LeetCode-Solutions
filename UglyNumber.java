import java.util.Scanner;

public class UglyNumber {
    public static void main(String[] args) {
        System.out.println(isUgly(Integer.parseInt(new Scanner(System.in).nextLine())));
    }

    public static boolean isUgly(int n) {
        if (n <= 0) return false;

        int[] primeFactors = {2, 3, 5};
        for (int factor : primeFactors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }
}
