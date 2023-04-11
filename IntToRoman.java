public class IntToRoman{
    //12. Integer to Roman
    //https://leetcode.com/problems/integer-to-roman/

        //I - 1
        //IV - 4
        //V - 5
        //IX - 9
        //X - 10
        //XL - 40
        //L - 50
        //XC - 90
        //C - 100
        //CD - 400
        //D - 500
        //CM - 900
        //M - 1000

    //Have two arrays.
    //One for the Strings
    //One for the values
    //Divide the number by the value in the list.
    //If the result is 0, then move to the next key-value pair
    //Otherwise, append to the string with the key and mod the number.
    //If the number is 0, then break the loop and return the value.


    public String intToRoman(int num) {

    
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder res = new StringBuilder();

        int i = 0;

        while(num > 0){
            int count = num / values[i];

            if(count > 0){
                for(int j = 0; j < count; j++){
                    res.append(symbols[i]);
                }
                num = num % values[i];
            }

            i++;
        }


        return res.toString();
    }
}