public class SumMultiples {
    // 2652. Sum Multiples
    // https://leetcode.com/problems/sum-multiples/
    // Init a counter to store sum.
    // Init a variable to get the current number.
    // Check if the number can be modded by 3, 5, or 7. If it can, add to the sum.
    // Return the sum.
    public int sumOfMultiples(int n) {
        int sum = 0;
        int curNum = 1;

        while (curNum <= n) {
            if (curNum % 3 == 0 || curNum % 5 == 0 || curNum % 7 == 0) {
                sum += curNum;
            }

            curNum++;
        }

        return sum;
    }
}
