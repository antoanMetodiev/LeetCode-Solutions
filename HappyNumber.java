import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(isHappy(Integer.parseInt(scanner.nextLine())));
    }

    public static boolean isHappy(int n) {
        int newNumber = n;
        int count = 0;

        while (newNumber != 1 && newNumber > 0) {

            String currentNumber = newNumber + "";
            int num = 0;
            for (int i = 0; i < currentNumber.length(); i++) {
                num+= Math.pow(Integer.parseInt("" + currentNumber.charAt(i)), 2);
            }

            if (count++ == 8) {
                return false;
            }
            newNumber = num;
        }

        return true;
    }
}
