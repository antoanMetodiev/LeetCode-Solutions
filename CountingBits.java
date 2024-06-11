import java.util.Arrays;
import java.util.Scanner;

public class CountingBits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(Integer.parseInt(new Scanner(System.in).nextLine()))));
    }

    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            ans[i] = countOnes(i);
        }
        return ans;
    }

    private static int countOnes(int number) {
        int count = 0;
        while (number != 0) {
            count += number & 1;
            number >>= 1;
        }
        return count;
    }
}
