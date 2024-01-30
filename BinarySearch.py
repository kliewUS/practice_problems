#704. Binary Search
#https://leetcode.com/problems/binary-search/
#Find the mid-point of the array.
#If the midpoint is less than the target, go check on the right-side.
#If the midpoint is greater than the target, check the left-side.
#If midpoint is equal to the target value, return the value.
class Solution:
    def binarySearch(self, nums, start, end, target) -> int:
        if(start > end):
            return -1

        mid = (start + end) // 2

        if(nums[mid] == target):
            return mid
        elif(target > nums[mid]):
            return self.binarySearch(nums, mid+1, end, target)
        else:
            return self.binarySearch(nums, start, mid-1, target)

    def search(self, nums: List[int], target: int) -> int:
        return self.binarySearch(nums, 0, len(nums) - 1, target)

        