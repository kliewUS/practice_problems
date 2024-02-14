#162. Find Peak Element
#https://leetcode.com/problems/find-peak-element/
#Use binary search
#Get mid = low + (high - low) / 2. 
#Peform these steps recursively until l <= r. Lower bound is less than the upperbound
#Check if mid is the peak element or not. If yes, then print element and terminate.
#If not, then if the element on the left side is greater than mid, check for peak element on left. So, r = mid - 1
#If the element on the right side is greater than mid, check of peak element on right. So, l = mid + 1
class Solution:
    def binarySearchPeak(self, arr, left, right, n):
        mid = left + ((right - left) / 2)
        mid = int(mid)

        if (mid == 0 or (arr[mid - 1] <= arr[mid])) and (mid == (n - 1) or (arr[mid + 1] <= arr[mid])):
            return mid
        elif (mid > 0 and (arr[mid - 1] > arr[mid])):
            return self.binarySearchPeak(arr, left, mid - 1, n)
        else:
            return self.binarySearchPeak(arr, mid + 1, right, n)

    def findPeakElement(self, nums: List[int]) -> int:
         return self.binarySearchPeak(nums, 0, len(nums) - 1, len(nums))