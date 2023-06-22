import java.util.Arrays;

public class BuyTwoChocolates {
    //2706. Buy Two Chocolates
    //https://leetcode.com/problems/buy-two-chocolates/
    //Sort the array.
    //Get the sum of the two cheapest chocolates.
    //If it's less than or equal to the inital amount of money, return the difference between the cost of those two choclates with the inital amount of money. 
    //Otherwise, return the inital amount of money.
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int sum = prices[1] + prices[0];
        if(sum <= money){
            return money - sum;
        }else{
            return money;
        }
    }    
}
