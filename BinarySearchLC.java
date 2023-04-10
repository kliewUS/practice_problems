public class BinarySearchLC {
    //776. Binary Search
    //https://leetcode.com/problems/binary-search/description/    
    public int binarySearch(int[] nums, int start, int end, int target){
        if(start > end){
            return -1;
        }
        
        int mid = (start + end) / 2;

        if(nums[mid] == target){
            return mid;
        }else if(target > nums[mid]){
            return binarySearch(nums, mid + 1, end, target);            
        }else{
            return binarySearch(nums, start, mid - 1, target);
        }
    }

    public int search(int[] nums, int target) {
        //Find the mid-point of the array.
        //If the midpoint is less than the target, go check on the right-side.
        //If the midpoint is greater than the target, check the left-side.
        //If midpoint is equal to the target value, return the value.
        return binarySearch(nums, 0, nums.length - 1, target);
    }    
}
