package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            String number = array[i] + "";
            List<String> numberSplit = Arrays.asList(number.split(""));
            for (int j = 0; j < numberSplit.size(); j++) {
                if (numberSplit.get(j).equals("7")) {
                    answer++;
                }
            }
        }


        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{7, 77, 17}));

    }
}


