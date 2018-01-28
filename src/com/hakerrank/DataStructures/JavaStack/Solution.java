package com.hakerrank.DataStructures.JavaStack;

import java.util.Scanner;
import java.util.Stack;

class Solution {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(isValid(input));
        }


    }

    public static boolean isValid(String str) {
        if (str.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                try {
                    char last = stack.pop();
                    if (last == '(' && c != ')' || last == '[' && c != ']' || last == '{' && c != '}')
                        return false;
                } catch (Exception e) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
