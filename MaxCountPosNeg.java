public class MaxCountPosNeg {
    //2529. Maximum Count of Positive Integer and Negative Integer
    //https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
    //Initalize two variables to count the positive and negative numbers.
    //Once done, iterating through the array. Compare the values. Return whatever is greater.
    public int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                pos++;
            }else if(nums[i] < 0){
                neg++;
            }
        }


        if(pos > neg){
            return pos;
        }else{
            return neg;
        }
    }    
}
