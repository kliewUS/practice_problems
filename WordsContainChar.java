import java.util.ArrayList;
import java.util.List;

public class WordsContainChar {
//2942. Find Words Containing Character
//Init a List of ints.
//Make two loops. One to go through the strings.
//One to go to through the chars of strings.
//If char is found, add index of string to list and break the second loop.
//Otherwise, keep iterating until done.
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < words.length; i++){
            for (int j = 0; j < words[i].length(); j++) {
                if(words[i].charAt(j) == x){
                    res.add(i);
                    break;
                }
            }
        }

        return res;
    }
}
