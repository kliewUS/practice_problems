import java.util.HashMap;
import java.util.Optional;

public class EqualOccurrences {
    //1941. Check if All Characters Have Equal Number of Occurrences
    //https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/
    //Use a hashmap to keep track of occurrences.
    //Count the occurences in string.
    //Iterate through values. If values don't match, return false.
    //Otherwise, true
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> res = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            res.merge(s.charAt(i), 1, Integer::sum);
        }

        Optional<Integer> firstVal = res.values().stream().findFirst();

        for (Integer val : res.values()){
            Integer compareVal = firstVal.get();
            if(!(val.equals(compareVal))){
                return false;
            }
        }

        return true;
    }    
}
