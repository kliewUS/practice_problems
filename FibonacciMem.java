import java.util.Arrays;

public class FibonacciMem {
    //509. Fibonacci Number
    //https://leetcode.com/problems/fibonacci-number/description/
    public int fibMem(int n, int[] mem){

        if(mem[n] != -1){
            return mem[n];
        }

        int result;

        if(n == 0){
            result = 0;
        }else if(n == 1 || n == 2){
            result = 1;
        }else{
            result = fibMem(n - 1, mem) + fibMem(n - 2, mem);                
        }

        mem[n] = result;

        return mem[n];
    }

    public int fib(int n) {
        //Use DP.
        //Top-Down Approach (Memorization/Recursion)
        //Initalize a array to hold the memorized values.
        //If mem[n] doesn't exist, compute the value and store the value into the memorization array.
        //Otherwise, return the memorized value.
        int[] mem = new int[n+1];
        Arrays.fill(mem, -1);

        return fibMem(n, mem);
    }    
}
