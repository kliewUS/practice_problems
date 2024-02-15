#11. Container With Most Water
#https://leetcode.com/problems/container-with-most-water/
#Have two variables, first = 0 and last = n - 1 
#Have a variable that stores the max area.
#Run this loop until first < last
#Update max area with max(max_area, min(arr[first], arr[last]) * (last - first))
#If value at arr[first] > arr[last], then last -= 1. Otherwise, first += 1
#Return maxArea
class Solution:
    def maxArea(self, height: List[int]) -> int:
        first = 0
        last = len(height) - 1
        maxArea = 0

        while first < last:
            curArea = min(height[first], height[last]) * (last - first)
            maxArea = max(maxArea, curArea)

            if height[first] > height[last]:
                last -= 1
            else:
                first += 1

        return maxArea