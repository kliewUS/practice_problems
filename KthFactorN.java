public class KthFactorN {
    //1492. The kth Factor of n
    //https://leetcode.com/problems/the-kth-factor-of-n/description/
    public int kthFactor(int n, int k) {
        //Initalize a variable to store the current factor and another variable to indicate the current ith factor.
        //Iterate through the factors until we reach to the kth factor or we exceed integer n.
        //Return the kth factor if found. Otherwise, return -1.

        if(k == 1){
            return 1;
        }else if(n == 1 && k != 1){
            return -1;
        }

        int factor = 2;
        int counter = 1;

        while(factor <= n){
            if(n % factor == 0){                
                counter++;
            }

            if(counter == k){
                break;
            }

            factor++;
        }


        if(counter != k){
            return -1;
        }else{
            return factor;
        }

    }   
}
