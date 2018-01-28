package com.hakerrank.Strings.JavaAnagrams;

import java.util.Arrays;

public class Solution {
    static boolean isAnagram(String a, String b) {
        char[] a_word = a.toLowerCase().toCharArray();
        Arrays.sort(a_word);
        char[] b_word = b.toLowerCase().toCharArray();
        Arrays.sort(b_word);
        return Arrays.equals(a_word, b_word);
    }
}
