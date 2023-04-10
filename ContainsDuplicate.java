import java.util.HashMap;

public class ContainsDuplicate {
    //217. Contains Duplicate
    //https://leetcode.com/problems/contains-duplicate/description/
    public boolean containsDuplicate(int[] nums) {
        
        //Initialize a hashmap to check if the key exists. If not, put the key instead
        //If the key exists, return true. Otherwise, return false once loop is complete.
        HashMap <Integer, Boolean> map = new HashMap<Integer, Boolean>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            }else{
                map.put(nums[i], true);
            }
        }

        return false;
    }    
}
