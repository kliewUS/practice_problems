import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MergeSimilarItems {
    //2363. Merge Similar Items
    //https://leetcode.com/problems/merge-similar-items/
    //Create a hashmap and double list
    //Add the value and weight from both arrays to the hashmap.
    //Once done, add to the double list and sort.
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i < items1.length; i++){
            hm.merge(items1[i][0], items1[i][1], Integer::sum);
        }

        for(int j = 0; j < items2.length; j++){
            hm.merge(items2[j][0], items2[j][1], Integer::sum);            
        }

        for (Map.Entry<Integer, Integer> set :
             hm.entrySet()) {

            List<Integer> item = new ArrayList<>();
            item.addAll(Arrays.asList(set.getKey(), set.getValue()));
            res.add(item);
        }

        List<List<Integer>> listRes = res
            .stream()
            .sorted((x, y) -> {
                return x.get(0).compareTo(y.get(0)); 
            })
            .collect(Collectors.toList());                


        return listRes;
    }    
}
