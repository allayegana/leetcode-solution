import java.util.HashMap;

public class CountCharter {


    public static void main(String[] args) {
       String word = "Allaye";
        countCharater(word);
    }

    private static void countCharater(String word) {

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c: word.toLowerCase().toCharArray()) {
            if (c == ' ') continue;
            else if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);

            }else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }
}
