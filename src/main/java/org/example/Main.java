package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        for (int i = 0; i < num_list.length / n; i++) {

            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[j + i * n];
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948}, 3));
    }
}


