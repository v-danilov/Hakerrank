package com.hakerrank.DataStructures.JavaSubArray;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int neg = 0;
        for(int i = 0;  i < size; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < 0){
                neg++;
            }
        }

        for(int i = 0; i < size; i++){
            int tmp = arr[i];
            for(int j = i + 1; j < size; j++ ){
                tmp += arr[j];
                if(tmp < 0){
                    neg++;
                }
            }

        }
        System.out.println(neg);
    }
}