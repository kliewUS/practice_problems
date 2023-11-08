#1021. Remove Outermost Parentheses
#https://leetcode.com/problems/remove-outermost-parentheses/description/
# Optimal Solution
# Initialize two variables, open_count and close_count, to zero
# Initialize an empty string called result.
# Loop through each character c in the input string s.
# If c is an opening parenthesis, increment open_count.
# If c is a closing parenthesis, increment close_count.
# If open_count and close_count are equal and greater than zero, this means that we have encountered a complete pair of opening and closing parentheses, so we can add the substring between them to the result string.
# Reset open_count and close_count to zero.
# Return the result string.
class Solution:
    def removeOuterParentheses(self, s: str) -> str:
        open_count = 0
        close_count = 0
        res = ""
        start = 0

        for i, ch in enumerate(s):
            if ch == '(':
                open_count += 1
            if ch == ')':
                close_count += 1

            if open_count == close_count:
                res += s[start+1:i]
                start = i+1

        return res