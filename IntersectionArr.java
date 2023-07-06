import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionArr {
    //2248. Intersection of Multiple Arrays
    //https://leetcode.com/problems/intersection-of-multiple-arrays/description/
    //Initalize a hashmap and list.
    //Count the number of times the number appears when iterating the array
    //Iterate through the hashmap. If the frequence matches the number of subarrays, add to the list.
    public List<Integer> intersection(int[][] nums) {
        List<Integer> res = new ArrayList<Integer>();
        HashMap<Integer, Integer> count = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                count.merge(nums[i][j], 1, Integer::sum);
            }
        }

        for (Map.Entry<Integer,Integer> countEle : count.entrySet()) {
            if(countEle.getValue() == nums.length){
                res.add(countEle.getKey());
            }
        }

        Collections.sort(res);

        return res;
    }    
}
