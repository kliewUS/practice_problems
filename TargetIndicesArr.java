import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetIndicesArr {
    //2089. Find Target Indices After Sorting Array
    //https://leetcode.com/problems/find-target-indices-after-sorting-array/
    //Sort the array and initalize a new list.
    //Iterate through sorted list and check if element equals to target.
    //If it does add indice to list.
    //Return list.
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(target == nums[i]){
                res.add(i);
            }
        }

        return res;
    }    
}
