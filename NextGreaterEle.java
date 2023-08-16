import java.util.Arrays;

public class NextGreaterEle {
    //496. Next Greater Element I
    //https://leetcode.com/problems/next-greater-element-i/
    //Create a triple loop. 
    //Check if nums1[i] == nums2[j]
    //If it is, check if any elements after j is greater than num[j].
    //If it is, replace the value. Otherwise do nothing.
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Arrays.fill(res, -1);

        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    for(int k = j+1; k < nums2.length; k++){
                        if(nums2[k] > nums2[j]){
                            res[i] = nums2[k];
                            break;
                        }
                    }  
                }
            }            
        }

        return res;
    }    
}
