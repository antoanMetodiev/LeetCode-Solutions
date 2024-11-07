import java.util.Arrays;
import java.util.Scanner;

public class AsignCookies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                findContentChildren(Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray(),
                        Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray())
        );
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int childIndex = 0;
        int cookieIndex = 0;
        while (childIndex < g.length && cookieIndex < s.length) {
            if (s[cookieIndex] >= g[childIndex]) childIndex++;
            cookieIndex++;
        }

        return childIndex;
    }
}