public class AltDigitSum {
    //2544. Alternating Digit Sum
    //https://leetcode.com/problems/alternating-digit-sum/
    //Turn into int into string and split digits.
    //For every even digit, add to sum.
    //For every odd digit, subtract from sum.
    public int alternateDigitSum(int n) {
        int sum = 0;
        String num = Integer.toString(n);
        String[] arr = num.split("");

        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                sum += Integer.valueOf(num.substring(i, i+1));
            }else{
                sum -= Integer.valueOf(num.substring(i, i+1));
            }
        }

        return sum;
    }    
}
