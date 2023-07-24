public class CountOps {
    //2169. Count Operations to Obtain Zero
    //https://leetcode.com/problems/count-operations-to-obtain-zero/
    //If num1 >= num2, num1 - num2
    //Else num2 - num1.
    //Keep doing this until one of the numbers is 0.
    public int countOperations(int num1, int num2) {
        int ops = 0;

        while(num1 > 0 && num2 > 0){

            if(num1 >= num2){
                num1 -= num2;
            }else{
                num2 -= num1;
            }

            ops++;
        }

        return ops;
    }
}