public class BeautifulPairs {
    //2748. Number of Beatuiful Pairs
    //https://leetcode.com/problems/number-of-beautiful-pairs/
    //Create a double loop to go over each pair.
    //For every i, get the first digit. For every j, get the last digit.
    //Compare the gcd with these two digit. If they are co-prime, increment counter.
    //Return the counter.
    public int gcd(int a, int b){
        if(b == 0){
            return a;
        }else{
            return gcd(b, Math.abs(a - b));
        }
    }

    public int countBeautifulPairs(int[] nums) {
        int beautifulPairs = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){

                String firstDigit = Integer.toString(nums[i]);
                int firstVal = Character.getNumericValue(firstDigit.charAt(0));  
                String lastDigit = Integer.toString(nums[j]);
                int lastVal = Character.getNumericValue(lastDigit.charAt(lastDigit.length() - 1)); 

                if(gcd(firstVal, lastVal) == 1){
                    beautifulPairs++;
                }

            }
        }


        return beautifulPairs;
    }    
}
