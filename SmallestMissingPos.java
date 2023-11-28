#41. First Missing Positive
#https://leetcode.com/problems/first-missing-positive/
#We only need to account for numbers from 1 to n
#Mark any numbers that are outside the range with n + 1
#Then mark the indexes of the numbers from 1 to n by negating the values present at the index.
#After that, return the first occurenece of a positive number from the list.
#Otherwise, return n + 1 if a positive number is not found.
class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        n = len(nums)
        for i in range(n):
            if nums[i] < 1 or nums[i] > n:
                nums[i] = n + 1

        # print(nums)

        for i in range(n):
            val = abs(nums[i])
            if val > n:
                continue
            val -= 1
            if nums[val] > 0:
                nums[val] *= -1
            
        # print(nums)

        for i in range(n):
            if nums[i] >= 0:
                return i + 1

        return n + 1