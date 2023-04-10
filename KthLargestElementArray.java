import java.util.Random;

public class KthLargestElementArray {
    //215. Kth Largest Element in an Array
    //https://leetcode.com/problems/kth-largest-element-in-an-array/description/
    //Use Randomized QuickSelect algorithm. Very similar to QuickSort algorithm
    //Get a random pivot. After that swap it with the last element and do the partition from there.
    //If the index is less than k, make a recursive call to quickSelect for the left side of the partition.
    //Otherwise, make a recursive call to quickSelect for the right side of the partition.

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static int quickSelectRandom(int[] arr, int start, int end, int k){

        if(start == end){
            return arr[start];
        }

        int randPivotIndex = new Random().nextInt(end - start) + start; //Gets a random index from the range between 0 to arr.length - 1
        int pivotIndex = randomPartition(arr, start, end, randPivotIndex);

        if(pivotIndex == k){
            return arr[pivotIndex];
        }else if(k < pivotIndex){
            return quickSelectRandom(arr, start, pivotIndex - 1, k);            
        }else{
            return quickSelectRandom(arr, pivotIndex + 1, end, k);
        }

    }


    public static int randomPartition(int[] arr, int start, int end, int pIndex){
        int pivot = arr[pIndex];

        swap(arr, pIndex, end);

        int pivotloc = start;

        for(int i = start; i < end; i++){
            if(arr[i] <= pivot){
                swap(arr, i, pivotloc);
                pivotloc++;
            }
        }

        swap(arr, end, pivotloc);

        return pivotloc;        
    }   


    public int findKthLargest(int[] nums, int k) {
        return quickSelectRandom(nums, 0, nums.length - 1, nums.length - k);
    }
}
