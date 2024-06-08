import java.util.Scanner;

public class FirstOccurrenceInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(strStr(scanner.nextLine(), scanner.nextLine()));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;

        return haystack.indexOf(needle);
    }

}

