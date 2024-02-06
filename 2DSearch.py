#74. Search a 2D Matrix
#https://leetcode.com/problems/search-a-2d-matrix/
#Use binary search as the matrix is sorted.
#If current element is the target, return True
#If key is smaller than current element, then go to next row.
#If key is greater than current element, then go back to the previous column.
#If unable to locate the target number, return False
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row = 0
        col = len(matrix[row]) - 1

        while row < len(matrix) and col >= 0:
            if(matrix[row][col] == target):
                return True

            if(matrix[row][col] < target):
                row += 1
            else:
                col -= 1
        
        return False