public class CountWordsWithPrefix {
    //2185. Counting Words With a Given Prefix
    //https://leetcode.com/problems/counting-words-with-a-given-prefix/
    //If the length of the word is less than the length of the prefix, get the whole word. Otherwise, grab the substring up to the length of the prefix.
    //Iterate through the array and check if the prefix is in the string. If it is, increment counter.
    //Return counter.
    public int prefixCount(String[] words, String pref) {
        int counter = 0;
        String word;

        for(int i = 0; i < words.length; i++){
            if(pref.length() > words[i].length()){
                word = words[i];
            }else{
                word = words[i].substring(0, pref.length());
            }

            if(word.compareTo(pref) == 0){
                counter++;
            }
        }

        return counter;
    }    
}
