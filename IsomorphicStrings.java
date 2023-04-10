import java.util.HashMap;
import java.util.Map;
//Problem 205: Isomorphic Strings: https://leetcode.com/problems/isomorphic-strings/description/
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        //If lens of s and t don't match, return false.
        //Create a dictonary
        //e = a
        //d = d
        //If character is not in dictonary, 
        //First check to make sure the value is not in the dict, if it is, return false.
        //Otherwise, then store the values as key-value pair. 
        //If character is in dictonary, compare the second string character (t) with value,
        //If don't match, return false.

        
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Character> map = new HashMap<Character, Character>();

        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }else{
                if(map.containsValue(t.charAt(i))){
                    return false;
                }else{
                    map.put(s.charAt(i), t.charAt(i));
                }
            }
        }

        return true;

    }
}
