#658. Find K Closest Elements
#https://leetcode.com/problems/find-k-closest-elements/
#Use binary search to find the crossover point.
#low = 0 and high = len(arr) - k
#Why len(arr) - k? Because we won't able to get k elements if it's at the last element.
#Get mid = low + (high - low) // 2
#Three cases:
# x <= arr[mid]
# x >= arr[mid + k]
# arr[mid] < x < arr[mid + k]
# left < mid < mid + k < right - Boundaries

#For x <= arr[mid], there are k + 1 elements between mid and mid + k inclusive.
#If x <= arr[mid], then mid + k will not be in the output because x will be further away from the mid + k element.
#Thus, the boundary can't start from mid + 1 and the boundary for k elements will need to start at mid or before mid. Set high = mid

#For x >= arr[mid + k], similar to the first case. If x is greater than mid, then the boundary for start of the ans lies around after mid exclusive. THus, low = mid + 1

# arr[mid] < x < arr[mid + k]
#Otherwise, we consider the distance of x from both mid and mid + k. If x is closer to mid, then move away from mid + k and set high to mid. Otherwise, set low to mid + 1.

#Once the crossover point is found, then return the resultant array.
class Solution:
    def findClosestElements(self, arr: List[int], k: int, x: int) -> List[int]:
        low = 0
        high  = len(arr) - k

        while low < high:
            mid = low + (high - low) // 2
            if x <= arr[mid]:
                high = mid
            elif x >= arr[mid + k]:
                low = mid + 1
            else:
                if abs(x - arr[mid]) <= abs(x - arr[mid + k]):
                    high = mid
                else:
                    low = mid + 1
        
        return arr[low:low+k]