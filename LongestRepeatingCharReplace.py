#424. Longest Repeating Character Replacement
#https://leetcode.com/problems/longest-repeating-character-replacement/
#Init a counter with len of 26 to zero for all elements representing the count of each letter. Init two pointers i and j to 0 and maxCount to 0 to store max freq of a single letter within the window.
#Iterate through the string using i to expand the window to the right. For every char s[i], increment count in counter arr at the position corresponding to the letter (ord(s[i]) - ord('A'))
#After updating count for the new char, update maxCount to reflect the max freq of any single char in the current window.
#At each iteration, check if the current window size (i - j + 1) is greater than allowed (maxCount + k). If it is, then this means more than k replacements are required to make all the chars in current window the same. Therefore, we need to shrink the window by incrementing j and decreasing the count of the char at the start of the window.
#Continue the process until the end of the string is reached. The difference i - j will be the length of the longest substring that can be achieved with at most k changes.
class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        counter = [0] * 26
        i = 0
        j = 0
        maxCount = 0

        while j < len(s):
            counter[ord(s[j]) - ord('A')] += 1

            maxCount = max(maxCount, counter[ord(s[j]) - ord('A')])

            if(j - i + 1) > maxCount + k:                
                counter[ord(s[i]) - ord('A')] -= 1
                i += 1


            j += 1

        return j - i

