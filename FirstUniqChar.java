public class FirstUniqChar {
    //387. First Unique Character in a String
    //https://leetcode.com/problems/first-unique-character-in-a-string/
    //Create a hashmap to keep track on how many times a character appears.
    //Iterate through the string.
    //Once done, iterate through the string again. Check if the value is 1. If it is, return the index.
    //Otherwise, return -1.
    public int firstUniqChar(String s) {
        HashMap<String, Integer> counter = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            counter.merge(s.substring(i, i+1), 1, Integer::sum);
        }


        for(int i = 0; i < s.length(); i++){
            if(counter.get(s.substring(i, i+1)) == 1){
                return i;
            }            
        }

        return -1;
    }    
}
