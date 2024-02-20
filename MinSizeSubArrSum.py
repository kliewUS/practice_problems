#209. Minimum Size Subarray Sum
#https://leetcode.com/problems/minimum-size-subarray-sum/
#Use sliding window approach.
#Set l = 0, r = -1, sum = 0, minLen = len(nums) + 1
#Then loop until l < len(nums)
#if r + 1 < len(nums) and sum < target, then sum += nums[r] and increment r by 1.
#Otherwise, sum -= nums[l] and increment l by 1.
#if sum >= target, then set the minLen by min(minLen, r - l + 1)
#If minLen == len(nums) + 1, return 0. Otherwise, return minLen
class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        left, right = 0, -1
        sum = 0
        n = len(nums)
        minLen = n + 1

        while left < n:
            if right + 1 < n and sum < target:
                right += 1
                sum += nums[right]
            else:
                sum -= nums[left]
                left += 1
            if sum >= target:
                minLen = min(minLen, right - left + 1)
        

        if minLen == n + 1:
            return 0
        else:
            return minLen