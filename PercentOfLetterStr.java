public class PercentOfLetterStr {
    //2278. Percentage of Letter in String
    //https://leetcode.com/problems/percentage-of-letter-in-string/
    //Initalize a counter. If matches the target letter, increment counter.
    //Divide the res with the length of the string. Then multiply by 100. Return that percentage.
    public int percentageLetter(String s, char letter) {
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == letter){
                count++;
            }
        }

        double res = ((double) count / (double) s.length()) * 100;

        return (int) res;
    }    
}
