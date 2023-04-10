import java.util.Arrays;

public class BinarySearchIterative {
    public static int binarySearch(int[] arr, int x, int start, int end){

        while(start <= end){
            int mid = (start + end) / 2;                    
            if(x == arr[mid]){
                return mid;
            }else if(x > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr = {4, 5, 3, 2, 1};

        Arrays.sort(arr); //Sort the array first.

        int x = 2;

        int res = binarySearch(arr, x, 0, arr.length - 1);

        System.out.println("Value " + x + " is found at index " + res);
        
    }
}
