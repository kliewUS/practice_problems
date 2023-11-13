#451. Sort Characters By Frequency
#https://leetcode.com/problems/sort-characters-by-frequency/description/
#Very similar to Problem 1636. Refer to SortArrByIncFreq.py for more details.
class Solution:
    def frequencySort(self, s: str) -> str:
        hashtable = defaultdict(int)

        for string in s:
            hashtable[string] += 1

        s = "".join(sorted(s, key=lambda string: (-hashtable[string], string)))

        return s        
        