public class CountDigits {
    // 2520. Count the Digits that divide a number.
    // Mod by 10 to get the least significant digit.
    // Divide by 10 to remove the least significant digit.
    // Mod with the least significant digit to the original number. Check if the
    // result is 0. If it is, it is divisible.
    // Return the number of digits that divide a number.
    public int countDigits(int num) {
        int tempNum = num;
        int counter = 0;

        while (tempNum > 0) {
            int divisor = tempNum % 10;
            tempNum /= 10;
            if (num % divisor == 0) {
                counter++;
            }
        }

        return counter;
    }
}
