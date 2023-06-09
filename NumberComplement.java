public class NumberComplement{
    //476. Number Complement
    //https://leetcode.com/problems/number-complement/
    //Convert to binary string.
    //If bit is 1, flip to 0. Vice versa.
    //Convert back to decimal and return that value.
    public int findComplement(int num) {
        String binaryNum = Integer.toBinaryString(num);
        StringBuilder binary = new StringBuilder(binaryNum);

        for(int i = 0; i < binary.length(); i++){
            if(binary.charAt(i) == '1'){
                binary.replace(i, i+1, "0");
            }else{                
                binary.replace(i, i+1, "1");                
            }
        }

        return Integer.parseInt(binary.toString(),2);
    }
}