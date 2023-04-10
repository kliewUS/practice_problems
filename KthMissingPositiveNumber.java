import java.util.ArrayList;

public class KthMissingPositiveNumber {

    //1539. Kth Missing Positive Number
    //https://leetcode.com/problems/kth-missing-positive-number/description/
    //Hint: Use Binary Search to get O(Log n) time complexity.

    public int findKthPositive(int[] arr, int k) {
        //Initalize an empty array to store the missing integers.
        //Iterate through the array. Check if the number exists in the array. If it doesn't, then add to the array.
        //Once we reach to the kth element, return the kth element.

        ArrayList<Integer> missingNums = new ArrayList<Integer>();
        int curNum = 1;
        int i = 0;

        while(missingNums.size() <= k && i < arr.length){
            if(curNum != arr[i]){
                missingNums.add(curNum);
                curNum++;
            }else{
                curNum++;
                i++;
            }
        }

        while(missingNums.size() <= k){
            missingNums.add(curNum);
            curNum++;            
        }

        return missingNums.get(k-1);
    }    
}
