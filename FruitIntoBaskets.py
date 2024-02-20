#904. Fruit Into Baskets
#https://leetcode.com/problems/fruit-into-baskets/
#Create a hashmap to check num of distinct elements
#Iterate through the array until right < len(fruits)
#If the count of distinct eles is more than 2, start to remove elements from starting index until it is less than 2.
#If the occurence of the element becomes 0, remove it from the map.
#Keep updating max Length until it is less than 2.
class Solution:
    def totalFruit(self, fruits: List[int]) -> int:
        fruits_type = Counter()
        distinct_ele = 0
        max_fruits = 0
        left = 0
        right = 0
        n = len(fruits)

        while right < n:
            if fruits_type[fruits[right]] == 0:
                distinct_ele += 1
            fruits_type[fruits[right]] += 1

            while distinct_ele > 2:
                fruits_type[fruits[left]] -= 1               
                if fruits_type[fruits[left]] == 0:
                    distinct_ele -= 1
                left += 1
            
            max_fruits = max(max_fruits, right - left + 1)
            right += 1
        
        return max_fruits