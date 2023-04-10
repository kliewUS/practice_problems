import java.util.Arrays;
import java.util.List;

//345. Reverse Vowels of a String (Revisit this problem on Saturday.)
//https://leetcode.com/problems/reverse-vowels-of-a-string/description/

public class ReverseVowels {
    public String reverseVowels(String s) {
        //Initalize an array of vowels.
        //If string length is less than or equal to 1 or there are no vowels, return the input string.
        //Make two pointers. First pointer starts at the beginning of the string (i = 0)
        //Second pointer starts at the end of the string (j = s.length() - 1)
        //If a pointer finds a vowel, set the vowel position to a variable.
        //If both position variables are set, then do the reversal. And reset the values.

        Character c[] = new Character [] {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        List<Character> vowels = Arrays.asList(c);
        int i = 0;
        int j = s.length() - 1;
        int pos1 = -1;
        int pos2 = -1;


        while(i <= j){
            if(vowels.contains(s.charAt(i))) {
                pos1 = i;
            }else{
                i++;
            }

            if(vowels.contains(s.charAt(j))){
                pos2 = j;
            }else{
                j--;
            }

            if(pos1 != -1 && pos2 != -1){
                StringBuilder myString = new StringBuilder(s);
                myString.setCharAt(pos1, s.charAt(pos2));
                myString.setCharAt(pos2, s.charAt(pos1));
                pos1 = -1;
                pos2 = -1;
                i++;
                j--;
                s = myString.toString();
            }
        }


        return s;

    }
}
