import heapq
#347. Top K Frequent Elements
#https://leetcode.com/problems/top-k-frequent-elements/
#Create a map to store the frequency
#Itreate through the array and get their frequence.
#Put into a priority queue
#Get the top k elements using a loop.
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        dictmap = dict()
        res = []

        for num in nums:
            if num not in dictmap.keys():
                dictmap[num] = 1
            else:
                dictmap[num] += 1
        
        heap = [(v, k) for k, v in dictmap.items()]

        topEle = heapq.nlargest(k, heap)

        for idx in range(k):
            res.append(topEle[idx][1])

        return res