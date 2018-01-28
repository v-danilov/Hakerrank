package com.hakerrank.Introduction.JavaIfElse;
import java.util.*;


public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans="Weird";
        if(n%2==1){
            ans = "Weird";
        }
        else{
            if(n >= 2 && n <= 5 || n > 20){
                ans= "Not Weird";
            }

        }
        System.out.println(ans);

    }
}

