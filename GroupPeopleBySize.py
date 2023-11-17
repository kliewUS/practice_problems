#1282. Group the People Given the Group Size They Belong To
#https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/
#Itreate through the list and add each element to a dict. With index as the key and the element as the value.
#Sort the dict by its value and iterate through it.
#If the sublist is currently empty, then append to the sublist.
#After appending to the sublist, check sublist size. If sublist size is equal to the value, then append to the result list
#And clear the sublist.
class Solution:
    def groupThePeople(self, groupSizes: List[int]) -> List[List[int]]:
        hm = {}
        sublist = []
        res = []

        for idx, mem in enumerate(groupSizes):
            hm[idx] = mem

        sorted_hm = sorted(hm.items(), key=lambda x:x[1])

        for key in sorted_hm:
            sublist.append(key[0])
            if(len(sublist) == key[1]):
                res.append(sublist)
                sublist = []

        return res
