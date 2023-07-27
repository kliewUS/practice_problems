public class ReplaceEleWithGreatest {
    //1299. Replace Elements with Greatest Element on Right Side
    //https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
    //Iterate through the array. Keep track of max number.
    public int[] replaceElements(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int max = 0;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] > max){
                    max = arr[j];
                }
            }
            if(i != arr.length - 1){
                arr[i] = max;
            }else{
                arr[i] = -1;
            }
        }


        return arr;
    } 
}
