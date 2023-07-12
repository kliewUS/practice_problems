import java.util.Arrays;

public class MaxSumKEle {
    //2656. Maximum Sum With Exactly K Elements
    //https://leetcode.com/problems/maximum-sum-with-exactly-k-elements/
    //Sort the array.
    //Get the last element and add to the sum.
    //Increment by 1 and replace the last element.
    //Return the sum.
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        int i = 0;

        while(i < k){
            sum += nums[nums.length - 1];
            nums[nums.length - 1] += 1;
            i++;
        }

        return sum;
    }  
}
