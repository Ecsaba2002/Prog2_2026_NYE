import java.util.HashMap;
import java.util.Map;

public class Main3 {

    public static Map<String, Integer> countWords(String sentence) {
        Map<String, Integer> wordCount = new HashMap<>();

        String[] words = sentence.toLowerCase()
                .replaceAll("[^a-záéíóöőúüű0-9 ]", "")
                .split("\\s+");

        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }

            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        return wordCount;
    }

    public static void main(String[] args) {
        String input = "Ez egy teszt mondat, ez pedig egy másik teszt mondat.";
        Map<String, Integer> result = countWords(input);

        System.out.println("Szógyakoriság:");
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
