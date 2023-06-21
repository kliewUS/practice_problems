public class SearchInsert {
    //35. Search Insert Position
    //https://leetcode.com/problems/search-insert-position/
    //Use binary search to find the position to insert into.
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while(left <= right){
            mid = left + (right - left) / 2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] < target){
                left = mid + 1; 
            }else{
                right = mid - 1;
            }
        }

        return left;
    }    
}
