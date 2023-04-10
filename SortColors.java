public class SortColors {
    //75. Sort Colors
    //https://leetcode.com/problems/sort-colors/
    //Sort using QuickSort by last element.
    public void quickSort(int[] nums, int start, int end){

        if(start < end){
            int partIndex = partition(nums, start, end); //Get Partition Index
            quickSort(nums, start, partIndex-1); //Left side of partition
            quickSort(nums, partIndex+1, end); //Right side of partition
        }

    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public int partition(int[] nums, int start, int end){
        int pivot = nums[end]; //Pivot element (Element to be place at right pos)
        int i = start - 1; //Indicates the right pos of the pivot found so far.

        System.out.println(pivot);
        System.out.println(start);
        System.out.println(i);

        for(int j = start; j <= end - 1; j++){
            if(nums[j] < pivot){ //If cur element is less than pivot.
                i++; //Increment right pos of the pivot.
                swap(nums, i, j); //Perform the swap.
            }
        }

        swap(nums, i+1, end); //Swap the right pos of the pivot and the last element of the array.

        return i+1;
    }


    public void sortColors(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }    
}
