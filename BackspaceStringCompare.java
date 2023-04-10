import java.util.Stack;

public class BackspaceStringCompare {
    //844. Backspace String Compare
    //https://leetcode.com/problems/backspace-string-compare/description/    
    public String backspaceString(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#' && !stack.isEmpty()) {
                stack.pop();
            } else if (s.charAt(i) != '#') {
                stack.push(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            char character = stack.pop();
            sb.append(character);
        }

        return sb.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        // In a separate method, create a stack.
        // When a letter is detected, push into the stack.
        // When a hashtag is detected, pop from the stack.
        // return the string when finished.
        // Compare the two strings once the method calls are finished.

        // System.out.println(backspaceString(s));

        // System.out.println(backspaceString(t));

        // System.out.println(backspaceString(s).equals(backspaceString(t)));

        return backspaceString(s).equals(backspaceString(t));
    }
}