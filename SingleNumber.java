import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(Arrays.stream(new Scanner(System.in).nextLine()
                .split(",")).mapToInt(Integer::parseInt).toArray()));
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> nonUniqueNumbers = new HashMap<>();
        for (int num : nums) {
            if (!nonUniqueNumbers.containsKey(num)) nonUniqueNumbers.put(num, 1);
            else nonUniqueNumbers.put(num, nonUniqueNumbers.get(num) + 1);
        }

        for (int key : nonUniqueNumbers.keySet()) {
            if (nonUniqueNumbers.get(key) == 1) return key;
        }
        return 0;
    }
}
