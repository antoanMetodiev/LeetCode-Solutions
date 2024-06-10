import java.util.*;

public class WordPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(wordPattern(scanner.nextLine(), scanner.nextLine()));
    }

    public static boolean wordPattern(String pattern, String s) {
        Map<String, List<Integer>> patternData = new LinkedHashMap<>();
        String[] patternLetters = pattern.split("");

        // Find pattern data:
        for (int i = 0; i < patternLetters.length; i++) {
            if (!patternData.containsKey(patternLetters[i])) {

                patternData.put(patternLetters[i], new ArrayList<>());
                patternData.get(patternLetters[i]).add(i);

            } else patternData.get(patternLetters[i]).add(i);
        }

        return checkIfTheyHaveEqualsPatterns(patternData, s);
    }

    private static boolean checkIfTheyHaveEqualsPatterns(Map<String, List<Integer>> patternData, String s) {
        String[] text = s.split(" ");

        Map<String, List<Integer>> stringData = new LinkedHashMap<>();
        for (int i = 0; i < text.length; i++) {
            if (!stringData.containsKey(text[i])) {

                stringData.put(text[i], new ArrayList<>());
                stringData.get(text[i]).add(i);

            } else stringData.get(text[i]).add(i);
        }

        // finally check:
        if(patternData.size() != stringData.size()) return false;

        String stringDataResult = "";
        for (List<Integer> stringDataValue : stringData.values()) {
            for (int i = 0; i < stringDataValue.size(); i++) {
                stringDataResult += stringDataValue.get(i);
            }
        }

        String patternDataResult = "";
        for (List<Integer> patternDataValue : patternData.values()) {
            for (int i = 0; i < patternDataValue.size(); i++) {
                patternDataResult += patternDataValue.get(i);
            }
        }

        
        return patternDataResult.equals(stringDataResult);
    }
}
