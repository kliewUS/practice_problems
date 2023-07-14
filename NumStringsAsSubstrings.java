public class NumStringsAsSubstrings {
    //1967. Number of Strings That Appear as Substrings in Word
    //https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
    //Iterate through the strings. Check if the string is a substring of word. If it is, increment counter by 1.
    //return counter.
    public int numOfStrings(String[] patterns, String word) {
        int counter = 0;

        for(int i = 0; i < patterns.length; i++){
            if(word.indexOf(patterns[i]) != -1){
                counter++;
            }
        }


        return counter;
    }    
}
