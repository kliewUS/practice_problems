import java.util.Arrays;

public class SquaresSortedArray{
    //977. Squares of a sorted array.
    //Iterate through the array and square each element.
    //Then sort the array.
    public int[] sortedSquares(int[] nums) {

        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);

        return nums;
    }
}