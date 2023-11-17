#1817. Finding the Users Active Minutes
#https://leetcode.com/problems/finding-the-users-active-minutes/
#Create a hashmap with the id as the key and the minutes as a set
#Create a list of zeros of size k.
#Iterate through the list. Adding the ids as keys and append the minutes to the set.
#Then iterate through the dict. Get the len of the set - 1 as index and increment the element in that index.
class Solution:
    def findingUsersActiveMinutes(self, logs: List[List[int]], k: int) -> List[int]:
        hm = {}
        uams = [0] * k

        for arr in logs:
            if arr[0] not in hm.keys():
                hm[arr[0]] = {arr[1]}
            else:
                hm[arr[0]].add(arr[1])

        for uam in hm:
            uams[len(hm[uam]) - 1] += 1

        return uams


