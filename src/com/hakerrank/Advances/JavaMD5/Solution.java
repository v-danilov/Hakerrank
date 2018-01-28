package com.hakerrank.Advances.JavaMD5;

import java.security.MessageDigest;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(sc.nextLine().getBytes());
        byte[] digest = md.digest();


        for (byte b : digest) {
            System.out.format("%02x", b);
        }
    }
}