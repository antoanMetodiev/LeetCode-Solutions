import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.toString(twoSum(Arrays.stream(scanner.nextLine()
                .split("\\s+")).mapToInt(Integer::parseInt).toArray(), Integer.parseInt(scanner.nextLine()))));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return null;
    }
}
