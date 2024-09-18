import java.util.HashMap;

//575. Distribute Candies
//https://leetcode.com/problems/distribute-candies/
//Initalize an hashmap and maxCandies. maxCandies will determine the max num of the type of candies that can be eaten.
//Iterate through candyType. If it doesn't exist, put in hashmap.
//Return the size of the hashmap if the size is less than maxCandies. Otherwise, return maxCandies.

public class DistributeCandiesA2 {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int maxCandies = candyType.length / 2;
        for(int i = 0; i < candyType.length; i++){
            if (!hm.containsKey(candyType[i])){
                hm.put(candyType[i], 1);
            }
        }

        if(hm.size() < maxCandies){
            return hm.size();
        }else{
            return maxCandies;
        }

    }

}
