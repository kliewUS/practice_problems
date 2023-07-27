public class SumSquaresSpecialEle {
    //2778. Sum of Squares of Special Elements
    //https://leetcode.com/problems/sum-of-squares-of-special-elements/
    //Iterate through array.
    //if n % i == 0, then add to the sum with i^2.
    public int sumOfSquares(int[] nums) {
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums.length % (i + 1) == 0){
                sum += (nums[i] * nums[i]);
            }
        }

        return sum;
    }    
}
