public class CalculateDelay {
    //2651. Calculate Delayed Arrival Time
    //https://leetcode.com/problems/calculate-delayed-arrival-time/
    //If the arrivalTime + delayTime >= 24, minus by 24 to get 24 hour format.
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int actualArrivalTime = arrivalTime + delayedTime;

        if(actualArrivalTime >= 24){
            return actualArrivalTime - 24;
        }else{
            return actualArrivalTime;
        }
    }    
}
