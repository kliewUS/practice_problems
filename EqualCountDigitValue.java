import java.util.HashMap;

public class EqualCountDigitValue {
    //2283. Check if Number Has Equal Digit Count and Digit Value
    //https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/
    //Make a hashmap and count freq.
    //Then iterate through the array and check if i occurs num[i] times in num.
    public boolean digitCount(String num) {
        HashMap<String, Integer> res = new HashMap<>();

        for(int i = 0; i < num.length(); i++){
            res.merge(num.substring(i, i+1), 1, Integer::sum);
        }

        for(int j = 0; j < num.length(); j++){
            int digit = Integer.parseInt(num.substring(j, j+1));
            String value = String.valueOf(j);
            int freq = 0;

            if(res.get(value) != null){
                freq = res.get(value);

            } 

            // System.out.println("Index: " + j);
            // System.out.println("Freq: " + freq);
            // System.out.println("Digit: " + digit);
            // System.out.println("Value: " + value);

            if(freq != digit){
                return false;
            }
        }



        return true;
    }    
}
