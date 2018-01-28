package com.hakerrank.Advances.PrimeChecker;

import java.math.BigInteger;

public class Solution {

    class Prime {
        void checkPrime(int... numbers) {
            for (int num : numbers) {
                if (check(num)) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }

        boolean check(int n) {
            BigInteger bi = BigInteger.valueOf((long) n);
            return bi.isProbablePrime(10);
        }
    }
}
