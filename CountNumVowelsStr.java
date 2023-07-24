public class CountNumVowelsStr {
    //2586. Count the Number of Vowel Strings in Range
    //https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/
    //Iterate through the array based on range.
    //Check if the first and last letter are vowels. If it does, increment counter.
    //Return counter.
    public int vowelStrings(String[] words, int left, int right) {
        String vowels = "aeiou";
        int counter = 0;

        for(int i = left; i <= right; i++){
            if(vowels.indexOf(words[i].charAt(0)) != -1 && vowels.indexOf(words[i].charAt(words[i].length() - 1)) != -1){
                counter++;
            }
        }

        return counter;
    }    
}
