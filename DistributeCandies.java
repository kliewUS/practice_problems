import java.util.Arrays;

public class DistributeCandies{
        //1103. Distribute Candies to People
    //https://leetcode.com/problems/distribute-candies-to-people/
    //Initalize a new array with length of num people.
    //Iterate through the array. We will give n + 1 candies to first person.
    //We will increase the number of the candies we give by 1 every time we give to a person.
    //If we reach to end of the array, but we still have candies left over. Loop back to the first person.
    //Return the array.
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        Arrays.fill(res, 0);

        int currentDistribution = 1;
        int index = 0;


        while(candies > 0){
            
            if(currentDistribution < candies){
                res[index] += currentDistribution;
                candies -= currentDistribution;
                currentDistribution++;
            }else{
                res[index] += candies;
                candies = 0;
                break;
            }

            if(index < num_people - 1){
                index++;
            }else{
                index = 0;
            }
        }

        return res;
    }
}