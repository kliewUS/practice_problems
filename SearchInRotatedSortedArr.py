#33. Search in Rotated Sorted Array
#https://leetcode.com/problems/search-in-rotated-sorted-array/
#Use binary search, but modify it, so it accounts for the inflection point. The point where the values take a sudden dip before rising again.
#If mid element is the target, return the index.
#If middle element is greater than the element at the 0th index, this means we are on the left of the inflection point.
#If target element is also on the left side of both the inflection point and the middle element, then we will go to the left of the middle element. Otherwise, go right of the middle element.
#If middle element is less than the element at the 0th index, this means we are on the right of the inflection point.
#If target element is also on the right side of both the inflection point and the middle element, then we will go to the right of the middle element. Otherwise, go left of the middle element.
class Solution:
    def search(self, nums: List[int], target: int) -> int:
        left = 0
        right = len(nums) - 1

        while left <= right:
            mid = left + (right - left) // 2

            if nums[mid] == target:
                return mid
            elif nums[mid] < nums[right]:
                if nums[right] >= target and nums[mid] < target:
                    left = mid + 1
                else:
                    right = mid - 1                
            else:
                if nums[left] <= target and nums[mid] > target:
                    right = mid - 1
                else:
                    left = mid + 1

        return -1
        