package edu.iaun.ds.stack;

import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Stack stack = new StackLinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some parenthesis: ");
        String s = sc.nextLine();
        char[] ch = s.toCharArray();

        try {
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == '(') {
                    stack.push(ch[i]);
                }else if (ch[i] == ')') {
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                System.out.println("YES, Parentheses are balanced");
            }else
                System.out.println("NO, Parentheses are not balanced");
        } catch (StackException e) {
            System.out.println("NO, Parentheses are not balanced");
        }

    }
}
