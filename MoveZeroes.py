#283. Move Zeroes
#https://leetcode.com/problems/move-zeroes/
#Set slow and fast pointer to 0
#If the fast pointer index is not a zero, then swap and move the slow pointer by 1.
class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        slow = 0
        for fast in range(len(nums)):
            if nums[fast] != 0:
                nums[slow], nums[fast] = nums[fast], nums[slow]
                slow += 1

# 1. [0,1,0,3,12] slow = 0, fast = 0 (Start)
# 2. [0,1,0,3,12] slow = 0, fast = 1
# 3. [1,0,0,3,12] slow = 1, fast = 1
# 4. [1,0,0,3,12] slow = 1, fast = 2
# 5. [1,0,0,3,12] slow = 1, fast = 3
# 6. [1,3,0,0,12] slow = 2, fast = 3
# 7. [1,3,0,0,12] slow = 2, fast = 4
# 8. [1,3,12,0,0] slow = 3, fast = 4 (Finish)