public class FaultyKeyboard {
    //2810. Faulty Keyboard
    //https://leetcode.com/problems/faulty-keyboard/
    //Make a StringBuilder
    //Iterate through string. Add to the StringBuilder. If it's an 'i', reverse the string.
    public String finalString(String s) {
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(s.substring(i, i +1).equals("i")){
                res = res.reverse();
            }else{
                res.append(s.substring(i, i+1));
            }
        }

        return res.toString();
    }    
}
