import java.util.Arrays;

public class FindDifference {
    // 389. Find the difference
    // Sort the strings.
    // Get the length of the s. Iterate through both strings.
    // If the characters don't match, return the character of t at the position.
    // If the loop ends without finding the char, return the last character of t. 
    public char findTheDifference(String s, String t) {

        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);

        char[] chars2 = t.toCharArray();
        Arrays.sort(chars2);
        String sorted2 = new String(chars2);   

        for(int i = 0; i < sorted.length(); i++){
            if(sorted.charAt(i) != sorted2.charAt(i)){
                return sorted2.charAt(i);
            }
        }

        return sorted2.charAt(sorted2.length() - 1);
    }    
}
