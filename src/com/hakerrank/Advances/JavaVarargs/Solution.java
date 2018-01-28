package com.hakerrank.Advances.JavaVarargs;

public class Solution {
    class Add{
        void add(int ... nums){
            StringBuffer sb = new StringBuffer();
            int sum = 0;
            for (int num : nums) {
                sb.append(num + "+");
                sum += num;
            }
            sb.setCharAt(sb.length() - 1, '=');
            sb.append(sum);
            System.out.println(sb);
        }
    }

}
