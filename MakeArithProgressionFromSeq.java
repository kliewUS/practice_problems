import java.util.Arrays;

public class MakeArithProgressionFromSeq {
    //1502. Can Make Arithmetic Progression From Sequence
    //https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
    //Sort the array in ascending order.
    //Compare the difference between each two numbers. Store in a variable.
    //If the difference doesn't match, return false.
    //Otherwise true.
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int difference = Math.abs(arr[1] - arr[0]);
        int currentDifference = 0;

        for(int i = 1; i < arr.length - 1; i++){
            currentDifference = Math.abs(arr[i+1] - arr[i]);

            if(currentDifference != difference){
                return false;
            }
        }

        return true;
    }    
}
