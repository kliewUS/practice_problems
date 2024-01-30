#287. Find the Duplicate Number
#https://leetcode.com/problems/find-the-duplicate-number/
#Use binary search (iterative)
#Set start to 1 and end to len(nums) - 1
#Set mid to (start + end) // 2
#Run loop until start < end
#Count ele in arr that are <= mid
#If count > mid, set end = mid. Else start = mid + 1
class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        start = 1
        end = len(nums) - 1

        while start < end:
            mid = (start + end) // 2
            count = 0
            for num in nums:
                if num <= mid:
                    count += 1
            
            if count > mid:
                end = mid
            else:
                start = mid + 1
        
        return start