public class BuyStock {
    //121. Best Time to Buy and Sell Stock
    //https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
    public int maxProfit(int[] prices) {
        //1 price = no profit can be made.
        //2 prices = Only first day can potentially return a profit. 
        //Initalize two pointers. Left is buyDay and right is sellDay.
        //If the buyDay price is greater than sellDay price, then move the buyDay to the current pos of the sellDay. Increment the sellDay by 1. This means we have found a new lowest price.
        //Otherwise, get the current profit by getting the difference of the sellDay price and the buyDay price, provided that the difference of the prices is greater than the current max profit.

        if(prices.length <= 1){
            return 0;
        }

        int buyDay = 0;
        int sellDay = 1;
        int profit = 0;

        while(sellDay < prices.length){
            if(prices[buyDay] < prices[sellDay]){
                profit = Math.max(profit, prices[sellDay] - prices[buyDay]);
            }else{
                buyDay = sellDay;
            }
            sellDay += 1;
        }

        return profit;

    }
}
