public class MinStrLen {
    //2716. Minimize String Length
    //https://leetcode.com/problems/minimize-string-length/
    //Itreate through the string.
    //Add character to the new string if it doesn't exist.
    //Otherwise move to the next character. 
    public int minimizedStringLength(String s) {
        StringBuilder minStr = new StringBuilder();
        StringBuilder strExist = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(strExist.indexOf(s.substring(i, i+1)) == -1){
                strExist.append(s.substring(i, i+1));
                minStr.append(s.substring(i, i+1));
            }
        }


        return minStr.toString().length();
    }    
}
