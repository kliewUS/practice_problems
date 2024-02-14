#75. Sort Colors
#https://leetcode.com/problems/sort-colors/
#Use Quicksort with the pivot being the last element. (Recursively)
#Place the pivot at the correct position in the array.
#We partition all elements that are smaller than the pivot to the left.
#And we partition all elements that are bigger than the pivot to the right.
#Once the partition process is done, the array is sorted

class Solution:
    def quickSort(self, nums, start, end):
        if(start < end):
            partIdx = self.partition(nums, start, end)
            self.quickSort(nums, start, partIdx - 1)            
            self.quickSort(nums, partIdx + 1, end)            
    
    def partition(self, nums, start, end):
        pivot = nums[end]
        i = start - 1

        for j in range(start, end):
            if(nums[j] < pivot):
                i += 1
                nums[i], nums[j] = nums[j], nums[i]
        
        nums[i + 1], nums[end] = nums[end], nums[i + 1]

        return i + 1

    def sortColors(self, nums: List[int]) -> None:
        self.quickSort(nums, 0, len(nums) - 1)
        