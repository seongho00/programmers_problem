package org.example;


import java.util.*;

class Solution {
    public List<Integer> solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();
        for (int i = n; i < num_list.length; i++) {
            answer.add(num_list[i]);
        }
        for (int i = 0; i < n; i++) {
            answer.add(num_list[i]);
        }
        return answer;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{2, 1, 6}, 1));

    }
}


