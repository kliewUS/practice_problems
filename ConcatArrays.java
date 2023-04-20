public class ConcatArrays {
    // 1929. Concatenation of Array
    // https://leetcode.com/problems/concatenation-of-array/
    public int[] getConcatenation(int[] nums) {
        // You want to 'multiple' the array
        // Set a variable to check the current element in nums.
        // Set a variable to check the current element in res.
        // Set an array with length of 2n + 1
        // Iterate through the array until we have an array of length 2n.
        int[] res = new int[2 * nums.length];
        int i = 0;
        int j = 0;

        while (j < res.length) {
            if (i > nums.length - 1) {
                i = 0;
            }
            res[j] = nums[i];
            i++;
            j++;
        }

        return res;
    }
}
