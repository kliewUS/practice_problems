public class FibonacciTab {
    //509. Fibonacci Number
    //https://leetcode.com/problems/fibonacci-number/description/
    public int fib(int n) {
        //Tabluation - Bottom Up
        //Initalize an array to store the intermediate results.
        //Set mem[0] = 0
        //Set mem[1] = 1
        //Iterate from 2 to n. Store the intermediate result to mem[i]
        //return n

        if(n < 2){
            return n;
        }

        int[] mem = new int[n+1];

        mem[0] = 0;
        mem[1] = 1;
   
        for(int i = 2; i <= n; i++){
            mem[i] = mem[i - 1] + mem[i - 2];
        }

        return mem[n];
    }    
}
