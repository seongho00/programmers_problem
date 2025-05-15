package org.example;


import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] arr, boolean[] flag) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    answer.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    answer.remove(answer.size() - 1);
                }
            }
        }
        return answer;

    }

}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{3, 2, 4, 1, 3}, new boolean[]{true, false, true, false, false}));

    }
}


