import java.util.Scanner;

public class FirstLetterToAppearTwice {
    public static void main(String[] args) {
        System.out.println(repeatedCharacter(new Scanner(System.in).nextLine()));
    }

    public static char repeatedCharacter(String s) {
        String letters = "";

        for (String letter : s.split("")) {
            if (!letters.contains(letter)) letters += letter + " ";
            else return letter.charAt(0);
        }
        return '0';
    }
}
