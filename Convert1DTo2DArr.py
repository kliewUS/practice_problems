#2022. Convert 1D Array Into 2D Array
#https://leetcode.com/problems/convert-1d-array-into-2d-array/
#Check if the length == m * n. If not, return an empty array as it's impossible to fit the elements in the 2D array.
#If it is, initalize an empty 2D array with m rows and n columns and an index variable to keep track of the current index in the original array.
#As we itreate through the 2D array, put the original elements into the new 2D array and increment the index value.
#Return the 2D array.
class Solution:
    def construct2DArray(self, original: List[int], m: int, n: int) -> List[List[int]]:
        length = len(original)

        if(length != m * n):
            return []
        
        res = [[0 for x in range(n)] for y in range(m)]
        idx = 0

        for i in range(m):
            for j in range(n):
                res[i][j] = original[idx]
                idx += 1

        return res