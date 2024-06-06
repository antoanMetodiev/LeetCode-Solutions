import java.util.*;
import java.util.stream.Collectors;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(searchInsert(Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray()
                , Integer.parseInt(scanner.nextLine())));
    }

    public static int searchInsert(int[] nums, int target) {
        List<Integer> numbers = new ArrayList<>();
        Arrays.stream(nums).forEach(numbers::add);

        int index = numbers.indexOf(target);
        if (index == -1) {
            numbers.add(target);
            return numbers.stream().sorted(Integer::compare).toList().indexOf(target);
        }
        return index;
    }

}

