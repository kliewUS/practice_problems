public class TribonacciTab {
    //1137. N-th Tribonacci Number
    //https://leetcode.com/problems/n-th-tribonacci-number/
    public int tribonacci(int n) {
        //Tabulation bottom-up
        //if n < 2, return n
        //else if n == 2, return 1
        //Otherwise, init a new array to store intermediate results.
        //Iterate from 3 to n. Store the result into the array.
        //Return mem[n]

        if(n < 2){
            return n;
        }else if(n == 2){
            return 1;
        }

        int[] mem = new int[n+1];

        mem[0] = 0;
        mem[1] = 1;
        mem[2] = 1;

        for(int i = 3; i <= n; i++){
            mem[i] = mem[i - 1] + mem[i - 2] + mem[i - 3];
        }

        return mem[n];
    }    
}
