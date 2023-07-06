public class SumOfDigitsBaseK{
    //1837. Sum of Digits in Base K
    //https://leetcode.com/problems/sum-of-digits-in-base-k/
    //Convert the number to base k.
    //Mod by 10 to get the digits and sum them up.
    //Return the final result.
    public int sumBase(int n, int k) {
        int res = 0;

        int convertNum = Integer.parseInt(Integer.toString(n, k), 10);

        while(convertNum > 0){
            int digit = convertNum % 10;
            res += digit;
            convertNum /= 10;
        }

        return res;
    }
}