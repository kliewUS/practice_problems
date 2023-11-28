#48. Rotate Image
#https://leetcode.com/problems/rotate-image/
#Rotate by square cycles
#In a cycle, it's the first row, last column, last row, first column. Rotate them clockwise.

class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        length = len(matrix[0])

        for i in range(int(length / 2)):
            for j in range(i, length - i - 1):
                matrix[i][j], matrix[length-1-j][i], matrix[length-1-i][length-1-j], matrix[j][length-1-i] = matrix[length-1-j][i], matrix[length-1-i][length-1-j], matrix[j][length-1-i], matrix[i][j]


        