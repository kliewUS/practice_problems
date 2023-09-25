import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DifferenceOfTwoArr {
    //2215. Find the Difference of Two Arrays
    //https://leetcode.com/problems/find-the-difference-of-two-arrays/
    //Convert both arrays to list.
    //Check if any numbers of nums1 exist in nums2. If it doesn't exist in nums2, then add to the first element array of the result.
    //Do the same for nums2.
    //Also check if the element doesn't exist in the distinct lists already.
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> l1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> l2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        List<Integer> distinct1 = new ArrayList<Integer>();       
        List<Integer> distinct2 = new ArrayList<Integer>();       

        for(int i = 0; i < l1.size(); i++){
            if(l2.indexOf(l1.get(i)) == -1 && distinct1.indexOf(l1.get(i)) == -1){
                distinct1.add(l1.get(i));
            }
        }

        for(int i = 0; i < l2.size(); i++){
            if(l1.indexOf(l2.get(i)) == -1 && distinct2.indexOf(l2.get(i)) == -1){
                distinct2.add(l2.get(i));
            }
        }

        res.add(distinct1);        
        res.add(distinct2);        

        return res;
    }    
}