import java.util.Scanner;

public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(Integer.parseInt(new Scanner(System.in).nextLine())));
    }

    public static int arrangeCoins(int n) {
        int count = 0;

        int lastI = 0;
        for (int i = 1; i <= n; i++) {
            n -= i;
            count++;
            lastI = i;
        }

        if (n == 0 || (n - lastI <= 0)) {
            return count;
        } else if (n < 0) {
            return --count;
        }

        return -1;
    }
}