import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaxValueStringArray {
    //2496. Maximum Value of a String in an Array
    //https://leetcode.com/problems/maximum-value-of-a-string-in-an-array/
    //If string only contains digits, convert into an int.
    //Otherwise, just get the length.
    //return the highest value.
    public int maximumValue(String[] strs) {
        int res = 0;
        int curVal = 0;

        String regex = "[0-9]+";
        Pattern p = Pattern.compile(regex);        

        for(int i = 0; i < strs.length; i++){

            Matcher m = p.matcher(strs[i]);

            if(m.matches()){
                curVal = Integer.parseInt(strs[i]);
            }else{
                curVal = strs[i].length();
            }

            if(curVal > res){
                res = curVal;
            }

        }

        return res;
    }    
}
