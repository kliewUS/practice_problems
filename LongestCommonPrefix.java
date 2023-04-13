public class LongestCommonPrefix {
    // 14. Longest Common Prefix
    // https://leetcode.com/problems/longest-common-prefix/description/
    // First, we sort the list since all strings have to have the prefix of the
    // first and last string.
    // Initalize a counter and twos strings containing the first and last string.
    // While the counter is less than the length of the the first string
    // Check if the the both characters of the two strings match, if they do,
    // increment the counter by 1.
    // If not, return the prefix.
    // If the loop finishes without returning, then return the prefix.

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int index = 0;
        String first = strs[0];
        String last = strs[strs.length - 1];

        while (index < first.length()) {
            if (first.charAt(index) == last.charAt(index)) {
                index++;
            } else {
                return first.substring(0, index);
            }
        }

        return first.substring(0, index);
    }
}