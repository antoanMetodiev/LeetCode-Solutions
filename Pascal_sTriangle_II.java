import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pascal_sTriangle_II {
    public static void main(String[] args) {
        System.out.println(getRow(Integer.parseInt(new Scanner(System.in).nextLine())));
    }

    public static List<Integer> getRow(int rowIndex) {
        rowIndex += 1;
        List<List<Integer>> pascalNumbers = new ArrayList<>();

        for (int i = 0; i < rowIndex; i++) {

            for (int j = 0; j <= i; j++) {
                if (j == 0) pascalNumbers.add(new ArrayList<>(List.of(1)));
                else if (j == i) pascalNumbers.get(i).add(1);
                else {
                    int currentNumber = pascalNumbers.get(i - 1).get(j - 1) + pascalNumbers.get(i - 1).get(j);
                    pascalNumbers.get(i).add(currentNumber);
                }
            }
        }

        return pascalNumbers.get(rowIndex - 1);
    }
}
