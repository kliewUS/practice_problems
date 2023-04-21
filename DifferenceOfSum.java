public class DifferenceOfSum {
    // 2535. Difference Between Element Sum and Digit Sum of an array
    // https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/
    // Init two variables. One to hold the sum of the elements and one to hold the
    // sum of all the digits.
    // Iterate through the array. Add to the sum of the elements. Then mod by 10 to
    // get the digit and to the sum. After that divide by 10 and repeat until there
    // are no more digits.
    // Once finish with the iteration, then use Math.abs to get the absolute
    // difference. Return that difference.
    public int differenceOfSum(int[] nums) {
        int eleSum = 0;
        int digitSum = 0;

        for (int i = 0; i < nums.length; i++) {
            eleSum += nums[i];
            int tempNum = nums[i];
            while (tempNum > 0) {
                int digit = tempNum % 10;
                digitSum += digit;
                tempNum /= 10;
            }
        }

        return Math.abs(eleSum - digitSum);
    }
}