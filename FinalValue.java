public class FinalValue {
    // 2011. Final Value of Variable After Performing Operations
    // https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
    // Initalize a variable x to keep track the current value.
    // Itearte through the array. If ++X or X++, increment X. Otherwise, decrement
    // X.
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equalsIgnoreCase("++X") || operations[i].equalsIgnoreCase("X++")) {
                x += 1;
            } else if (operations[i].equalsIgnoreCase("--X") || operations[i].equalsIgnoreCase("X--")) {
                x -= 1;
            }
        }

        return x;
    }
}
