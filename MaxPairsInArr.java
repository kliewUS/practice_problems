import java.util.HashMap;
import java.util.Map;

public class MaxPairsInArr {
    //2341. Maximum Number of Pairs in Array
    //Create a hashmap to count frequence.
    //After iterate through array, iterate through hashmap to count freq.
    //Divide by 2 on freq to get result.
    //Mod by 2 on freq to get remainder.
    //Once finished, return the res array.
    public int[] numberOfPairs(int[] nums) {
        int[] res = {0,0};
        HashMap<Integer, Integer> hm = new HashMap<>();
        int pairs = 0;
        int remainder = 0;

        for(int i = 0; i < nums.length; i++){
            hm.merge(nums[i], 1, Integer::sum);            
        }

        for (Map.Entry<Integer, Integer> ele : hm.entrySet()) {
            pairs += (ele.getValue() / 2);
            remainder += (ele.getValue() % 2); 
        }

        res[0] = pairs;
        res[1] = remainder;

        return res;
    }    
}
