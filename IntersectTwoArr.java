import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectTwoArr {
    //349. Intersection of Two Arrays
    //Create an arraylist. Iterate through first array. Check if the value exists in the second array.
    //If does, check if the value exists in the result arraylist. If not, put the value in.
    //Return the arraylist as an array.
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> res = new ArrayList<>();
        List<Integer> nums2List  = Arrays.stream( nums2 ).boxed().collect( Collectors.toList() );
        for(int i = 0; i < nums1.length; i++){
            int currNum = nums1[i];
            boolean isInOtherArr = nums2List.contains(currNum);
            boolean isInResArr = res.contains(currNum);   
            if(isInOtherArr && !isInResArr){
                res.add(currNum);
            }
        }

       int[] arrRes = res.stream().mapToInt(i -> i).toArray();

       return arrRes;
    }         
}