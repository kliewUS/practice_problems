import java.util.HashMap;
import java.util.Map;

public class DivideArrIntoEqualPairs {
        //2206. Divide Array Into Equal Pairs
    //https://leetcode.com/problems/divide-array-into-equal-pairs/
    //Count freq for each number.
    //If the freq is even, divde by 2 and add to the total numbers of possible pairs.
    //Otherwise, don't add to the total
    //If the total number of possible pairs doesn't equal to the total number of pairs, return false. Otherwise true.
    public boolean divideArray(int[] nums) {
        int possiblePairs = 0;
        int totalPairs = nums.length / 2;
        HashMap<Integer, Integer> res = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            res.merge(nums[i], 1, Integer::sum);
        }

        for (Map.Entry<Integer, Integer> ele : res.entrySet()) {
            if(ele.getValue() % 2 == 0){
                possiblePairs += (ele.getValue() / 2);
            }
        }

        return possiblePairs == totalPairs;
    }
}