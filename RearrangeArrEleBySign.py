#2149. Rearrange Array Elements by Sign
#https://leetcode.com/problems/rearrange-array-elements-by-sign/
#Have two arrays to store the pos and neg ints
#Create an res array with len(nums)
#Pop the positive int first then the negative int second.
class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        pos_arr = []
        neg_arr = []
        res_arr = []

        for num in nums:
            if num < 0:
                neg_arr.append(num)
            else:
                pos_arr.append(num)

        while pos_arr and neg_arr:
                res_arr.append(pos_arr.pop(0)) 
                res_arr.append(neg_arr.pop(0))            

        return res_arr
