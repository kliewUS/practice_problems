#338. Counting Bits
#https://leetcode.com/problems/counting-bits/description/

#0 - 0
#1 - 1
#2 - 10
#3 - 11
#4 - 100
#5 - 101

#Notice for every number:
#for all even numbers, the right most bit will always be 0.
#for all odd numbers, the right most bit will always be 1.

#So recursively divide each number by 2. (Right bitwise shift) >>.
#Until we get either 1 or 0.
#Add 1 to the result if it's odd number since the right shift will lose the right most bit and we need it for the result.

#However, we are repeating calcuations for every value, so we need to store the result.
#Use the res arr to memorize the intermidate results. (Top-down, recursive)
#If the result has already been calculated, then return the result.
#Otherwise, continue with the regular flow.

class Solution:
    def solve(self, i, res):
        if i == 0:
            return 0
        if i == 1:
            return 1

        if res[i] != 0:
            return res[i]
    
        if(i % 2 == 0):
            res[i] = self.solve(i//2, res)
            return res[i]
        else:
            res[i] = 1 + self.solve(i//2, res)
            return res[i]
    
    def countBits(self, n: int) -> List[int]:
        res = [0 for k in range(n+1)]

        for idx in range(len(res)):
            res[idx] = self.solve(idx, res)

        return res
