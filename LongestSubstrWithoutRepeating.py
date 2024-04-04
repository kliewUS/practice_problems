#3. Longest Substring Without Repeating Characters
#https://leetcode.com/problems/longest-substring-without-repeating-characters/
#Init a hashset to store chars of the current substring w/o repeating ones
#Two pointers, both set to 0. i is the start of the window and j is the end of the window.
#Init a var called ans to store the len of the longest substr set to 0.
#Then traverse the string with j. Moves from left to right across the string.
#If the char is already in the hashset, then remove all chars starting from ith pos and move i forward.
#If the char isn't in the hashset, add char to the hashset.
#Update the ans variable if the current window size (j - i + 1) is larger than the max found.
#Return the ans once finished.
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        unique_chars = set()
        left = 0
        longest_substr = 0

        for right, char in enumerate(s):

            while char in unique_chars:
                unique_chars.remove(s[left])
                left += 1

            unique_chars.add(char)

            longest_substr = max(longest_substr, right - left + 1)

        return longest_substr