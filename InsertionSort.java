public class InsertionSort {
    
    public static void insertionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int j = i;
            while(j > 0 && arr[j - 1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j = j - 1;
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {12, 11, 13, 5, 6};

        insertionSort(arr);
        
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }    

}
