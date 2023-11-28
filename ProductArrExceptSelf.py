#238. Product of Array Except Self
#https://leetcode.com/problems/product-of-array-except-self/description/
#Init a solution array with same size of nums
#Store current Prefix and Postfix product as vars.
#Iterate through the nums array
#Multiply the solution array at i with the prefix product of the previous i-1 elements
#Do the same with the postfix product of the next n-i-1 elements
#After multiplying the prefix and postfix products. Update those values. 

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        length = len(nums)
        res = [1] * length
        prefix = 1
        postfix = 1

        for idx in range(length):
            res[idx] *= prefix
            prefix *= nums[idx]
            res[length - idx - 1] *= postfix
            postfix *= nums[length - idx - 1] 

        return res