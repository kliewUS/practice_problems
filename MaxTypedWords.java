public class MaxTypedWords {
    //1935. Maximum Number of Words You Can Type
    //https://leetcode.com/problems/maximum-number-of-words-you-can-type/
    //Split text string and iterate through words array.
    //Itreate through broken letter string. If broken, increment untypable word by 1.
    //Subtract length of text array with untypable words to get the max typable words.
    public int canBeTypedWords(String text, String brokenLetters) {
        int untypeable = 0;
        String[] splitText = text.split(" ");

        for(int i = 0; i < splitText.length; i++){
            for(int j = 0; j < brokenLetters.length(); j++){
                if(splitText[i].indexOf(brokenLetters.substring(j, j+1)) != -1){
                    untypeable++;
                    break;
                }
            }
        }

        return splitText.length - untypeable;
    }
}