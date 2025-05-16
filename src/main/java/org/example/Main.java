package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> solution(String myStr) {
        myStr = myStr.replace("a", "0").replace("b", "0").replace("c", "0");
        List<String> before_answer = Arrays.asList(myStr.split("0"));
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < before_answer.size(); i++) {
            if (!before_answer.get(i).trim().isEmpty()) {
                answer.add(before_answer.get(i).trim());
            }
        }
        if (answer.isEmpty()) {
            answer.add("EMPTY");
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("baconlettucetomato"));

    }
}


