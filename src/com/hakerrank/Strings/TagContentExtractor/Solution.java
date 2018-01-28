package com.hakerrank.Strings.TagContentExtractor;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();


            Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = r.matcher(line);

            boolean isValid = false;
            while (m.find()) {
                System.out.println(m.group(2));
                isValid = true;
            }
            if ( !isValid) {
                System.out.println("None");
            }

            testCases--;
        }
    }
}
