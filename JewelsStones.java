//771. Jewels and Stones
//Init a counter to track the number of stones as jewels
//Add all jewel characters to a Hashset.
//Iterate through the stone string.
//If stone is jewel, incremate counter by 1.
//return counter

import java.util.HashMap;

public class JewelsStones {
    public int numJewelsInStones(String jewels, String stones) {
        int counter = 0;
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i = 0; i < jewels.length(); i++){
            Character ch = jewels.charAt(i);
            hm.put(ch, 1); 
        }

        for(int i = 0; i < stones.length(); i++){
            if(hm.containsKey(stones.charAt(i))){
                counter++;
            }
        }

        return counter;
    }
}