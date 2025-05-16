package org.example;


import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] arr, int k) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            boolean isPlus = true;
            if (answer.isEmpty()) {
                answer.add(arr[0]);
            }

            for (int j = 0; j < answer.size(); j++) {
                if (answer.get(j) == arr[i]) {
                    isPlus = false;
                    break;
                }

            }
            if (isPlus) {
                answer.add(arr[i]);
            }
            if (answer.size() == k) {
                break;
            }

        }
        if (answer.size() < k) {
            for (int i = answer.size(); i < k; i++) {
                answer.add(-1);
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{0, 1, 1, 1, 1, 1}, 3));

    }
}


