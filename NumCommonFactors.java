public class NumCommonFactors {
    //2427. Number of Common Factors
    //https://leetcode.com/problems/number-of-common-factors/
    //Iterate from 1 to 1000, check if a % n and a % b == 0.
    public int commonFactors(int a, int b) {
        int factors = 0;

        for(int i = 1; i <= 1000; i++){
            if(a % i == 0 && b % i == 0){
                factors++;
            }
        }

        return factors;
    }    
}
