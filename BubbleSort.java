public class BubbleSort {
    //Run a nested for loop to traverse the input array using two variables i and j, such that 0 ≤ i < n-1 and 0 ≤ j < n-i-1
    //If arr[j] is greater than arr[j+1] then swap these adjacent elements, else move on
    //Print the sorted array
    
    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {4, 5, 3, 2, 1};

        bubbleSort(arr);
        
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }


}
