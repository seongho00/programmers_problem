package org.example;


import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int[][] queries) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < queries.length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2]) {
                    list.add(arr[j]);
                }
            }
            Collections.sort(list);
            if (list.isEmpty()) {
                answer.add(-1);
            } else {
                answer.add(list.get(0));
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 2}, {0, 3, 2}, {0, 2, 2}}));

    }
}


