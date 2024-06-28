import java.util.Scanner;

public class NumberOf_1_Bits {
    public static void main(String[] args) {
        System.out.println(hammingWeight(Integer.parseInt(new Scanner(System.in).nextLine())));
    }

    public static int hammingWeight(int n) {
        String binaryNum = "";

        while (n > 0) {
            binaryNum += (n % 2) + "";
            n /= 2;
        }
        return binaryNum.replace("0", "").length();
    }
}
