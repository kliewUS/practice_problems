public class MaxSubarray {
    //53. Maximum Subarray
    //https://leetcode.com/problems/maximum-subarray/
    public int maxSubArray(int[] nums) {

        //We could use two loops. 
        //The first loop (i) will go through 0 to n - 1.
        //The second loop will start at i and will add all the nums to the to the ith element.
        //Iterate through the array. 
        //Add every element to the curSum.        
        //If curSum > maxSum, set maxSum to curSum.
        //After that return the maxSum.
        //This is however O(n^2) time, so we can do better than this.

        //Kadane's Algorithm 
        //Initalize two variables. Current sum and max sum.
        //Set curSum to 0 and MaxSum to INT_MIN
        //Iterate through the array. 
        //Add every element to the curSum.
        //If curSum > maxSum, set maxSum to curSum.
        //If curSum < 0. Set curSum back to 0.
        //Return maxSum

        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            curSum += nums[i];

            if(curSum > maxSum){
                maxSum = curSum;
            }

            if(curSum < 0){
                curSum = 0;
            }
        }

        return maxSum;
    }    
}
