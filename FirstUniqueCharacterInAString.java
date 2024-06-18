import java.util.*;

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        System.out.println(firstUniqChar(new Scanner(System.in).nextLine()));
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> uniqueLetters = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!uniqueLetters.containsKey(s.charAt(i))) uniqueLetters.put(s.charAt(i), 1);
            else uniqueLetters.put(s.charAt(i), uniqueLetters.get(s.charAt(i)) + 1);
        }

        Integer value = uniqueLetters.keySet().stream().filter(key -> uniqueLetters.get(key) == 1).map(s::indexOf).findFirst().orElse(null);
        if (value == null) return -1;
        return value;
    }
}
