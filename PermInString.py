from collections import Counter

#567. Permutation in String
#https://leetcode.com/problems/permutation-in-string/
#Init a Counter object that will track freq diff of chars between s1 and s2
#Set up the initial count by decrementing for each char in s1.
#And incrementing for each char in first window of s2.
#Calculate the init diff count, which is the sum of non-zero counts in Counter.
#This represents how many chars' freq do not match between s1 and current window.
#Start traversing s2 with a window size of s1.
#For every step:
#If diff count is zero, then return true.
#Update the Counter by incrementing count for new char entering window, and decrementing count for char leaving window.
#Adjust the diff count if updated char count changes from zero to non-zero, vice versa.
#If loop completes and diff count is not zero, return false.
class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        pattern_len = len(s1)
        text_len = len(s2)

        if pattern_len > text_len:
            return False

        char_count = Counter()

        for pattern_char, text_char in zip(s1, s2[:pattern_len]):
            char_count[pattern_char] -= 1
            char_count[text_char] += 1

        diff_count = sum(x != 0 for x in char_count.values())

        if diff_count == 0:
            return True

        for i in range(pattern_len, text_len):
            char_out = s2[i - pattern_len]
            char_in = s2[i]

            if char_count[char_in] == 0:
                diff_count += 1
            char_count[char_in] += 1
            if char_count[char_in] == 0:
                diff_count -= 1

            if char_count[char_out] == 0:
                diff_count += 1
            char_count[char_out] -= 1
            if char_count[char_out] == 0:
                diff_count -= 1

            if diff_count == 0:
                return True 

        return False               