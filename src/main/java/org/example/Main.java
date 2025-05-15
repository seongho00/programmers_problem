package org.example;


import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            if (answer.isEmpty()) {
                answer.add(arr[i]);
            } else {
                if (answer.get(answer.size() - 1) == arr[i]) {
                    answer.remove(answer.size() - 1);
                } else {
                    answer.add(arr[i]);
                }
            }
            i++;
        }
        if (answer.isEmpty()) {
            answer.add(-1);
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{0, 1, 1, 1, 0}));

    }
}


