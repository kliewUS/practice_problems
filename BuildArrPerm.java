public class BuildArrPerm {
    // 1920. Build Array from Permutation
    // https://leetcode.com/problems/build-array-from-permutation/
    // Initalize a new array with the same length of nums.
    // Iterate through the array.
    // Set res[i] = nums[nums[i]] for each element.
    public int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[nums[i]];
        }

        return res;
    }
}
