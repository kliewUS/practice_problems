import java.util.HashMap;
import java.util.Map;

public class CommonWordsOneOcc {
    //2085. Count Common Words With One Occurrence
    //https://leetcode.com/problems/count-common-words-with-one-occurrence/
    //Create two hashmaps. One with the first arr and one with the second arr.
    //Then iterate through both hashmaps.
    //After that, then itreate through one of the hashmaps.
    //Check if the letter exists in the other hashmap. If is, check the value.
    //If it is 1, then increment counter by 1.
    public int countWords(String[] words1, String[] words2) {
        int counter = 0;
        HashMap<String, Integer> hm1 = new HashMap<>();
        HashMap<String, Integer> hm2 = new HashMap<>();

        for(int i = 0; i < words1.length; i++){
            hm1.merge(words1[i], 1, Integer::sum);
        }


        for(int i = 0; i < words2.length; i++){
            hm2.merge(words2[i], 1, Integer::sum);
        }

        for (Map.Entry<String,Integer> mapElement : hm1.entrySet()) {
            String key = mapElement.getKey();
            if(hm2.containsKey(key) && mapElement.getValue().equals(1)){
                if(hm2.get(key).equals(1)){
                    counter++;
                }
            }
        }        
        
        return counter;
    }    
}
