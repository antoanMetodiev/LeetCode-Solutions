import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(missingNumber(Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray()));
    }

    public static int missingNumber(int[] nums) {
        List<Integer> allNumbers = new ArrayList<>();
        Arrays.stream(nums).forEach(allNumbers::add);

        for (int i = 0; i <= allNumbers.size(); i++) {
            if (!allNumbers.contains(i)) return i;
        }
        return 0;
    }
}
