#73. Set Matrix Zeroes
#https://leetcode.com/problems/set-matrix-zeroes/
#Traverse the matrix and update the first row and column.
#If the cell is 0, then mark matrix[i][0] and matrix[0][j] = 0.
#Special Case: If i = 0, then matrix[0][0] = 0. If j = 0, then C0 = 0, since one cell cannot rep for both row and col.
#Then traverse cells from (1, 1) to (n -1, m - 1) and update the matrix the matrix cell at (i, j) according to the first row and col.
#Finally, we change matrix's first row and col of the matrix as followed, the row and then the col.
#If matrix[0][0] = 0, we change all elements from (0, 1) to (0, m - 1) = 0
#If C0 = 0, we change all elements from (0, 0) to (n-1, 0) = 0
class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        n, m = len(matrix), len(matrix[0])
        c0 = 1

        for i in range(n):
            for j in range(m):
                if matrix[i][j] == 0:
                    matrix[i][0] = 0

                    if j == 0:
                        c0 = 0
                    else:
                        matrix[0][j] = 0
        
        for i in range(1, n):
            for j in range(1, m):
                if matrix[i][j] != 0:
                    if matrix[i][0] == 0 or matrix[0][j] == 0:
                        matrix[i][j] = 0
        
        if matrix[0][0] == 0:
            for j in range(m):
                matrix[0][j] = 0
        if c0 == 0:
            for i in range(n):
                matrix[i][0] = 0
        