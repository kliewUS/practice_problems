public class ReversePrefix {
    //2000. Reverse Prefix of Word
    //https://leetcode.com/problems/reverse-prefix-of-word/
    //Use indexOf to get the first occurance.
    //Use StringBuilder to hold the input string.
    //Get the substring from 0 to index.
    //Perform the reversal, combine the reversed part of the string with unreversed part of the string and return the new string.
    public String reversePrefix(String word, char ch) {
        StringBuilder res = new StringBuilder();
        int index = word.indexOf(ch);

        if(index == -1){
            return word;
        }

        System.out.println(index);

        res.append(word.substring(0, index + 1)).reverse();
        res.append(word.substring(index + 1));


        return res.toString();
    }    
}
