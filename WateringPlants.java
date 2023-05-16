public class WateringPlants {
    //2079. Watering Plants
    //https://leetcode.com/problems/watering-plants/
    //Initalize a counter to keep track the number of the steps needed.
    //Initalize another variable to hold the max capacity.
    //Iterate through the plants array.
    //Subtract the capacity if there's enough water. If there isn't, increment the counter by the current index, refill capacity, and then increment the counter by the current index + 1.
    //return the counter.
    public int wateringPlants(int[] plants, int capacity) {
        int currentCapacity = capacity;
        int steps = 0;


        for(int i = 0; i < plants.length; i++){
            if(currentCapacity >= plants[i]){
                currentCapacity -= plants[i];
                steps++;
            }else{
                steps += i;
                currentCapacity = capacity;
                steps += (i + 1);
                currentCapacity -= plants[i];
            }

            // System.out.println("Current Capacity: " + currentCapacity);
            // System.out.println("Current Steps: " + steps);
        }

        return steps;
    }    
}
