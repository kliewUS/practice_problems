public class HouseRobber {
    //198. House Robber
    //https://leetcode.com/problems/house-robber/description/
    public int rob(int[] nums) {
        //Base case: 2 houses = Get the max amount of money between the two houses. Ex: [2, 3]. Return the max of ther two houses.
        //Hint, use tabluation (bottom-up).
        //Check if loot taken (When skipping the adjacent house due to the alarm) is greater than the if the loot is not taken (The loot from adjacent house).
        //Store this result in the tabulation array. 

        if(nums.length <= 1){
            return nums[0];
        }

        int[] loot = new int[nums.length];
        loot[0] = nums[0];

        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }

        loot[1] = Math.max(nums[0], nums[1]);

        for(int i = 2; i < nums.length; i++){
            //System.out.println("Loot if taken: " + (loot[i - 2] + nums[i]));
            //System.out.println("Loot if not taken: " + loot[i - 1]);            
            loot[i] = Math.max(loot[i - 2] + nums[i], loot[i - 1]);
            //System.out.println("Current max loot: " + loot[i]);
        }

        return loot[nums.length - 1];
    }
}
