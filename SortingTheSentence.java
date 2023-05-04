public class SortingTheSentence {
    // 1859. Sorting the Sentence
    // https://leetcode.com/problems/sorting-the-sentence/
    // Split the string.
    // Init a new array with size of the string array.
    // Based on index. Put them in their respective positions.
    // Return the combined string.
    public String sortSentence(String s) {

        String[] split = s.split(" ");
        String[] res = new String[split.length];

        Arrays.fill(res, "");

        for (int i = 0; i < split.length; i++) {
            int position = Integer.parseInt(split[i].substring(split[i].length() - 1));
            res[position - 1] = split[i].substring(0, split[i].length() - 1);
        }

        return String.join(" ", res);
    }
}