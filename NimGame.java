import java.util.Scanner;

public class NimGame {
    public static void main(String[] args) {
        System.out.println(canWinNim(Integer.parseInt(new Scanner(System.in).nextLine())));
    }

    public static boolean canWinNim(int n) {
        return n % 4 != 0;  // because we move for each game with 4.
        // examples:
        // n = 4; -> i move 1, he move 3 -> he win;
        // n = 8; => i move 1, he move 3, and now n == 4; -> i move 2, he move 2 and again he win
        // n = 12; => i move 1, he move 3, and now n == 8; -> i move 2, he move 2; n == 4; -> now i move 3, he move 1 and again he win!

        // In all cases when "n" can't be divided on 4, i will win
    }
}
