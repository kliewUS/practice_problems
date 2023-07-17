public class DecryptString {
    //1309. Decrypt String from Alphabet to Integer Mapping
    //https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
    //Initalize an alphabet and an empty res string.
    //Iterate through the input string. 
    //If a hash is detected within 2 indexes and is not out of bound, then map to j to z, depending on the number.
    //Otherwise, map to a to j, depending on the number.
    //Return the decoded string.
    public String freqAlphabets(String s) {
        String alphabet = " abcdefghijklmnopqrstuvwxyz";
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if((i + 2) < s.length() && s.charAt(i + 2) == '#'){
                String stringVal = s.substring(i, i+2);
                int val = Integer.parseInt(stringVal);
                res.append(alphabet.charAt(val));
                i += 2;
            }else{
                int charVal = Character.getNumericValue(s.charAt(i));
                res.append(alphabet.charAt(charVal));
            }
        }

        return res.toString();
    }    
}
