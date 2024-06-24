import java.util.Scanner;

public class IsSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(isSubsequence(scanner.nextLine(), scanner.nextLine()));
    }

    public static boolean isSubsequence(String s, String t) {
        s = String.format("\" %s \"", s);
        t = String.format("\" %s \"", t);

        int index = 0;
        String result = "";
        for (String mainSymbol : s.split("")) {
            if (t.indexOf(mainSymbol, index) == -1) return false;
            result += t.charAt(t.indexOf(mainSymbol, index)) + "";
            index = t.indexOf(mainSymbol, index);
            if ((result.charAt(result.length() - 1) + "").equals(mainSymbol)) index++;
        }

        return result.equals(s);
    }
}
