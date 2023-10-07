public class CountGoodTriplets {
    //1534. Count Good Triplets
    //https://leetcode.com/problems/count-good-triplets/
    //Use a triple loop to get all combinations.
    //If all conditions are true, then increment counter by 1.
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int counter = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                for(int k = j + 1; k < arr.length; k++){
                    if(Math.abs(arr[i] - arr[j]) <= a && 
                        Math.abs(arr[j] - arr[k]) <= b && 
                        Math.abs(arr[i] - arr[k]) <= c){
                            counter++;
                        }
                }
            }
        }

        return counter;
    }    
}
