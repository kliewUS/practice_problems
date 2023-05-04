public class ReplaceDigits {
    // 1844. Replace All Digits with Characters
    // https://leetcode.com/problems/replace-all-digits-with-characters/
    // Init a string with the entire alphabet.
    // Init a stringbuilder with the input string.
    // Iterate through every odd character. Convert the character into int.
    // Use indexOf on the previous character + the converted digit to get the new
    // character. Replace it.
    // Return the modified string.
    public String replaceDigits(String s) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder res = new StringBuilder(s);

        for (int i = 1; i < res.length(); i += 2) {
            int index = alphabet.indexOf(res.charAt(i - 1));
            int shift = Character.getNumericValue(res.charAt(i));
            char newChar = alphabet.charAt(index + shift);
            // System.out.println(newChar);
            res.setCharAt(i, newChar);
            // System.out.println(res.toString());
        }

        return res.toString();
    }
}
