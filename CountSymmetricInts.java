public class CountSymmetricInts {
    //2843. Count Symmetric Integers
    //https://leetcode.com/problems/count-symmetric-integers/
    //Convert integer to string.
    //If current number is less than 10, then set current number to 10.
    //If current number is less than 1000, then set current number to 1000.
    //Convert int to string and split string in half.
    //Using a helper method, split string again and convert each digit to int. Then add them.
    //If the sum of the first half is equal to the sum of the second half, increment counter by 1.
    public int sumDigits(String value){
        int sum = 0;

        for(int i = 0; i < value.length(); i++){
            sum += Character.getNumericValue(value.charAt(i));
        }

        return sum;
    }

    public int countSymmetricIntegers(int low, int high) {
        int counter = 0;

        for(int i = low; i <= high; i++){

            if(i < 10){
                i = 10;
            }else if(i >= 100 && i < 1000){
                i = 1000;
            }

            String curNum = String.valueOf(i);
            String curNumA = curNum.substring(0, (curNum.length()/2));
            String curNumB = curNum.substring((curNum.length()/2));

            if(sumDigits(curNumA) == sumDigits(curNumB)){
                counter++;
            }

        }

        return counter;
    }    
}
