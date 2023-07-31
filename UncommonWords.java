import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonWords {
    //884. Uncommon Words from Two Sentences
    //https://leetcode.com/problems/uncommon-words-from-two-sentences/
    //Split each string and iterate through each string array.
    //Check if value is 1. If it is, that means it only appears in one of the sentences.
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> count = new HashMap<>();
        List<String> res = new ArrayList<>();
        String[] s1Split = s1.split(" ");
        String[] s2Split = s2.split(" ");

        for(int i = 0; i < s1Split.length; i++){
            count.merge(s1Split[i], 1, Integer::sum);
        }

        for(int i = 0; i < s2Split.length; i++){
            count.merge(s2Split[i], 1, Integer::sum);
        }

        for (Map.Entry<String, Integer> ele : count.entrySet()){
            if(ele.getValue().equals(1)){
                res.add(ele.getKey());
            }
        }

       String[] arr = res.stream().toArray(String[]::new);

       return arr;
    }    
}
