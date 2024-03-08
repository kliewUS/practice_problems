#452. Minimum Number of Arrows to Burst Balloons
#https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/
#Init an arrow variable. Set to 1 since we need at least 1 arrow to pop all balloons.
#Sort the points based on the starting point. If it has the same starting point, then sort by the ending point in ascending order.
#Set our inital endpoint to the first balloon's endpoint.
#If the endpoint is less than the current balloon's starting point, then increment arrow var by 1 and set the endpoint to the current balloon's ending point.
#Return the min num of arrows needed to burst all balloons.
class Solution:
    def findMinArrowShots(self, points: List[List[int]]) -> int:
        arrows = 1
        points = sorted(points, key=functools.cmp_to_key(lambda point1, point2: point1[1] - point2[1]))
        endpoint = points[0][1]

        for idx in range(len(points)):
            if(endpoint < points[idx][0]):
                arrows += 1
                endpoint = points[idx][1]

        return arrows