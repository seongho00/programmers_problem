package org.example;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(String[] strList) {
        // 길이 담을 배열 생성
        List<Integer> wordLength = new ArrayList<>();

        for (int i = 0; i < strList.length; i++) {
            // 각 문자 길이 배열에 넣기
            wordLength.add(strList[i].length());
        }

        return wordLength;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new String[]{"We", "are", "the", "world!"}));
    }
}


