import java.util.Arrays;
import java.util.Scanner;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(Arrays.stream(new Scanner(System.in).nextLine()
                .split(",")).mapToInt(Integer::parseInt).toArray()));
    }

    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) minPrice = prices[i];
            else maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }
}
