public class DivisibleAndNonDivisibleDiff {
    //2894. Divisible and Non-divisible Sums Difference
    //If num is divisble by m, then add to num1.
    //If num isn't divisible by m, then add to num2.
    //return num1 - num2.
    public int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;

        for(int i = 1; i <= n; i++){
            if(i % m == 0){
                num2 += i;
            }else{
                num1 += i;
            }
        }

        return num1 - num2;
    }    
}