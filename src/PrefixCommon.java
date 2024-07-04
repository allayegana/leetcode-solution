public class PrefixCommon {

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        // Edge case: If the input array is empty, return an empty string.
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Start with the first string as the initial prefix.
        String prefix = strs[0];

        // Compare the prefix with each subsequent string.
        for (int i = 1; i < strs.length; i++) {
            // Reduce the prefix until it matches the beginning of the current string.
            while (strs[i].indexOf(prefix) != 0) {
                // Reduce the prefix by one character from the end.
                prefix = prefix.substring(0, prefix.length() - 1);
                // If the prefix becomes empty, there is no common prefix.
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        // Return the remaining prefix.
        return prefix;
    }
}
