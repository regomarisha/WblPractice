package com.stringcomputation.main;

import java.util.Stack;

/**
 *  Program to check if a given string of parenthesis
 *  has balanced parenthesis or not.
 *  For example a string as "(())" is a valid string
 *  where as strings like ")(" or "(()))" are not valid strings.
 */
public class CheckString {
    public static boolean check(String input){
        Stack<Character> stack =new Stack<Character>();
        for (int i=0; i<input.length(); i++) {
            char ch=input.charAt(i);
            if (ch == '(' || ch == '{'|| ch == '[') {
                stack.push(ch);
            }
            if (ch == ')' || ch == '}'|| ch == ']') {
                if (stack.empty()) {
                    return false;
                }
                char top_char = stack.pop();
                if ( (top_char == '(' && ch != ')') || (top_char == '{' && ch != '}') || (top_char == '[' && ch != ']') ) {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String str="(abc)" ;
        boolean string=check(str);
        System.out.println(string);
    }
}

