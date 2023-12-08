#643. Maximum Average Subarray I
#https://leetcode.com/problems/maximum-average-subarray-i/
#Provided that n > k:
#We compute the sum of the first k elements out of n terms using a linear loop and store the sum in variable window_sum.
#Then we will graze linearly over the array till it reaches the end and simultaneously keep track of the maximum sum.
#To get the current sum of a block of k elements just subtract the first element from the previous block and add the last element of the current block.
#Then after getting the sum, we divide by k.
class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        n = len(nums)

        if(n < k):
            return -1

        win_sum = sum(nums[:k])
        max_avg = win_sum / k

        for idx in range(n - k):
            win_sum = win_sum - nums[idx] + nums[idx + k]
            win_avg = win_sum / k
            max_avg = max(max_avg, win_avg)

        return max_avg
