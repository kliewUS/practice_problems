public class ReverseWordsStrIII {
    //557. Reverse Words in a String III
    //https://leetcode.com/problems/reverse-words-in-a-string-iii/
    //Split string and iterate through array.
    //Using helper method, reverse each character.
    //Combine string array and return new string.
    public String reverse(String s){
        String ns = "";
        char ch;

        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            ns = ch + ns;
        }

        return ns;
    }

    public String reverseWords(String s) {
        String[] splitStr = s.split(" ", -1);

        for(int i = 0 ; i < splitStr.length; i++){
            splitStr[i] = reverse(splitStr[i]);
        }

        return String.join(" ", splitStr);
    }    
}
