#268. Missing Number
#https://leetcode.com/problems/missing-number/
#Sort all nums
#Iterate through the array. If missingNum doesn't match currNum, then break.
#Return the number.
class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        nums = sorted(nums)
        missingNum = 0
        
        for num in nums:
            if missingNum != num:
                break
            missingNum += 1
        
        return missingNum