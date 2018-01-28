package com.hakerrank.DataStructures.JavaBitSet;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        BitSet[] B = new BitSet[3];
        for (int i = 1; i < B.length; i++) {
            B[i] = new BitSet(N);
        }
        for (int i = 0; i < M; i++) {
            String action = sc.next();
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            if (action.equals("AND")) {
                B[v1].and(B[v2]);
                ;
            } else if (action.equals("OR")) {
                B[v1].or(B[v2]);
            } else if (action.equals("XOR")) {
                B[v1].xor(B[v2]);
            } else if (action.equals("FLIP")) {
                B[v1].flip(v2);
            } else if (action.equals("SET")) {
                B[v1].set(v2);
            }

            System.out.println(B[1].cardinality() + " " + B[2].cardinality());
        }

        sc.close();
    }
}