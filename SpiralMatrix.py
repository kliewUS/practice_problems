#54. Spiral Matrix
#https://leetcode.com/problems/spiral-matrix/
#Create a seen array that denotes the cell on rth row and cth col was previously visited.
#The current pos is represent as (r,c), facing direction dir, and we want to visit R x C cells.
#As we move through the matrix, our candidate's next pos is (cr, cc)
#If candidate is within bounds of matrix and has not been seen, then that is our next pos. Otherwise, the next pos is the one after going clockwise.
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        res = []

        if not matrix:
            return res
        
        m = len(matrix)
        n = len(matrix[0])

        seen = [[0 for i in range(n)] for j in range(m)]
        dr = [0, 1, 0, -1]
        dc = [1, 0, -1, 0]
        x, y, di = 0, 0, 0

        for i in range(m * n):
            res.append(matrix[x][y])
            seen[x][y] = True
            cr = x + dr[di]
            cc = y + dc[di]

            if(0 <= cr and cr < m and 0 <= cc and cc < n and not(seen[cr][cc])):
                x = cr
                y = cc
            else:
                di = (di + 1) % 4
                x += dr[di]
                y += dc[di]

        return res
