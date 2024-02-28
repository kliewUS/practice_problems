#309. Best Time to Buy and Sell Stock with Cooldown
#https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
#We will consider three different actions for every day.
#1. If we buy today, then the last action until yesterday must be the cooldown day since we can't buy right after selling.
#We compare the two profits: If cooldown yesterday and buy today vs max profit yesterday when last action was buy.
#2. If we sell today, then the last action until yesterday must be buy since we nned to buy if we want to sell.
#We compare the two profits: If sell yesterday based on last buy vs max profit yesterday when last action was sell.
#3. If we cooldown today, then the last action until yesterdayt must be either sell or cooldown.
#We compare the two profits: max profit yesterday when last action was sell vs max profit yesterday when last action was cooldown.
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        n = len(prices)
        if n <= 1:
            return 0
        buy = -prices[0]
        sell = 0
        cooldown = 0

        for i in range(1, n):
            prebuy = buy
            presell = sell
            precooldown = cooldown
            buy = max(prebuy, precooldown-prices[i])
            sell = max(presell, prices[i]+prebuy)
            cooldown = max(precooldown, presell)

        return max(sell, cooldown)