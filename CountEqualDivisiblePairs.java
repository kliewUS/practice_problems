public class CountEqualDivisiblePairs {
    //2176. Count Equal and Divisible Pairs in an Array
    //https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/
    //Create a double loop and iterate through all pairs.
    //If arr[i] == arr[j], then check if (i * j) % k == 0.
    //If it is, increment by 1.
    public int countPairs(int[] nums, int k) {
        int counter = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j] && (i * j) % k == 0){
                    counter++;
                }
            }
        }

        return counter;
    }    
}
