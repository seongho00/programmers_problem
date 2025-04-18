package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;

class Solution {
    public int solution(String s) {
        int answer = 0;
        //입력받은 문자 공백 기준으로 배열에 담기
        List<String> strings = Arrays.asList(s.split(" "));

        for (int i = 0; i < strings.size(); i++) {
            // Z가 나오면
            if (strings.get(i).equals("Z")) {
                answer -= Integer.parseInt(strings.get(i - 1));
            } else { // Z가 아닌 숫자면
                answer += Integer.parseInt(strings.get(i));
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("10 20 30 40"));
    }
}


