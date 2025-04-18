package org.example;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int solution(String my_string) {
        int answer = 0;

        // 문자 모두 소문자로
        my_string = my_string.toLowerCase();
        // 숫자 제외 문자 제거
        my_string = my_string.replaceAll("[a-z]", "");
        // 숫자 합 구하기
        for (int i = 0; i < my_string.length(); i++) {
            answer += Integer.parseInt(my_string.split("")[i]);
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("1a2b3c4d123"));
    }
}


