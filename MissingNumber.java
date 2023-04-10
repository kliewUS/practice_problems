import java.util.Arrays;

public class MissingNumber {
    //268. Missing Number
    //https://leetcode.com/problems/missing-number/
    //Sort the array.
    //Initalize a variable to keep track of the current number.

    public int missingNumber(int[] nums) {
        
        Arrays.sort(nums);
        //[0, 1, 3]
        //[0, 1, 2, 3, 4, 5, 6, 7, 9]

        int missingNumber = 0;

        while(missingNumber < nums.length){
            if(nums[missingNumber] != missingNumber){
                break;
            }
            missingNumber++;
        }

        return missingNumber;
    }    
}
