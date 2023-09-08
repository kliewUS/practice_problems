import java.util.List;

public class StrAcronym {
    //2828. Check if a String Is an Acronym of Words
    //https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/
    //Make a StringBuilder.
    //Itreate through list and get the first character of each word and add to the stringbuilder.
    //Compare the two strings.
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < words.size(); i++){
            res.append(words.get(i).substring(0, 1));
        }

        return res.toString().equals(s);
    }    
}
