#744. Find Smallest Letter Greater Than Target
#https://leetcode.com/problems/find-smallest-letter-greater-than-target/
#Use binary search to find the smallest character greater than target.
#If the midpoint is less than the target, go check on the right-side.
#If the midpoint is greater than or equal the target, check the left-side.
#Otherwise, return the letter.
class Solution:
    def binarySearch(self, letters, start, end, target) -> int:
        if(start > end):
            return letters[start % len(letters)]

        mid = (start + end) // 2

        if(target >= letters[mid]):
            return self.binarySearch(letters, mid+1, end, target)
        else:
            return self.binarySearch(letters, start, mid-1, target)

    def nextGreatestLetter(self, letters: List[str], target: str) -> str:
        return self.binarySearch(letters, 0, len(letters) - 1, target)        