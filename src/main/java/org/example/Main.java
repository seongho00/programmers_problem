package org.example;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        if (arr.length == 1) {
            for (int i : arr) {
                answer.add(i);
            }
            return answer;
        }

        int i = 0;
        while (true) {
            if (arr.length >= (int) Math.pow(2, i) && arr.length <= (int) Math.pow(2, i + 1)) {

                break;
            }
            i++;
        }
        for (int j = 0; j < arr.length; j++) {
            answer.add(arr[j]);
        }
        for (int j = arr.length; j < (int) Math.pow(2, i + 1); j++) {
            answer.add(0);
        }


        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{1}));

    }
}


