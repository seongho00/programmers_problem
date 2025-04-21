package org.example;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;

        List<Integer> differences = new ArrayList<>();
        List<Integer> answers = new ArrayList<>();
        // 차이값 구해서 넣기 array 와 n의 차이값 구해서 넣기(절대값으로)
        for (int i = 0; i < array.length; i++) {
            differences.add(Math.abs(array[i] - n));
        }
        // 차이값의 최소 구하기
        int min = Collections.min(differences);

        // 차이값의 최소랑 같은 array 배열의 숫자 찾아서 answers 배열에 넣기
        for (int i = 0; i< array.length; i++) {
            if (Math.abs(array[i] - n) == min) {
                answers.add(array[i]);
            }
        }
        // answers 배열 중 가장 작은 값 출력
        return Collections.min(answers);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{10, 12}, 11));
    }
}


