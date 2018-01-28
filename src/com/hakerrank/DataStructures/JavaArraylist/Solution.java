package com.hakerrank.DataStructures.JavaArraylist;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        int quantity = sc.nextInt();

        for(int i = 0; i < quantity; i++){
            int length =  sc.nextInt();
            ArrayList<Integer> valuesList = new ArrayList<Integer>();
            for(int j = 0; j < length; j++){
                valuesList.add(sc.nextInt());
            }
            list.add(valuesList);
        }

        int queries = sc.nextInt();

        for(int i = 0; i < queries; i++){
            try{
                //System.out.println(sc.nextInt());
                //System.out.println(sc.nextInt());

                System.out.println(list.get(sc.nextInt() - 1).get(sc.nextInt() - 1));
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}