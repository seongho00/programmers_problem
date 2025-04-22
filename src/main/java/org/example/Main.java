package org.example;


import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int temp = arr[queries[i][0]];
            arr[queries[i][0]] = queries[i][1];
            arr[queries[i][1]] = temp;
        }
        return arr;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 3}, {1, 2}, {1, 4}}));

    }
}


