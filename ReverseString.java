public class ReverseString {
    //344. Reverse String
    //https://leetcode.com/problems/reverse-string/
    //Use two pointers. One at the beginning and one at the end.
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}