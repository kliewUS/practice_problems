public class GCDArray {
    //Initalize a min and max.
    //Itreate through the array to get the min and max.
    //Then, check from 1 to min if they divide both numbers.
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int gcd = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }

            if(nums[i] > max){
                max = nums[i];
            }
        }

        for(int j = 1; j <= min; j++){
            if(max % j == 0 && min % j == 0){
                gcd = j;
            }
        }

        return gcd;
    }    
}
