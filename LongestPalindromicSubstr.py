#5. Longest Palindromic Substring
#https://leetcode.com/problems/longest-palindromic-substring/
#Use DP.
#Hold a 2d bool table that will be filled bottom-up
#From 0 to N - length, find the end of substr j = i + length - 1
#Value of table[i][j] is true. If substr is palindrome, then false.
#To compute table[i][j], check value of table[i+1][j+1]
#If value is true and str[i] is the same as str[j], then set table[i][j] true.
#Otherwise, set table[i][j] false.
#Fill the table for substrings of length = 1 and length = 2.
#Update longest palindrome accordingly when new palindrome of greater length is found.
class Solution:
    def longestPalindrome(self, s: str) -> str:
        n = len(s)

        table = [[0 for x in range(n)] for y in range(n)]

        maxLen = 1
        i = 0
        while(i < n):
            table[i][i] = True
            i += 1

        start = 0
        i = 0
        while i < n - 1:
            if s[i] == s[i + 1]:
                table[i][i + 1] = True
                start = i
                maxLen = 2
            i += 1

        k = 3
        while k <= n:
            i = 0
            while i < (n - k + 1):
                j = i + k - 1
                if(table[i+1][j-1] and s[i] == s[j]):
                    table[i][j] = True

                    if k > maxLen:
                        start = i
                        maxLen = k
                i += 1
            k += 1

        end = start + maxLen - 1

        return s[start:end + 1]