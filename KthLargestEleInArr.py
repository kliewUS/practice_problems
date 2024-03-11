import random
#215. Kth Largest Element in an Array
#https://leetcode.com/problems/kth-largest-element-in-an-array/
#Use Randomized Quickselect algo. Similar to Quicksort.
#Get random pivot. Swap it with the last element and do the partition there.
#If the index is less than k, make a recursive call to quickSelect for the left side of the partition.
#Otherwise, make a recursive call to quickSelect for the right side of the partition.
#To avoid worst case scenario, when partitioning the array. If the array contains all equal elements, then pivotloc is incremented.
class Solution:
    def quickSelectRand(self, arr, start, end, k):
        if start == end:
            return arr[start]

        randpividx = random.randint(0, end - start) + start
        pividx = self.randomPart(arr, start, end, randpividx)

        if pividx == k:
            return arr[pividx]
        elif k < pividx:
            return self.quickSelectRand(arr, start, pividx - 1, k)
        else:
            return self.quickSelectRand(arr, pividx + 1, end, k)

    def randomPart(self, arr, start, end, pidx):
        pivot = arr[pidx]
        arr[pidx], arr[end] = arr[end], arr[pidx]
        pivotloc = start

        for idx in range(start, end):
            if arr[idx] < pivot or (arr[idx] == pivot and idx % 2 != 0):
                arr[idx], arr[pivotloc] = arr[pivotloc], arr[idx]
                pivotloc += 1

        arr[end], arr[pivotloc] = arr[pivotloc], arr[end]

        return pivotloc       


    def findKthLargest(self, nums: List[int], k: int) -> int:
        return self.quickSelectRand(nums, 0, len(nums) - 1, len(nums) - k)