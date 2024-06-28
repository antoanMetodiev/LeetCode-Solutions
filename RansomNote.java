import java.util.Scanner;

public class RansomNote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(canConstruct(scanner.nextLine(), scanner.next()));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        for (String letter : ransomNote.split("")) {
            if (magazine.contains(letter)) magazine = magazine.replaceFirst(letter, "");
            else return false;
        }

        return true;
    }
}
