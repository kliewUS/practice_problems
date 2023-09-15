import java.util.HashMap;

public class SumOfUniqueEle {
    //1748. Sum of Unique Elements
    //https://leetcode.com/problems/sum-of-unique-elements/
    //Initalize a hashmap to count the occurance of elements.
    //If it's not in the hashmap yet, add into the result.
    //Return the result.
    public int sumOfUnique(int[] nums) {
        int res = 0;
        HashMap<Integer, Integer> dict = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            dict.merge(nums[i], 1, Integer::sum);
        }

        for(int j = 0; j < nums.length; j++){
            if(dict.get(nums[j]) == 1){
                res += nums[j];
            }
        }

        return res;
    }    
}
