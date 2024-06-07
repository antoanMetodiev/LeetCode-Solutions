import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pascal_sTriangle {
    public static void main(String[] args) {
        System.out.println(generate(Integer.parseInt(new Scanner(System.in).nextLine())));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalNumbers = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {

            List<Integer> numbers = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) numbers.add(1);
                else {
                    numbers.add(pascalNumbers.get(i - 1).get(j - 1) + pascalNumbers.get(i - 1).get(j));
                }
            }
            pascalNumbers.add(numbers);
        }
        return pascalNumbers;
        
    }
}

