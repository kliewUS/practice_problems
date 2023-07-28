import java.util.Arrays;

public class NumEvenAndOddBits {
    //2595. Number of Even and Odd Bits
    //https://leetcode.com/problems/number-of-even-and-odd-bits/
    //Convert int to string binary.
    //Check each indices value. If it's one, check if it's even or odd and increment it's respective counter.
    //Reverse the string to start from least significant bit.
    public int[] evenOddBit(int n) {
        int[] res = new int[2];
        Arrays.fill(res, 0);
        String binary = Integer.toBinaryString(n);
        StringBuilder reverseBinary = new StringBuilder(binary);
        reverseBinary.reverse();

        for(int i = 0; i < reverseBinary.length(); i++){
            if(reverseBinary.charAt(i) == '1'){
                if(i % 2 == 0){
                    res[0] += 1;
                }else{
                    res[1] += 1;
                }
            }
        }

        return res;
    }    
}
