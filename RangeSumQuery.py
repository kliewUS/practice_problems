#303. Range Sum Query - Immutable
#https://leetcode.com/problems/range-sum-query-immutable/
#Calculate the sum of elements of nums between indices left and right inclusive where left <= right
class NumArray:

    def __init__(self, nums: List[int]):
        self.nums = nums

    def sumRange(self, left: int, right: int) -> int:
        sum = 0
        for i in range(left, right + 1):
            sum += self.nums[i]
        
        return sum


# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(left,right)