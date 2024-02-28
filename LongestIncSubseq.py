#300. Longest Increasing Subsequence
#https://leetcode.com/problems/longest-increasing-subsequence/
#Use tabulation
#Assume every index i in the list has a LIS of one.
#Iterate through the list, we check each element at index i.
#Where j < i, if list[i] > list[j] and LIS[i] <= LIS[j], then LIS[i] = LIS[j] + 1
#Iterate though the LIS, get the max of the LIS values.
class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        n = len(nums)
        res = [1] * n

        for i in range(1, n):
            for j in range(0, i):
                if nums[i] > nums[j] and res[i] <= res[j]:
                    res[i] = res[j] + 1
        
        maxLIS = 0

        for lis in res:
            maxLIS = max(maxLIS, lis)

        return maxLIS