public class MergeStringsAlt {
    // 1768. Merge Strings Alternately
    // https://leetcode.com/problems/merge-strings-alternately/
    // Split both strings.
    // Init a StringBuilder.
    // Iterate through both strings until one of the strings has been finished by
    // alternating.
    // After that, append the rest of the remaining parts of the string to the
    // merged string.
    // Return the merged string.

    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        StringBuilder str = new StringBuilder();

        while (i < word1.length() && i < word2.length()) {
            str.append(word1.charAt(i));
            str.append(word2.charAt(i));
            i++;
        }

        if (i < word1.length()) {
            str.append(word1.substring(i));
        }

        if (i < word2.length()) {
            str.append(word2.substring(i));
        }

        return str.toString();
    }
}