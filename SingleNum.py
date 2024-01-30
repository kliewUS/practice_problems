#136. Single Number
#https://leetcode.com/problems/single-number/description/
#Use XOR bitwise operator to get the single number in O(n) time and O(1) space complexity.
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        singleEle = 0

        for num in nums:
            singleEle ^= num


        return singleEle