import java.util.*;
import java.util.stream.Collectors;

public class FindCommonCharacters {
    public static void main(String[] args) {
        commonChars(new Scanner(System.in).nextLine().split(",")).forEach(letter -> System.out.print(letter + " "));
    }

    public static List<String> commonChars(String[] words) {
        List<String> commonChars = new ArrayList<>();
        List<String> inputWords = new ArrayList<>(List.of(words));

        for (int i = 0; i < inputWords.get(0).length(); i++) {

            char currentLetter = inputWords.get(0).charAt(i);
            int insideCount = 0;
            for (int j = 0; j < inputWords.size(); j++) {

                if (inputWords.get(j).contains("" + currentLetter)) {
                    String replacement = inputWords.get(j).replaceFirst("" + currentLetter, "0");
                    inputWords.set(j, replacement);
                    insideCount++;
                    continue;
                }
                break;
            }

            if (insideCount == words.length) commonChars.add("" + currentLetter);
        }

        return commonChars.stream().filter(e-> !e.equals("0")).collect(Collectors.toList());
    }
}
