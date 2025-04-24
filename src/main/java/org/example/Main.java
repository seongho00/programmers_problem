package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<String> numbers = Arrays.asList(String.valueOf(n).split(""));
        for (int i = 0; i < numbers.size(); i++) {
            answer += Integer.parseInt(numbers.get(i));
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(930211));

    }
}


