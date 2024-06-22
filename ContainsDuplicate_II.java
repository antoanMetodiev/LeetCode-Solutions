import java.util.Arrays;
import java.util.Scanner;

public class ContainsDuplicate_II {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(containsNearbyDuplicate((Arrays.stream(scanner.nextLine().split(","))
                .mapToInt(Integer::parseInt).toArray()), Integer.parseInt(scanner.nextLine())));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                    return true;
                }
                if (Math.abs(i - j) > k) break;
            }
        }

        return false;
    }
}
