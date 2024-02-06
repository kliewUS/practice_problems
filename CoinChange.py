#322. Coin Change
#https://leetcode.com/problems/coin-change/
#Use tabluation. Itreate through evey possible amt to save the sub-problem via the coins arr
#If diff between the amt and coin used is not neg, add it into the sub-problem array.
#Set the min between the number of coins in the current element and the number of coins from res[amount - value of the coin] + the previous coin obtained (1)
class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        res = [amount + 1] * (amount + 1)
        res[0] = 0

        for a in range(1, amount + 1):
            for coin in coins:
                if coin <= a:
                    sub_res = res[a - coin]
                    if sub_res != amount + 1 and sub_res + 1 < res[a]:
                        res[a] = sub_res + 1
        
        print(res)

        if res[amount] == amount + 1:
            return -1
        else:
            return res[amount]