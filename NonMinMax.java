import java.util.Arrays;
import java.util.Collections;

public class NonMinMax {
    //2733. Neither Minimum nor Maximum
    //https://leetcode.com/problems/neither-minimum-nor-maximum/description/
    //Find min and max. Then iterate through the array, checking if the value isn't a min or max.
    //If the value isn't a min or max value, then return that value.
    //Otherwise, return -1.
    public int findNonMinOrMax(int[] nums) {
        Integer[] intNums = Arrays.stream( nums ).boxed().toArray( Integer[]::new );        
        int min = Collections.min(Arrays.asList(intNums));
        int max = Collections.max(Arrays.asList(intNums)); 

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > min && nums[i] < max){
                return nums[i];
            }
        }


        return -1;       
    }    
}
