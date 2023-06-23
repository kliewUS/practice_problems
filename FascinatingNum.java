import java.util.HashMap;
import java.util.Map;

public class FascinatingNum {
        //2729. Check if The Number is Fascinating
    //https://leetcode.com/problems/check-if-the-number-is-fascinating/
    //Initalize a hashamp.
    //Multiply the number by 2 and 3.
    //Concating the original number with the results of the number multiplied by 2 and 3, convert it into string in the process.
    //Iterate through the string. Counting the digits.
    //Check if each digit is unique. If not, return false. Otherwise, true.
    public boolean isFascinating(int n) {
        HashMap<Character, Integer> res = new HashMap<>();
        int timesTwo = 2 * n;
        int timesThree = 3 * n;
        String num = "" + n + timesTwo + timesThree;
        System.out.println(num);

        for(int i = 0; i < num.length(); i++){
            res.merge(num.charAt(i), 1, Integer::sum);
        }

        for (Map.Entry<Character, Integer> entry : res.entrySet()) {
            if(entry.getValue() > 1 || entry.getKey() == '0'){
                return false;
            }
        }

        return true;
    }
}