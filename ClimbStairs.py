#70. Climbing Stairs
#https://leetcode.com/problems/climbing-stairs/description/
#Hint: Treat this as a fibonacci sequence. 
#Hint 2: Use Dynammic programming. Preferrably bottom-up.
#We know that it takes 1 way to walk 0 steps and 1 way to walk 1 step.
#With these base cases in mind, in order to take 2 steps for example,
#We will have take into account that we either starting at the 0th step
#Or we are at the 1st step. In this case, there are 2 ways to walk the 2 steps.
#Thus we compute the number of ways to reach to the top by getting the last 2 previous steps.
class Solution:
    def climbStairs(self, n: int) -> int:
        ways = [0] * (n + 1)
        ways[0] = 1
        ways[1] = 1
        
        for idx in range(2, len(ways)):
            ways[idx] = ways[idx - 1] + ways[idx - 2]

        return ways[n]