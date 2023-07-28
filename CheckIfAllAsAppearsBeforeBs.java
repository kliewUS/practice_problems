public class CheckIfAllsAsAppearsBeforeBs {
    //2124. Check if All A's Appears Before All B's
    //https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/
    //If character is b, but the next character is an a. Then return false.
    public boolean checkString(String s) {
        
        for(int i = 0; i < s.length(); i++){
            if(i+1 < s.length() && s.charAt(i) == 'b' && s.charAt(i+1) == 'a'){
                return false;
            }
        }

        return true;
    }    
}