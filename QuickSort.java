public class QuickSort {
    public static void quickSort(int[] arr, int start, int end){
        if(start < end){
            int pivot = partition(arr, start, end);
            //System.out.println("Pivot: " + pivot);
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start - 1;

        for(int j = start; j <= end - 1; j++){
            //System.out.println(i);
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i+1, end);

        // System.out.println("Current arr: ");
        // for(int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        // System.out.println("start: "+ start);
        // System.out.println("Left: " + left);

        return i + 1;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args)
    {
        int[] arr = {17, 12, 6, 19, 23, 8, 5, 10};

        quickSort(arr, 0, arr.length - 1);
        
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }       
}
