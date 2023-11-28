#448. Find All Numbers Disappeared in an Array
#https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
#Sort the array in place.
#Convert into a set
#Then using a counter. Iterate through the set. If the current number doesn't equal to the counter.
#Add to the array.
class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        res = []
        counter = 1
        max = len(nums)
        nums.sort()
        nums = set(nums)

        while counter <= max:
            if counter not in nums:
                res.append(counter)
            counter += 1

        return res
            