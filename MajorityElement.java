import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2, 2}));
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int num : nums) {
            if (!occurrences.containsKey(num)) occurrences.put(num, 1);
            else occurrences.put(num, occurrences.get(num) + 1);
        }

        int requiredValue = (int) Math.ceil(nums.length / 2.00);
        for (int value : occurrences.keySet()) {
            if (occurrences.get(value) >= requiredValue) return value;
        }
        return 0;
    }
}
