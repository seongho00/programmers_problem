package org.example;


import java.util.*;


class Solution {
    public String solution(String my_string, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            String reverse_my_string = my_string.substring(queries[i][0], queries[i][1] + 1);
            StringBuilder sb = new StringBuilder(reverse_my_string);
            reverse_my_string = sb.reverse().toString();
            my_string = my_string.substring(0, queries[i][0]) + reverse_my_string + my_string.substring(queries[i][1] + 1);
        }

        return my_string;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("rermgorpsam", new int[][]{{2, 3}, {0, 7}, {5, 9}, {6, 10}}));

    }
}


