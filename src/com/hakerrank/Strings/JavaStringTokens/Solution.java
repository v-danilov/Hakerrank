package com.hakerrank.Strings.JavaStringTokens;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        s = s.trim();
        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }


        String[] strings = s.split("[^a-zA-Z]+");
        System.out.println(strings.length);
        for (String str : strings) {
            System.out.println(str);
        }
        scan.close();
    }
}