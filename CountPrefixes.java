public class CountPrefixes {
    //2255. Count Prefixes of a Given String
    //https://leetcode.com/problems/count-prefixes-of-a-given-string/
    //Use startWith to check if words[i] is a prefix of s.
    public int countPrefixes(String[] words, String s) {
        int counter = 0;

        for(int i = 0; i < words.length; i++){
            if(s.startsWith(words[i])){
                counter++;
            }
        }

        return counter;
    }    
}
