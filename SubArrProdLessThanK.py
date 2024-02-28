#713. Subarray Product Less Than K
#https://leetcode.com/problems/subarray-product-less-than-k/
#Initialze a starting pointer at index 0.
#Iterate through the array and compute the product of the array elements and store into a variable called multi.
#For each iteration, add all subarrays with product < k ending at cur right pointer to the result.
#After iteration is complete, we consider all subarrays ending at every pos in nums.
#No subarr considered twice, since we advance the right pointer every iteration. We only consider subarr ending at new right pointer.
#No overlaps between any pairs of iterations.
#Check if product < k. Init a new variable subArrProd to keep track of cur subarry product.
#Advance the left pointer until subArrProd < k
#This number is added to the result, which is the length of current subarray, since there are n sub-subarrays ending at cur right pointer.
#Return the count of all subarray less than product K.
class Solution:
    def numSubarrayProductLessThanK(self, nums: List[int], k: int) -> int:
        res = 0
        multi = 1
        start = 0

        for end, endNum in enumerate(nums):
            multi *= endNum

            while multi >= k and start <= end:
                multi //= nums[start]
                start += 1

            if multi < k:
                subArrlen = end + 1 - start
                res += subArrlen
            else:
                pass

        return res