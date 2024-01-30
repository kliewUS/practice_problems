#128. Longest Consecutive Sequence
#https://leetcode.com/problems/longest-consecutive-sequence/
#Create a hash/set and insert all elements to the hast
#For every element, check if the element is the starting point of a sequence.
#If arr[i] - 1 is not found in the hash, then it is the first element in the subsequence.
#If the element is the first element, then count num of elements in the subsequence, starting with this element.
#Iterate from arr[i] + 1 until the last element can be found.
#If count is greater than previous longest subsequnece found, then update the value.
class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        ans = 0
        s = set()

        for ele in nums:
            s.add(ele)

        for i in range(len(nums)):

            if (nums[i] - 1) not in s:
                j = nums[i]
                while (j in s):
                    j += 1

                ans = max(ans, j-nums[i])

        return ans