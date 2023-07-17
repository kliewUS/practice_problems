public class DetermineChessboardColor {
    //1812. Determine Color of a Chessboard Square
    //https://leetcode.com/problems/determine-color-of-a-chessboard-square/
    //Convert the coordinates to int.
    //If the number is even, then it is black (false).
    //If the number is oddm then it is white (true).
    public boolean squareIsWhite(String coordinates) {
        String key = "abcdefgh";
        int val = Character.getNumericValue(coordinates.charAt(0)) + Character.getNumericValue(coordinates.charAt(1));

        return val % 2 == 0;
    }    
}
