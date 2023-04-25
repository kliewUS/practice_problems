public class SmallestEvenMultiple {
    // 2413. Smallest Even Multiple
    // https://leetcode.com/problems/smallest-even-multiple/
    // If number is even, then return n.
    // If number is odd, then return 2 * n.
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;
        } else {
            return 2 * n;
        }
    }
}
