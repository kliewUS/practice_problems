#2442. Count Number of Distinct Integers After Reverse Operations
#https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations/
#Itreate through the list up to len(nums). Reverse each int and append to the end of the list.
#Convert to a set and return the size of the set.
class Solution:
    def countDistinctIntegers(self, nums: List[int]) -> int:
        size = len(nums)

        for idx in range(size):
            nums.append(int(str(nums[idx])[::-1]))

        return len(set(nums))