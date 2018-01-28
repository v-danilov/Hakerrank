package com.hakerrank.DataStructures.Java2DArray;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }

    static boolean canWin(int m, int[] cells) {
        boolean[] visited = new boolean[cells.length];
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(0);
        while (!queue.isEmpty()) {
            int head = queue.poll();
            if (head >= cells.length) {
                return true;
            }
            if (head >= 0 && !visited[head] && cells[head] == 0) {
                visited[head] = true;
                queue.offer(head - 1);
                queue.offer(head + 1);
                queue.offer(head + m);
            }
        }
        return false;
    }
}