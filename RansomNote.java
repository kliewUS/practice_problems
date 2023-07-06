import java.util.Arrays;

public class RansomNote {
    //383. Ransom Note
    //https://leetcode.com/problems/ransom-note/
    //Sort the both strings.
    //Put ransomNote into a StringBuilder.
    //Itreate through the magazine string. If the letter is found in ransomNote
    //Remove letter from ransomNote.
    //If ransomNote has no more characters, return true.
    //Otherwise return false. 
    public boolean canConstruct(String ransomNote, String magazine) {
        
        char[] ar1 = ransomNote.toCharArray();
        Arrays.sort(ar1);
        String sortedNote = String.valueOf(ar1);

        char[] ar2 = magazine.toCharArray();
        Arrays.sort(ar2);
        String sortedMagazine = String.valueOf(ar2);

        StringBuilder res = new StringBuilder(sortedNote);

        // System.out.println(sortedNote);
        // System.out.println(sortedMagazine);

        for(int i = 0; i < sortedMagazine.length(); i++){

            if(res.length() == 0){
                return true;
            }

            int index = res.indexOf(sortedMagazine.substring(i, i+1)); 
            if(index != -1){
                res.deleteCharAt(index);
            }

            // System.out.println(res);
        }

        return res.length() == 0;
    }    
}
