public class PivotInt {
    //2485. Find the Pivot Integer
    //https://leetcode.com/problems/find-the-pivot-integer/
    //Iterate through all ints to n.
    //Then make another loop to decrement the sum.
    //If the temp == sum, then return the pivot.
    //Otherwise, return -1.
    public int pivotInteger(int n) {
        int sum = 0;
        int temp = 0;

        for(int i = 1; i <= n; i++){
            sum += i;
        }

        for(int j = 1; j <= n; j++){
            sum -= j;            
            if(sum == temp){
                return j;    
            }
            temp += j;
        }

        return -1;
    }    
}
