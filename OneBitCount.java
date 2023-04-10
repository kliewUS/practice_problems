public class OneBitCount {
    //191. Number of 1 Bits
    //https://leetcode.com/problems/number-of-1-bits/

    //Convert int to a binary number as a string.
    //Iterate through the string and if the bit is 1, then increment counter by 1.
    //return the counter.

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) { 

        String binaryNum = Integer.toBinaryString(n);
        int oneBit = 0;


        for(int i = 0; i < binaryNum.length(); i++){
            if(binaryNum.charAt(i) == '1'){
                oneBit++;
            }
        }

        return oneBit;
    }    
}
