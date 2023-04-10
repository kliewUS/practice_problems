public class MergeSort {
    
    public static void mergeSort(int[] arr, int left, int right){
        if(left < right){
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
    
        }
    }

    public static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1 + 1];
        int[] rightArr = new int[n2 + 1];

        for(int i = 0; i < n1; i++){
            leftArr[i] = arr[left + i];
        }

        for(int j = 0; j < n2; j++){
            rightArr[j] = arr[mid + 1 + j];
        }

        leftArr[n1] = Integer.MAX_VALUE;
        rightArr[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;

        for(int k = left; k <= right; k++){
            if(leftArr[i] <= rightArr[j]){
                arr[k] = leftArr[i];
                i += 1;
            }else{
                arr[k] = rightArr[j];
                j += 1;
            }
        }
        
    }

    public static void main(String[] args)
    {
        int[] arr = {12, 11, 13, 5, 6, 7};

        mergeSort(arr, 0, arr.length - 1);
        
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }        

}
