public class MinFlipsConvertNum {
    //2220. Minimum Bit Flips to Convert Number
    //https://leetcode.com/problems/minimum-bit-flips-to-convert-number/
    //XOR the start and goal values.
    //Itreate through the binary string. If it's one, increment counter by 1.
    //Return counter.
    public int minBitFlips(int start, int goal) {
        int counter = 0;
        String res = Integer.toBinaryString(start ^ goal);

        for(int i = 0; i < res.length(); i++){
            if(res.charAt(i) == '1'){
                counter++;
            }
        }

        return counter;
    }    
}
