public class DoubleReversal {
    //2119. A Number After a Double Reversal
    //https://leetcode.com/problems/a-number-after-a-double-reversal/
    //First, we find the remainder of the given number by using the modulo (%) operator.
    //Multiply the variable reverse by 10 and add the remainder into it.
    //Divide the number by 10.
    //Do this twice.
    public boolean isSameAfterReversals(int num) {
        int originalNum = num;
        int reverse = 0;
        int reverse2 = 0;

        while(num != 0){
            int rem = num % 10;  
            reverse = reverse * 10 + rem;  
            num = num/10;  
        }

        while(reverse != 0){
            int rem2 = reverse % 10;  
            reverse2 = reverse2 * 10 + rem2;  
            reverse = reverse/10;  
        }

        // System.out.println(originalNum);
        // System.out.println(reverse2);

        return originalNum == reverse2;
    }    
}
