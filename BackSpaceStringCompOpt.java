public class BackSpaceStringCompOpt {
    //844. Backspace String Compare
    //https://leetcode.com/problems/backspace-string-compare/description/
    public String backspaceString(String s){
        String str = "";
        StringBuilder sb = new StringBuilder(str);

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '#' && sb.length() != 0){
                sb.delete(sb.length() - 1, sb.length());
            }else if(s.charAt(i) != '#'){
                sb.append(s.charAt(i));
            }            
        }

        return sb.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        //In a separate method, create a StringBuilder.
        //When a letter is detected, append into the StringBuilder.
        //When a hashtag is detected, delete from the StringBuilder.
        //return the string when finished.
        //Compare the two strings once the method calls are finished.
        //It is O(n) running time because we are iterating through the string.
        //It is O(1) space because we only use a StringBuilder, which is constant space.

        return backspaceString(s).equals(backspaceString(t));
    }    
}
