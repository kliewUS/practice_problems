import java.util.List;

public class SumPairsLessThanTarget {
    //2824. Count Pairs Whose Sum is Less than Target
    //https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/
    //Make a double loop. 
    //If i + j < target, increment counter.
    public int countPairs(List<Integer> nums, int target) {
        int counter = 0;

        for(int i = 0; i < nums.size(); i++){
            for(int j = i + 1; j < nums.size(); j++){
                if(nums.get(i) + nums.get(j) < target){
                    counter++;
                }
            }
        }


        return counter;
    }    
}
