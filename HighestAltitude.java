public class HighestAltitude {
    //1732. Find the Highest Altitude
    //https://leetcode.com/problems/find-the-highest-altitude/
    //Initalize two variables
    //One to hold current gain
    //One to hold max gain.
    //Iterate through the array and add to curGain.
    //If curGain is greater than maxGain, set maxGain to curGain's value
    //Return the maxGain.
    public int largestAltitude(int[] gain) {
        int curGain = 0;
        int maxGain = 0;

        for(int i = 0; i < gain.length; i++){
            curGain += gain[i];
            if(curGain > maxGain){
                maxGain = curGain;
            }
        }

        return maxGain;
    }    
}
