public class DecodeMessage {
    //2325. Decode the Message
    //https://leetcode.com/problems/decode-the-message/
    //Initalize a string containing the alphabet.
    //Initalize a stringbuilder to hold the mapped key string.
    //Initalize another stringbuilder to hold the decoded string.
    //Iterate through the key string. Add to the string if it doesn't exist. Otherwise, skip the character.
    //Once finished, Iterate through the message string. Get the index of the decoder and use that index to map the alphabet to decode the string.
    //Return the decoded string.
    public String decodeMessage(String key, String message) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder decoder = new StringBuilder();
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < key.length(); i++){ 

            if(decoder.length() == 26){
                break;
            }

            String letter = key.substring(i, i+1); 

            if(decoder.indexOf(letter) == -1 && !letter.equals(" ")){
                decoder.append(letter);
            }

        }

        // System.out.println(decoder.toString());

        for(int j = 0; j < message.length(); j++){

            String codedLetter = message.substring(j, j+1);

            int index = decoder.indexOf(codedLetter);

            if(index != -1){
                String decodedLetter = alphabet.substring(index, index+1);
                res.append(decodedLetter);
            }else{
                res.append(codedLetter);
            }

        }

        return res.toString();
    }    
}
