public class Max69Number {
    //1323. Maximum 69 Number
    //https://leetcode.com/problems/maximum-69-number/description/
    //Convert int to string.
    //Create a stringbuilder with string as input.
    //Iterate through string. If 6 is found, replace with a 9 and break.
    //Convert string to int. Return that number.
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        StringBuilder res = new StringBuilder(s);

        for(int i = 0; i < res.length(); i++){
            if(res.charAt(i) == '6'){
                res.setCharAt(i, '9');
                break;
            }
        }

        return Integer.parseInt(res.toString()); 
    }    
}
