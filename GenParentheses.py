#22. Generate Parentheses
#https://leetcode.com/problems/generate-parentheses/
#Create a recursive method that wil take a string, count of opening brackets (o) and closing brackets, and the value of n, the number of pairs
#If value of opening and closing bracket are equal to n, print string and return it.
#If count of opening is greater than count of closing, then recursively call the method with the following params: (s + ), o, c + 1, n)
#If count of opening is lesser than count of closing, then recursively call the method with the following params: (s + (, o + 1, c, n)
class Solution:
    def generate(self, s, arr, open, close, n):
        if close == n:
            arr.append(s)
            return
        else:
            if open > close:
                self.generate(s + ')', arr, open, close + 1, n)
            if open < n:
                self.generate(s + '(', arr, open + 1, close, n)

    def generateParenthesis(self, n: int) -> List[str]:
        res = []

        if n > 0:
            self.generate("", res, 0, 0, n)

        return res