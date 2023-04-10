import java.util.Arrays;

public class BinarySearch {
    
    public static int binarySearch(int[] arr, int x, int start, int end){
        if (start > end){
            return -1;
        }

        int mid = (start + end) / 2;

        if(x == arr[mid]){
            return mid;
        }else if(x > arr[mid]){
            return binarySearch(arr, x, mid+1, end);
        }else{
            return binarySearch(arr, x, start, mid - 1);
        }
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
