import java.util.ArrayList;
import java.util.List;

public class Subsets {
        //78. Subsets
        //https://leetcode.com/problems/subsets/description/
    
        //Use DFS. Make a decision tree.
        //Call dfs to add the base case first.
        //Then when iterating through nums. Add into the subset.
        //Call dfs on the next index.
        //When recursive call ends, remove the last element of the subset. That means we exhausted all of our options on that branch.
        public void dfs(List<List<Integer>> list, List<Integer> subset, int[] nums, int start){
            list.add(new ArrayList<>(subset)); 
            //System.out.println("Current list: " + list);
            //System.out.println("Current start: " + start);
            for(int i = start; i < nums.length; i++){
                //System.out.println("Current index: " + i);            
                subset.add(nums[i]); 
                //System.out.println("Current subset: " + subset);            
                dfs(list, subset, nums, i + 1);
                subset.remove(subset.size() - 1);
                //System.out.println("Current subset after removal: " + subset);               
            }
        }
    
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> list = new ArrayList<>();
            List<Integer> subset = new ArrayList<>();
            dfs(list, subset, nums, 0);
            return list;
        }    
}
