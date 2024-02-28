#15. 3Sum
#https://leetcode.com/problems/3sum/
#Utilize two pointers solution.
#Sort the array if isn't already.
#Move the left pointer if the total is lower than target (Increment by 1)
#Move the right pointer if the total is greater than target (Decrement by 1)
#Iterate through the nums.
#if n is positive, break the loop since we can never sum to zero
#If n == nums[i - 1], then skip because we can't have duplicate triplets.
#Keep looping until left < right
#Start looking between the next element and the last element and work inwards.
#Tighten the window, so we don't see the solution again. Check to make sure that nums[l] and nums[r] are the not the same.
#Have two loops to ensure this.
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        res = []

        for i, n in enumerate(nums):
            if n > 0:
                break
            if i > 0 and n == nums[i-1]:
                continue
            
            l = i + 1
            r = len(nums) - 1

            while l < r:
                tripsum = n + nums[l] + nums[r]

                if tripsum < 0:
                    l += 1
                elif tripsum > 0:
                    r -= 1
                else:
                    res.append([n, nums[l], nums[r]])
                    l += 1
                    r -= 1

                    while nums[l] == nums[l-1] and l < r:
                        l += 1

                    while nums[r] == nums[r+1] and l < r:
                        r -= 1
            
        return res