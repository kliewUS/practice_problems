public class WordEqualsSumOfTwoWords {
    //1880. Check if Word Equals Summation of Two Words
    //https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/
    //Make a helper function to convert all the words into numbers.
    //Add the first and second words and check if equals to the target word.
    public int wordToNum(String word){
        String num = "";
        String alphabet = "abcdefghij";

        for(int i = 0; i < word.length(); i++){
            int index = alphabet.indexOf(word.substring(i, i+1));
            num += String.valueOf(index);
        }

        return Integer.parseInt(num);
    }


    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return (wordToNum(firstWord) + wordToNum(secondWord)) == wordToNum(targetWord);
    }    
}
