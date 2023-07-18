import java.util.HashMap;
import java.util.Map;

public class RepeatedEleInArr{
    //961. N-Repeated Element in Size 2N Array
    //https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
    //Create a hashmap to store the number of occurances.
    //Iterate through the array to count the numbers of occurances.
    //Then iterate through the hashmap and return the element that is repeated n times.
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> res = new HashMap<>();
        int repeatedElement = 0;

        for(int i = 0; i < nums.length; i++){
            res.merge(nums[i], 1, Integer::sum);
        }

        for (Map.Entry<Integer, Integer> set :
             res.entrySet()) {
                 if(set.getValue().equals(nums.length / 2)){
                     repeatedElement = set.getKey();
                 }
        }


        return repeatedElement;
    }
}