import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciNumber {
    private static final List<Integer> allFibNumbers = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(fib(Integer.parseInt(new Scanner(System.in).nextLine())));
    }

    public static int fib(int n) {
        if (n == 0) return 0;
        allFibNumbers.add(0);
        allFibNumbers.add(1);
    
        for (int i = 2; i < n; i++) {
            allFibNumbers.add(getFibonacci());
        }
        return allFibNumbers.get(allFibNumbers.size() - 1) + allFibNumbers.get(allFibNumbers.size() - 2);
    }

    private static int getFibonacci() {
        return allFibNumbers.get(allFibNumbers.size() - 1) + allFibNumbers.get(allFibNumbers.size() - 2);
    }
}
