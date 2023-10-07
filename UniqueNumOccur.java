import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UniqueNumOccur {
    //1207. Unique Number of Occurrences
    //https://leetcode.com/problems/unique-number-of-occurrences/
    //Init a hashmap
    //Iterate through hashmap to add to list.
    //Then make a copy of list and convert into a set.
    //Convert set back to list.
    //Compare the two lists.
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            hm.merge(arr[i], 1, Integer::sum);
        }

        for (Map.Entry<Integer,Integer> mapElement : hm.entrySet()) {
            res.add(mapElement.getValue());
        }

        Set<Integer> set = new HashSet<>(res);
        List<Integer> res2 = new ArrayList<>(set);

        Collections.sort(res);
        Collections.sort(res2);

        return res.equals(res2);
    }    
}
