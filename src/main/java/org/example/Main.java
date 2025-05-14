package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<String> solution(String myString) {

        List<String> answer = new ArrayList<>(Arrays.asList(myString.split("x")));
        answer.removeAll(Arrays.asList("", null));
        Collections.sort(answer);
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("axbxcxdx"));

    }
}


