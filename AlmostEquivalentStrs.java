import java.util.HashMap;
import java.util.Map;

public class AlmostEquivalentStrs {
    //2068. Check Whether Two Strings are Almost Equivalent
    //https://leetcode.com/problems/check-whether-two-strings-are-almost-equivalent/
    //Create hashmaps for the two words.
    //Iterate through both strings to get the frequences.
    //Compare both hashmaps. Check if the difference of the frequences is 3 or below.
    //If the differences of all frequences are 3 or below, then return true. False otherwise.
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int counter = 0;
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        for(int i = 0; i < word1.length(); i++){
            hm1.merge(word1.charAt(i), 1, Integer::sum);
        }


        for(int i = 0; i < word2.length(); i++){
            hm2.merge(word2.charAt(i), 1, Integer::sum);
        }

        for (Map.Entry<Character,Integer> mapElement : hm1.entrySet()) {
            Character key = mapElement.getKey();
            if(hm2.containsKey(key)){
                if(Math.abs(mapElement.getValue() - hm2.get(key)) > 3){
                    return false;
                }
            }else{
                if(mapElement.getValue() > 3){
                    return false;
                }
            }
        }        

        for (Map.Entry<Character,Integer> mapElement : hm2.entrySet()) {
            Character key = mapElement.getKey();
            if(hm1.containsKey(key)){
                if(Math.abs(mapElement.getValue() - hm1.get(key)) > 3){
                    return false;
                }
            }else{
                if(mapElement.getValue() > 3){
                    return false;
                }
            }
        }    

        return true;        
    }    
}