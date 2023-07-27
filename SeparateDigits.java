import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparateDigits {
    //2553. Separate the Digits in an Array
    //https://leetcode.com/problems/separate-the-digits-in-an-array/
    //Convert array to list.
    //Convert int to string and split string.
    //Add array to the list.
    //Convert list to int.
    public int[] separateDigits(int[] nums) {
        List<String> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            String[] splitInt = Integer.toString(nums[i]).split("");
            list.addAll(Arrays.asList(splitInt));
        }
        int size = list.size();
        int[] res = new int[size];

        for(int j = 0; j < size; j++) {
            res[j] = Integer.parseInt(list.get(j));
        }

        return res;

    }    
}
