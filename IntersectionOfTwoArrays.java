import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> uniqueNumbers1 = new HashSet<>();
        Set<Integer> uniqueNumbers2 = new HashSet<>();
        Arrays.stream(nums1).forEach(uniqueNumbers1::add);
        Arrays.stream(nums2).forEach(uniqueNumbers2::add);

        List<Integer> allCommonNumbers = new ArrayList<>();
        for (int num : uniqueNumbers1) {
            if (uniqueNumbers2.contains(num)) allCommonNumbers.add(num);
        }

        return allCommonNumbers.stream().mapToInt(e -> e).toArray();
    }
}
