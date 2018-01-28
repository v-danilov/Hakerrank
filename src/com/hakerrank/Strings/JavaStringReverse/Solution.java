package com.hakerrank.Strings.JavaStringReverse;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        if(new StringBuilder(A).reverse().toString().equals(A)){
            System.out.println("Yes");
            return;
        }
        System.out.println("No");

    }
}