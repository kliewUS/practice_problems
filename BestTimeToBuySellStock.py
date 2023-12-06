#121. Best Time to Buy and Sell Stock
#https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
#1 price = no profit can be made.
#2 prices = Only first day can potentially return a profit. 
#Initalize two pointers. Left is buyDay and right is sellDay.
#If the buyDay price is greater than sellDay price, then move the buyDay to the current pos of the sellDay. Increment the sellDay by 1. This means we have found a new lowest price.
#Otherwise, get the current profit by getting the difference of the sellDay price and the buyDay price, provided that the difference of the prices is greater than the current max profit.

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if len(prices) <= 1:
            return 0

        buy = 0
        sell = 1
        profit = 0

        while sell < len(prices):
            if prices[buy] < prices[sell]:
                profit = max(profit, prices[sell] - prices[buy])
            else:
                buy = sell
            
            sell += 1

        return profit