package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] array) {
        List<Integer> list = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        answer.add(Collections.max(list));

        for (int i = 0; i < list.size(); i++) {
            if (answer.get(0) == list.get(i)) {
                answer.add(i);
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{1, 8, 3}));
    }
}


