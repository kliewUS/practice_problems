#844. Backspace String Compare
#https://leetcode.com/problems/backspace-string-compare/description/
#In a separate method, create an empty and append each character. If it's a # and the string is not blank, then pop the previous character
#return the string when finished.
#Compare the two strings once the method calls are finished.
#It is O(n) running time because we are iterating through the string.
#It is O(1) space because we only use a StringBuilder, which is constant space.


class Solution:
    def backspace(self, s: str) -> str:
        res = []

        for c in s:
            if c == '#':
                if res:
                    res.pop()
            else:
                res.append(c)
        
        return "".join(res)


    def backspaceCompare(self, s: str, t: str) -> bool:
        return self.backspace(s) == self.backspace(t)