#153. Find Minimum in Rotated Sorted Array
#https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
#Use modified binary search.
#If array isn't rotated, check if arr[low] <= arr[high]. If it is, return the first element.
#Otherwise, check if mid element is equal to left or right element.
#If it is, we update the min element to min of the current min and middle element. Then either increment left pointer or decrement right pointer.
class Solution:
    def findMin(self, nums: List[int]) -> int:
        low = 0
        high = len(nums) - 1
        
        if nums[low] <= nums[high]:
            return nums[low]

        while low <= high:

            mid = low + (high - low) // 2

            if nums[mid] < nums[mid - 1]:
                return nums[mid]

            if nums[mid] > nums[high]:
                low = mid + 1
            else:
                high = mid - 1
        
        return -1
        