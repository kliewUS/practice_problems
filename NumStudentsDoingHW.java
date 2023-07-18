public class NumStudentsDoingHW {
    //1450. Number of Students Doing Homework at a Given Time
    //https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/
    //Think of it as intervals. 
    //Ex: [1,2,3] - start, [3,2,7] - end, queryTime = 4
    //First Student: [1 - 3]
    //Second Student: [2 - 2]
    //Third Student: [3 - 7]
    //We need to check if the queryTime is in the interval.
    //So check if startTime is greater than or equal to queryTime or if queryTime is less than or equal to endTime.
    //If both are true, then increment counter by 1 as the queryTime is in the interval.
    //return counter
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int counter = 0;

        for(int i = 0; i < startTime.length; i++){
            if(startTime[i] <= queryTime && queryTime <= endTime[i]){
                counter++;
            }
        }

        return counter;
    }    
}
