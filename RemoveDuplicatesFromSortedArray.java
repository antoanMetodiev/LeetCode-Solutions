import java.util.*;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(Arrays.stream(new Scanner(System.in).nextLine().split(",")).mapToInt(Integer::parseInt).toArray()));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return j;
    }
}
