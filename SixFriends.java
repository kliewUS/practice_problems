import java.util.List; // import just the List interface
import java.util.ArrayList; // import just the ArrayList class
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class SixFriends {

    public static void main(String args[]){

        //Put the costs as a key-value pair. Double room as a key. Triple room as a value.
        //Multiply the double room cost by 3 and multiply the triple room cost by 2.

        LinkedHashMap<Integer, Integer> costs = new LinkedHashMap<>(); 
        //In Code chef case, we would instead split the input and put the first value as the key and second as the value.
        costs.put(10, 15);
        costs.put(6, 8);
        costs.put(4, 8);

        costs.forEach((duo, triple) -> {
            duo *= 3;
            triple *= 2;

            if(duo <= triple){
                System.out.println(duo);
            }else{
                System.out.println(triple);
            }
        });
    }

}