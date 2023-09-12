import java.util.ArrayList;
import java.util.List;

public class SplitStrsSeparator {
    //2788. Split Strings by Separator
    //https://leetcode.com/problems/split-strings-by-separator/
    //Iterate through every word in the list and split the string.
    //Add to resultant list. Make sure to filter all empty strings.
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();

        for(int i = 0; i < words.size(); i++){

            String strSeparator = String.valueOf(separator);

            if(strSeparator.equals(".") || strSeparator.equals("$") || strSeparator.equals("|")){
                strSeparator = "\\" + strSeparator;
            }  


            String[] splitStr = words.get(i).split(strSeparator);

            for(int j = 0; j < splitStr.length; j++){
                if(!splitStr[j].equals("")){
                    res.add(splitStr[j]);
                }
            }
        }

        return res;
    }    
}
