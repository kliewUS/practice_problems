#217. Contains Duplicate
#https://leetcode.com/problems/contains-duplicate/
#Create a dict to hold frequences.
#Iterate through the array. Then the dict.
#Check if the value is more than 2. If it is, return true. false otheriwse.
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        res = defaultdict(int)

        for num in nums:
            res[num] += 1

        for val in res.values():
            if val >= 2:
                return True

        return False
        