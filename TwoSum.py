#1. Two Sum
#https://leetcode.com/problems/two-sum/
#Have two pointers. One at the start and one at the end.
#Go through the array. If nums[start] + nums[end] == target, then return the indicies of those two numbers. 
#Otherwise, decrement end pointer. If end pointer index is equal to start pointer index, increment start pointer by 1 and set back the end pointer to len(nums) - 1.

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        res = [0, 0]
        start = 0
        end = len(nums) - 1

        while start < end:
            if nums[start] + nums[end] == target:
                res[0] = start
                res[1] = end
                break

            end -= 1

            if start == end:
                end = len(nums) - 1
                start += 1

        return res