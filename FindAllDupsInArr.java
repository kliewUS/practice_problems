import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllDupsInArr {
    //442. Find All Duplicates in an Array.
    //https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
    //Note this is O(n) space complexity.
    //Use a hashmap to count the number of times the number appears.
    //Then iterate through the hashmap and check if the value is two. If it is, store the key into the arraylist.
    //return the arraylist.
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> dups = new ArrayList<Integer>();

        
        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) == null){
                map.put(nums[i], 1);
            }else{
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 2){
                dups.add(entry.getKey());
            }
        }

        return dups;
    }    
}
