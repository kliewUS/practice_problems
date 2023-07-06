public class PairsWithAbsDiff {
    //2006. Count Number of Pairs With Absolute Difference K
    //https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/
    //Make a double loop. 
    //Iterate from i = 0 to nums.length - 1 for outer loop.
    //Iterate from j = i + 1 to nums.length - 1 for inner loop.
    //If the abs diff == k, increment counter by 1.
    //Return counter.
    public int countKDifference(int[] nums, int k) {
        int counter = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(Math.abs(nums[i] - nums[j]) == k){
                    counter++;
                }
            }
        }

        return counter;
    }    
}
