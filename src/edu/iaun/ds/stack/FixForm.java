package edu.iaun.ds.stack;

public class FixForm {
    public static void main(String[] args) {
        System.out.println(infixToPostfix("(A+B)*(C+D)"));
    }

    public static String infixToPostfix(String infix) {
        String postfix = "";
        Stack stack = new StackArray();
        char[] infixChars = infix.toCharArray();
        for (char infixChar : infixChars) {
            if (infixChar == '(') {
                stack.push(infixChar);
            }else if((infixChar >= 'a' && infixChar <= 'z') || (infixChar >= 'A' && infixChar <= 'Z')) {
                postfix = postfix + infixChar;
            }else if(infixChar == '+' || infixChar == '-' || infixChar == '*' || infixChar == '/' || infixChar == '^') {
                if(!stack.isEmpty()) {
                    if(getPrecedence(infixChar) <= getPrecedence((char)stack.peek())) {
                        postfix = postfix + (((char)stack.pop())+"");
                    }
                }
                stack.push(infixChar);
            }else if(infixChar == ')') {
                while(!stack.isEmpty()) {
                    if(stack.peek() != '(')
                        postfix = postfix + (((char)stack.pop())+"");
                    else
                        stack.pop();
                }
            }
        }
        while (!stack.isEmpty()) {
            postfix = postfix + (((char)stack.pop())+"");
        }
        return postfix;
    }

    private static int getPrecedence(char ch) {
        if(ch == '^')
            return 3;
        if(ch == '*' || ch == '/')
            return 2;
        if(ch == '+' || ch == '-')
            return 1;
        return -1;
    }
}
