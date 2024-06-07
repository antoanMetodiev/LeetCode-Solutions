import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(Arrays.stream(new Scanner(System.in).nextLine().split(","))
                .mapToInt(Integer::parseInt).toArray()));
    }

    public static boolean containsDuplicate(int[] nums) {
       Set<Integer> uniqueNumbers  = new HashSet<Integer>();
       Arrays.stream(nums).forEach(uniqueNumbers::add);
       return uniqueNumbers.size() < nums.length;
    }
}
