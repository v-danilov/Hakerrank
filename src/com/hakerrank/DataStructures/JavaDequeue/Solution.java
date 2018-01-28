package com.hakerrank.DataStructures.JavaDequeue;


import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();

        int n = in.nextInt();
        int m = in.nextInt();
        boolean pass = false;

        int max = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if (i < m) {
                deque.addLast(num);
            } else {
                pass = true;
                Set<Integer> set = new HashSet<>();
                deque.forEach(deq -> set.add((Integer) deq));
                max = set.size() > max ? set.size() : max;
                deque.removeFirst();
                deque.addLast(num);

            }
        }
        if (!pass) {
            Set<Integer> set = new HashSet<>();
            deque.forEach(deq -> set.add((Integer) deq));
            max = set.size() > max ? set.size() : max;
        }
        System.out.println(max);
    }
}
