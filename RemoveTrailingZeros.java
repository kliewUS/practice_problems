public class RemoveTrailingZeros {
    //2710. Remove Trailing Zeros From a String
    //https://leetcode.com/problems/remove-trailing-zeros-from-a-string/
    //Itreate through the string. If the digit is not 0, then set the new end position.
    //Return the truncated string.
    public String removeTrailingZeros(String num) {
        int end = 0;

        for(int i = 0; i < num.length(); i++){
            if(num.charAt(i) != '0'){
                end = i;
            }
        }

        return num.substring(0, end + 1);
    }    
}
