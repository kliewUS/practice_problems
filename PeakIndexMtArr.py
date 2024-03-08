#852. Peak Index in a Mountain Array
#https://leetcode.com/problems/peak-index-in-a-mountain-array/
#Use binary search
#If mid > mid - 1 and mid > mid + 1, then return the index of the peak
#If left side of mid < mid and right side of mid > mid, then shrink the search range from mid to right. So, left = mid
#Otherwise, set the range from left to mid. So, right = mid
class Solution:
    def peakIndexInMountainArray(self, arr: List[int]) -> int:
        index = -1
        left = 0
        right = len(arr) - 1
        
        while(left < right):
            mid = left + (right - left) // 2

            if(arr[mid] > arr[mid - 1] and arr[mid] > arr[mid + 1]):
                return mid
            
            if arr[mid - 1] < arr[mid] and arr[mid + 1] > arr[mid]:
                left = mid
            else:
                right = mid

        return index