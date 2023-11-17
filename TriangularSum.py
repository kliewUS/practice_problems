#2221. Find Triangular Sum of an Array
#Use recurison.
#If len(nums) = 1, then return that element.
#Otherwise, create a new array of length n -1
#Iterate through nums.
#Assign newNums[i] = (nums[i] + nums[i+1]) % 10
#When done, repeat the process with the smaller array until len(nums) = 1
class Solution:
    def triangularSum(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return nums[0]

        newNums = []

        for idx in range(len(nums) - 1):
            newNums.append((nums[idx] + nums[idx+1]) % 10)

        return self.triangularSum(newNums)
        