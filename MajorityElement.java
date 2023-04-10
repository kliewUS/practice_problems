import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    //169. Majority Element
    //https://leetcode.com/problems/majority-element/description/
    public int majorityElement(int[] nums) {
        //Create a hash-table to store the number of times a value appears.
        //Iterate through the array. If the value appears, check if the value exists in the hash-table. If it doesn't, add the value to the hash-table.
        //If it does, increment the count of that value by 1.
        //Then return the max value.

        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            Integer countKey = count.get(nums[i]);
            if(countKey == null){
                count.put(nums[i], 1);
            }else{
                count.put(nums[i], countKey + 1);
            }
        }

        int mode = 0;
        int recurringNum = Collections.max(count.values());

        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            if(entry.getValue() == recurringNum){
                mode = entry.getKey();
            }
        }

        return mode;
    }
}
