import java.util.Arrays;

public class CoinChange {
    //322. Coin Change
    //https://leetcode.com/problems/coin-change/description/
    public int coinChange(int[] coins, int amount) {
        int[] res = new int[amount + 1];
        Arrays.fill(res, amount + 1); //Basically a way to indicate if the last value cannot be obtained with the coins used.
        res[0] = 0;

        for(int a = 0; a <= amount; a++){ //Going through every possible amount to save the sub-problem
            for(int c = 0; c < coins.length; c++){ //Iterate through the coins array
                if(a - coins[c] >= 0){ //If the difference between the amount and the coin used is not negative, add it into the dp array. 
                    res[a] = Math.min(res[a], 1 + res[a - coins[c]]); //Set the min between the number of coins in the current element and the number of coins from res[amount - value of the coin] + the previous coin obtained (1)
                }
            }
        }

        if(res[amount] == amount + 1){
            return -1;
        }else{
            return res[amount];
        }

    }
}
