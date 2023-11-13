#1636. Sort Array by Increasing Frequency
#Create a hashtable to get the frequence of each value.
#Create a comparator to compare the frequence of each value. If the values are the same, compare the keys.

class Solution:
    def frequencySort(self, nums: List[int]) -> List[int]:
        hashtable = defaultdict(int)

        for num in nums:
            hashtable[num] += 1

        nums = sorted(nums, key=lambda num: (-hashtable[num], num), reverse=True)

        return nums