import java.util.HashSet;

public class NotDuplicateCharaters {

    public static void main(String[] args) {
        String word = "ALLAYE";

        String s = removeDuplicates(word);
        System.out.println(s);
        StringBuilder s1 = notCharacterDuplicateUsedStream1Line(word);
        System.out.println(s1);

        System.out.print(notCharacterDuplicate(word));
    }

    private static StringBuilder notCharacterDuplicateUsedStream1Line(String word) {

        StringBuilder sb = new StringBuilder();

        word.chars().distinct().forEach(c -> sb.append((char) c));

        //System.out.println(sb);


        return sb;
    }

    private static String removeDuplicates(String name) {
        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (char c : name.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                result.append(c);
            }
        }

        return result.toString();
    }

    private static String notCharacterDuplicate(String word) {

        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for (char c : word.toCharArray()) {

            if (set.add(c)) {
                sb.append(c);
            }


        }

        return sb.toString();
    }
}
