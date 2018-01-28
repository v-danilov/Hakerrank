package com.hakerrank.Advances.JavaSHA256;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(sc.nextLine().getBytes());
        byte[] digest = md.digest();


        for (byte b : digest) {
            System.out.format("%02x", b);
        }
    }
}