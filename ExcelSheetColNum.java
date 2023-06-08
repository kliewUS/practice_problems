public class ExcelSheetColNum {
    //171. Excel Sheet column Number
    //https://leetcode.com/problems/excel-sheet-column-number/
    //Initalize a alphabet variable to store the letters.
    //Initalize a variable to hold the length of string.
    //Initalize a variable to hold the sum.
    //Reverse the string
    //Loop through each character using this formula (Position of char) * (26^i)
    //Return the sum.
    public int titleToNumber(String columnTitle) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int sum = 0;
        int i = columnTitle.length() - 1;
        StringBuilder reverseString = new StringBuilder(columnTitle);
        reverseString.reverse();
        String reverseStr = reverseString.toString();

        while(i >= 0){
            int pos = alphabet.indexOf(reverseStr.charAt(i));          
            sum += (pos + 1) * (Math.pow(26, i));
            i--;
        }

        return sum;
    }    
}
