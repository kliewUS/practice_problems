import java.util.Arrays;

public class MultiplyFinalValue {
    // 2154. Keep Multiplying Found Values by Two
    // https://leetcode.com/problems/keep-multiplying-found-values-by-two/
    // Sort the array.
    // Iterate through the array. If the value matches with the original, multiply
    // by 2.
    // Once finish iteration, return the final value of original.
    public int findFinalValue(int[] nums, int original) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == original) {
                original *= 2;
            }
        }

        return original;
    }
}