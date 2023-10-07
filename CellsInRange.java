import java.util.ArrayList;
import java.util.List;

public class CellsInRange {
    //2194. Cells in a Range on an Excel Sheet
    //https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/
    //Create an alphabet containing the letters and empty list.
    //Split string by colon.
    //Do a double loop. First loop go through all of the letters from the first to last.
    //Second loop goes through all the numbers.
    //Iterate through the cols and rows to get their cells.
    public List<String> cellsInRange(String s) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] split = s.split(":", -1);
        String lb = split[0].substring(0, 1);
        String le = split[1].substring(0, 1);
        int slb = alphabet.indexOf(lb);
        int sle = alphabet.indexOf(le);
        int nlb = Integer.parseInt(split[0].substring(1, 2));
        int nle = Integer.parseInt(split[1].substring(1, 2));
        List<String> res = new ArrayList<>();


        for(int i = slb; i <= sle; i++){
            StringBuilder inter = new StringBuilder(alphabet.substring(i, i+1));
            for(int j = nlb; j <= nle; j++){
                inter.append(j);
                res.add(inter.toString());
                inter = new StringBuilder(alphabet.substring(i, i+1));
            }
        }

        return res;
    }    
}
