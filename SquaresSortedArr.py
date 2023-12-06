#977. Squares of a Sorted Array
#https://leetcode.com/problems/squares-of-a-sorted-array/solutions/3189378/python-two-pointer-clean-simple-o-n-solution/
#Create two pointers. One at the start and one at the end.
#Create an empty list of size n, filled with 0s.
#Create another pointer k, to update value in that empty list.
#Compare the abs values where pointers are pointing.
# if abs(nums[l]) > nums[r], then update value at k pos in ans with nums[l] * nums[l]
#Otherwise, update value at k pos in ans with nums[r] * nums[r]
class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        n = len(nums)
        start, end = 0, n - 1
        k = n - 1
        res = [0] * n

        while k >= 0:
            if abs(nums[start]) > nums[end]:
                res[k] = nums[start] * nums[start]
                start += 1
            else:
                res[k] = nums[end] * nums[end]
                end -= 1
            
            k -= 1

        return res