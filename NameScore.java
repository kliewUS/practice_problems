import java.util.*;
import java.io.*; 

public class NameScore {

    public static void main(String args[]) throws IOException{
        File file = new File("names.txt");
        Scanner s = new Scanner(file);
        long total = 0;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        s.useDelimiter("\\Z");
    
        List<String> list = Arrays.asList(s.next().split(","));

        s.close();

        Collections.sort(list);

        for(String name : list){
            List<String> word = Arrays.asList(name.split(""));
            long name_total = 0;
            for(String letter : word){
                name_total += (alphabet.indexOf(letter) + 1);
            }
            System.out.println(name + " value = " + name_total);
            total += name_total;
        }

        System.out.println("Total = " + total);
    }
}