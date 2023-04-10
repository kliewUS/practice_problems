import java.util.Stack;

//Problem 20: Valid Parentheses: https://leetcode.com/problems/valid-parentheses/description/

public class ValidParentheses {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();
        int i = 0;

        //Treat it as a stack.
        
        //Check if the character is [, {, (, if it is, push into the stack.
        //If it's escaping bracket, then check if the stack isn't empty and if the first element in the stack is opening bracket.
        //If those conditions are both true, then pop the stack.
        //Or else return false.

        while(i < s.length()){
            if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }else if(s.charAt(i) == '}'){
                if(!stack.isEmpty() && stack.peek() == '{' ){
                    stack.pop();
                }else{
                    return false;
                }
            }else if(s.charAt(i) == ')'){
                if(!stack.isEmpty() && stack.peek() == '(' ){
                    stack.pop();
                }else{
                    return false;
                }
            }else if(s.charAt(i) == ']'){
                if(!stack.isEmpty() && stack.peek() == '[' ){
                    stack.pop();
                }else{
                    return false;
                }
            }
            i++;
        }

        return stack.isEmpty();
    }
}
