public class MaxNumberOfWords {
    // 2114. Maximum Numbers of Words Found in Sentences
    // https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
    // Split the string by spaces and get the array length.
    // If it's greater than the current length, then set the value. Otherwise,
    // continue iterating.
    // Return the max word count.
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;

        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split(" ");
            if (maxWords < words.length) {
                maxWords = words.length;
            }
        }

        return maxWords;
    }
}
