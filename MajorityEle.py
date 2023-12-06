#169. Majority Element
#https://leetcode.com/problems/majority-element/
#Create a dictionary to store freq.
#Iterate through the array.
#Iterate through the dict. If the freq > n / 2 times, then return the key of that freq.
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        res = defaultdict(int)

        for num in nums:
            res[num] += 1

        for key, val in res.items():
            if val > (len(nums) / 2):
                return key

        return -1