import sys
#53. Maximum Subarray
#https://leetcode.com/problems/maximum-subarray/
#Kadane's Algorithm 
#Initalize two variables. Current sum and max sum.
#Set curSum to 0 and MaxSum to sys.maxsize-1
#Iterate through the array. 
#Add every element to the curSum.
#If curSum > maxSum, set maxSum to curSum.
#If curSum < 0. Set curSum back to 0.
#Return maxSum

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        curSum, maxSum = 0, -sys.maxsize - 1

        for num in nums:
            curSum += num
            
            if curSum > maxSum:
                maxSum = curSum

            if curSum < 0:
                curSum = 0
        
        return maxSum