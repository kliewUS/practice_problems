public class RomanToInt {
    // 13. Roman to Integer
    // https://leetcode.com/problems/roman-to-integer/

    // Create a hashmap containing the seven roman numeral symbols.
    // Initalize a res variable.
    // Iterate through the string.
    // If the the ith element is less than the i+1th element, then subtract from the
    // res.
    // Otherwise, add to the res.
    // Return the res.

    public int romanToInt(String s) {
        HashMap<Character, Integer> symbols = new HashMap<Character, Integer>();
        symbols.put('I', 1);
        symbols.put('V', 5);
        symbols.put('X', 10);
        symbols.put('L', 50);
        symbols.put('C', 100);
        symbols.put('D', 500);
        symbols.put('M', 1000);

        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && symbols.get(s.charAt(i)) < symbols.get(s.charAt(i + 1))) {
                res -= symbols.get(s.charAt(i));
            } else {
                res += symbols.get(s.charAt(i));
            }
        }

        return res;
    }
}