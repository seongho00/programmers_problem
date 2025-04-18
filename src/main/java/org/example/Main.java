package org.example;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String my_string) {
        // 모음 넣을 배열
        List<String> vowel = new ArrayList<>();
        vowel.add("a");
        vowel.add("e");
        vowel.add("i");
        vowel.add("o");
        vowel.add("u");

        // replace 로 모임 다 삭제
        for (String i : vowel) {
            my_string = my_string.replaceAll(i, "");
        }

        return my_string;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("nice to meet you"));
    }
}


