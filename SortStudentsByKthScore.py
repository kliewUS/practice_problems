#2545. Sort the Students by Their Kth Score
#https://leetcode.com/problems/sort-the-students-by-their-kth-score/
#Use sorted function to sort by the kth score.
#score.sort(key=lambda sc: sc[k], reverse=True)
class Solution:
    def sortTheStudents(self, score: List[List[int]], k: int) -> List[List[int]]:
        score.sort(key=lambda sc: -sc[k])
        return score