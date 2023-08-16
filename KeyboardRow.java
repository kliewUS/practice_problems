import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {
    //500. Keyboard Row
    //https://leetcode.com/problems/keyboard-row/
    //Create three strings containing the rows.
    //Create an list to hold the strings that can be typed in one row.
    //If it can, add to the list.
    public boolean canBeTyped(String input, String row){
        for(int i = 0; i < input.length(); i++){
            if(row.indexOf(input.substring(i, i+1)) == -1){
                return false;
            }
        }
        return true;
    }

    public String[] findWords(String[] words) {
        List<String> res = new ArrayList<>();

        for(int i = 0; i < words.length; i++){
            if(canBeTyped(words[i].toLowerCase(), "qwertyuiop") || canBeTyped(words[i].toLowerCase(), "asdfghjkl") || canBeTyped(words[i].toLowerCase(), "zxcvbnm")){
                res.add(words[i]);
            }
        }

        return res.toArray(new String[res.size()]);
    }    
}
