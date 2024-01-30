#198. House Robber
#https://leetcode.com/problems/house-robber/
#Use DP. Use tabulation (bottom-up)
#Base case 2 houses = Get max money between the two houses. Ex: [2, 3]. Return the max of the two houses.
#Check if loot taken when skipping the adj house is greater than the case if the lot is not taken from the adj house.
#Store this result in the tabulation array res.
class Solution:
    def rob(self, nums: List[int]) -> int:
        if(len(nums) <= 1):
            return nums[0]

        if(len(nums) == 2):
            return max(nums[0], nums[1])


        res = []
        res.append(nums[0])
        res.append(max(nums[0], nums[1]))

        for i in range(2, len(nums)):
            res.append(max(res[i - 2] + nums[i], res[i - 1]))

        return res[-1]