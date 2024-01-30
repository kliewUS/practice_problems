#39. Combination Sum
#https://leetcode.com/problems/combination-sum/
#Remove all dups from arr and sort the arr as set r
#Recursive loop:
#If the sub-prob sum == 0, then add that array to the result.
#Run a loop until sum - arr[i] is not neg and i < len(arr)
#Push arr[i] into r anr recursively call for i and sum-arr[i], then i += 1
# Pop r[i] from the back and backtrack from there.

class Solution:
    def findNums(self, res, candidates, temp, target, idx):
        if target == 0:
            res.append(list(temp))
            return

        for i in range(idx, len(candidates)):
            if target - candidates[i] >= 0:
                temp.append(candidates[i])
                self.findNums(res, candidates, temp, target-candidates[i], i)
                temp.remove(candidates[i])

    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        res = []
        temp = []

        candidates = sorted(list(set(candidates)))
        self.findNums(res, candidates, temp, target, 0)
        return res