import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class DistributeCandies {
    public static void main(String[] args) {
        System.out.println(distributeCandies(Arrays.stream(new Scanner(System.in).nextLine().split(",")).mapToInt(Integer::parseInt).toArray()));
    }

    public static int distributeCandies(int[] candyType) {
        Set<Integer> uniqueCandies = Arrays.stream(candyType).boxed().collect(Collectors.toSet());
        if ((candyType.length / 2) > uniqueCandies.size()) return uniqueCandies.size();
        return candyType.length / 2;
    }
}
