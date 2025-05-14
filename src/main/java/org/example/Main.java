package org.example;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> solution(String[] strArr) {

        List<String> answer = new ArrayList<>();

        for (int i = 0; i < strArr.length; i++) {
            answer.add(strArr[i]);
        }

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains("ad")) {
                answer.remove(strArr[i]);
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new String[]{"and", "notad", "abcd"}));

    }
}


