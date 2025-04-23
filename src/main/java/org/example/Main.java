package org.example;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int n, int[] numList) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < numList.length; i++) {
            if (numList[i] % n == 0) {
                answer.add(numList[i]);
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12}));

    }
}


