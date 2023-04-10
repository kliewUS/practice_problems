import java.util.Arrays;

public class TribonacciMem {
    //1137. N-th Tribonacci Number
    //https://leetcode.com/problems/n-th-tribonacci-number/
    public int tribonacciMem(int n, int[] mem){
        int result = 0;

        if(mem[n] != -1){
            return mem[n];
        }         

        if(n == 1 || n == 2){
            result = 1;
        }else if(n > 2){
            result = tribonacciMem(n - 1, mem) + tribonacciMem(n - 2, mem) + tribonacciMem(n - 3, mem);
        }

        mem[n] = result;

        return mem[n];
    }


    public int tribonacci(int n) {
        //Top-Down/Memorization
        //Initalize an array to store the memorized values.
        //If n < 2, return n. If n == 2, return 1.
        //Otherwise get the result, which the recurrance relation is tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3).
        //Store this result in the memorized values.

        int[] mem = new int[n+1];
        Arrays.fill(mem, -1);
        return tribonacciMem(n, mem);
    }    
}
