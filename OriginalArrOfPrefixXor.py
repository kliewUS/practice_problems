#2433. Find The Original Array of Prefix Xor
#https://leetcode.com/problems/find-the-original-array-of-prefix-xor/
#Init an array with the first number from the initial arr.
#Iterate through the array. XOR that value and add it to the result array.
#arr[i] = pref[i] ^ pref[i-1]
#Return that array.
class Solution:
    def findArray(self, pref: List[int]) -> List[int]:
        res = [pref[0]]

        for i in range(1, len(pref)):
            res.append(pref[i] ^ pref[i-1])

        return res