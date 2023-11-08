#944. Delete Columns to Make Sorted
#https://leetcode.com/problems/delete-columns-to-make-sorted/
#Itreate through the list and split all strings into a list
#Add it to numpy array.
#Then all the characters from each column and sort them. Check if they match up with the original string.
#If the sorted string doesn't equal to the original string, add to the count
import numpy as np

class Solution:
    def minDeletionSize(self, strs: List[str]) -> int:
        to_delete = 0
        temp_list = []
        for s in strs:
            temp_list.append(list(s))

        np_list = np.array(temp_list)

        for i in range(len(strs[0])):
            col = [row[i] for row in np_list]            
            lex = sorted(col, key=str.upper)
            if lex != col:
                to_delete += 1

        return to_delete
        