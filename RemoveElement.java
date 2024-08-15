import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(removeElement((Arrays.stream(scanner.nextLine().split(","))
                .mapToInt(Integer::parseInt).toArray()), Integer.parseInt(scanner.nextLine())));
    }

    public static int removeElement(int[] nums, int val) {
        List<Integer> notEqualNumbers = Arrays.stream(nums).filter(el -> el != val).boxed().collect(Collectors.toList());

        int saveNotEqualNumbersInitSize = notEqualNumbers.size();
        for (int i = 0; i < nums.length; i++) {
            if (i <= saveNotEqualNumbersInitSize - 1) {
                nums[i] = notEqualNumbers.remove(0);
            } else {
                nums[i] = val;
            }
        }

        return saveNotEqualNumbersInitSize;
    }
}
