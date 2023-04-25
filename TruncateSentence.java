public class TruncateSentence {
    // 1816. Truncate Sentence
    // https://leetcode.com/problems/truncate-sentence/
    // Split string into array.
    // Use copyOfRange and then merge array to a single string.
    // Return that string.

    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");

        String[] truncatedWords = Arrays.copyOfRange(words, 0, k);

        return String.join(" ", truncatedWords);
    }
}
