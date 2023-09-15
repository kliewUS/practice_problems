import java.util.ArrayList;
import java.util.List;

public class AscendingNumSentence {
    //2042. Check if Numbers Are Ascending in a Sentence
    //https://leetcode.com/problems/check-if-numbers-are-ascending-in-a-sentence/
    //Split the string.
    //Itrate through string array. If it's a number, add to arraylist.
    //Itrate through list. Check if the current number is less than the next number.
    //If all nums are ascending, return true. Otherwise, false
    public boolean areNumbersAscending(String s) {
        List<Integer> res = new ArrayList<>();
        String[] split = s.split(" ");

        for(int i = 0; i < split.length; i++){
            boolean isNumeric = split[i].chars().allMatch( Character::isDigit);
            if(isNumeric){
                res.add(Integer.parseInt(split[i]));
            }
        }

        for(int i = 0; i < res.size() - 1; i++){
            if(res.get(i) >= res.get(i+1)){
                return false;
            }
        }


        return true;
    }    
}
