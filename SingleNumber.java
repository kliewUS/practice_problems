public class SingleNumber {
    //136. Single Number
    //https://leetcode.com/problems/single-number/description/
    //Use XOR bitwise operator to get the single number in O(n) time and O(1) space complexity.
    public int singleNumber(int[] nums) {
        int singleElement = 0;
        
        for(int i = 0; i < nums.length; i++){
            System.out.println(singleElement);
            singleElement ^= nums[i];
        }

        return singleElement;
    }    
}
