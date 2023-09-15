import java.util.HashMap;

public class RingsAndRods {
    //2103. Rings and Rods
    //https://leetcode.com/problems/rings-and-rods/
    //Initalize a hashmap <String, String> and counter.
    //Iterate through the string. Add the ring to designated rod.
    //Iterate through the hashmap. If it has all three colors, then increment the counter.
    //Return the counter.
    public int countPoints(String rings) {
        HashMap<String, String> map = new HashMap<String, String>();
        int counter = 0;

        for(int i = 0; i < rings.length() - 1; i += 2){
            String value = map.containsKey(rings.charAt(i + 1) + "") ? map.get(rings.charAt(i + 1) + "") : "";
            map.put(rings.charAt(i + 1) + "", value + rings.charAt(i));
        }

        for (String val : map.values()){
            if(val.indexOf('R') != -1 && val.indexOf('G') != -1 && val.indexOf('B') != -1){
                counter++;
            }
        } 

        return counter;
    }    
}
