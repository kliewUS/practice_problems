import java.util.Random;

public class QuickSelect {
    

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int quickSelect(int[] arr, int start, int end, int k){

        if(start == end){
            return arr[start];
        }

        int pivotIndex = partition(arr, start, end);

        if(pivotIndex == k - 1){
            return arr[pivotIndex];
        }else if(pivotIndex < k - 1){
            return quickSelect(arr, pivotIndex + 1, end, k);
        }else{
            return quickSelect(arr, start, pivotIndex - 1, k);
        }

    }

    public static int quickSelectAlt(int[] arr, int start, int end, int k){

        if(start == end){
            return arr[start];
        }

        int pivotIndex = partition(arr, start, end);

        if(pivotIndex == k){
            return arr[pivotIndex];
        }else if(k < pivotIndex){
            return quickSelectAlt(arr, start, pivotIndex - 1, k);            
        }else{
            return quickSelectAlt(arr, pivotIndex + 1, end, k);
        }

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


    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int pivotloc = start;

        for(int i = start; i <= end; i++){
            if(arr[i] < pivot){
                swap(arr, i, pivotloc);
                pivotloc++;
            }
        }

        swap(arr, end, pivotloc);

        return pivotloc;        
    }

    public static int randomPartition(int[] arr, int start, int end, int pIndex){
        int pivot = arr[pIndex];

        swap(arr, pIndex, end);

        int pivotloc = start;

        for(int i = start; i <= end; i++){
            if(arr[i] < pivot){
                swap(arr, i, pivotloc);
                pivotloc++;
            }
        }

        swap(arr, end, pivotloc);

        return pivotloc;        
    }    

    public static void main(String[] args)
    {
        int[] arr = {3,2,1,5,6,4};

        //int res = quickSelect(arr, 0, arr.length - 1, 2);
        //int res2 = quickSelectAlt(arr, 0, arr.length - 1, arr.length - 2);
        int res2 = quickSelectRandom(arr, 0, arr.length - 1, arr.length - 2);
        
        //System.out.println(res);

        System.out.println(res2);

    }      

}
