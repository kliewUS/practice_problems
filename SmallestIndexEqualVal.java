public class SmallestIndexEqualVal {
    //2057. Smallest Index With Equal Value.
    //https://leetcode.com/problems/smallest-index-with-equal-value/
    //Iterate through the array and check if i % 10 == nums[i].
    //Otherwise, return -1.
    public int smallestEqual(int[] nums) {
        
        for(int i = 0; i < nums.length; i++){
            if(i % 10 == nums[i]){
                return i;
            }
        }

        return -1;
    }    
}
