public class FirstPalindromicStrArr {
    //2108. Find First Palindromic String in the Array
    //https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
    //Iterate through array.
    //Reverse the string. If it is palindrome, return it.
    //Otherwise return empty string.
    public String firstPalindrome(String[] words) {
        
        for(int i = 0; i < words.length; i++){
            StringBuilder input = new StringBuilder(words[i]);
            input.reverse();
            if(words[i].equals(input.toString())){
                return words[i];
            }
        }

        return "";
    }    
}
