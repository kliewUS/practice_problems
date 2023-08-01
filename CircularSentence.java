public class CircularSentence {
    //2490. Circular Sentence
    //https://leetcode.com/problems/circular-sentence/
    //Split string.
    //Check two conditions.
    //If last char current word matches the first char of the next word.
    //If last char of last word matches first char of the first word.
    //If it does, return true. Otherwise false.
    public boolean isCircularSentence(String sentence) {
        String[] sentenceArr = sentence.split(" ");

        if(sentenceArr.length == 1){
            return sentence.charAt(0) == sentence.charAt(sentence.length() - 1);
        }

        for(int i = 0; i < sentenceArr.length; i++){
            if((i+1) != sentenceArr.length && sentenceArr[i].charAt(sentenceArr[i].length() - 1) != sentenceArr[i+1].charAt(0)){
                return false;
            }else if((i+1) == sentenceArr.length && sentenceArr[i].charAt(sentenceArr[i].length() - 1) != sentenceArr[0].charAt(0)){
                return false;
            }
        }

        return true;
    }    
}
