public class LeftRightSumDiff {
    // 2574. Left and Right Sum Differences
    // https://leetcode.com/problems/left-and-right-sum-differences/
    // Initalize three arrays. One to hold the leftSum, one to hold the rightSum,
    // and one to hold the result array.
    // Initalize two counters to keep track of the current left and right sums.
    // After that, iterate through both arrays using Math.abs() to get the
    // difference.
    public int[] leftRigthDifference(int[] nums) {

        int[] leftSumArr = new int[nums.length];
        int[] rightSumArr = new int[nums.length];
        int[] resArr = new int[nums.length];
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i < nums.length; i++) {
            leftSum += nums[i - 1];
            leftSumArr[i] = leftSum;
        }

        for (int j = nums.length - 2; j >= 0; j--) {
            rightSum += nums[j + 1];
            rightSumArr[j] = rightSum;
        }

        for (int k = 0; k < nums.length; k++) {
            resArr[k] = Math.abs(leftSumArr[k] - rightSumArr[k]);
        }

        return resArr;
    }
}