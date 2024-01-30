#392. Is Subsequence (Recursion)
#https://leetcode.com/problems/is-subsequence/
#If the current two characters are matching, then move ahead on both strings.
#Otherwise, only move by one character on the second string.
class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        l1 = len(s)
        l2 = len(t)
        
        if l1 == 0:
            return True
        elif l2 == 0:
            return False

        if s[l1 - 1] == t[l2 - 1]:
            return self.isSubsequence(s[:l1 - 1], t[:l2 - 1])
        
        return self.isSubsequence(s, t[:l2 - 1])