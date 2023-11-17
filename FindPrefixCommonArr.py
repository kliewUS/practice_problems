#2657. Find the Prefix Common Array of Two Arrays
#https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/
#Use a dictionary to keep track of freq.
#Itreate through the array.
#Then iterate through the dict.
#If the freq is 2 or more, add to the counter. And set/append the value in the resultant array.
#Clear the counter afterwards
class Solution:
    def findThePrefixCommonArray(self, A: List[int], B: List[int]) -> List[int]:
        hm = defaultdict(int)
        res = [0] * len(A)
        counter = 0

        for idx in range(len(A)):
            hm[A[idx]] += 1
            hm[B[idx]] += 1

            for val in hm.values():
                if val >= 2:
                    counter += 1
            
            res[idx] = counter
            counter = 0

        return res