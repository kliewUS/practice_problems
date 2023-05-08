public class UniqueMorseWords {
    //804. Unique Morse Code Words
    //https://leetcode.com/problems/unique-morse-code-words/
    //Initalize an arraylist to keep track the unique morse words.
    //Iterate through the array.
    //Create a stringbuilder. Then iterate through the word. Replace each character with the morse variant.
    //Check if the morse word exists in the arraylist. If it doesn't, then add to the arraylist. Otherwise, skip the word.
    //Return the length of the arraylist.
    public int uniqueMorseRepresentations(String[] words) {
        ArrayList<String> res = new ArrayList<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] morseLetters = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        for(int i = 0; i < words.length; i++){
            StringBuilder morseWord = new StringBuilder();
            for(int j = 0; j < words[i].length(); j++){
                char curChar = words[i].charAt(j);
                int morseIndex = alphabet.indexOf(curChar);
                morseWord.append(morseLetters[morseIndex]);
            }

            String newWord = morseWord.toString();

            if(!res.contains(newWord)){
                res.add(newWord);
            }

        }

        return res.size();
    }    
}
