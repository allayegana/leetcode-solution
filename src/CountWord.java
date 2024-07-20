import java.util.HashMap;
import java.util.Map;

public class CountWord {

    public static void main(String[] args) {
        String[] words = {"apple", "apple", "banana", "apple", "orange", "apple"};

        System.out.println(countWords(words));
    }

    private static Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        return map;
    }


}
