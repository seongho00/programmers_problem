package org.example;


import java.util.*;


class Solution {
    public int solution(String number) {
        int answer = 0;
        List<String> numberList = new ArrayList<>(Arrays.asList(number.split("")));

        for (int i = 0; i < numberList.size(); i++) {
            answer += Integer.parseInt(numberList.get(i));
        }
        answer %= 9;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("78720646226947352489"));

    }
}


