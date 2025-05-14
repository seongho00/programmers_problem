package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> solution(String myString) {
        if (myString.startsWith("x")) {
            myString = " " + myString;
        }
        if (myString.endsWith("x")) {
            myString = myString + " ";
        }
        List<String> str_answer = new ArrayList<>(Arrays.asList(myString.split("x")));
        List<Integer> int_answer = new ArrayList<>();
        for (int i = 0; i < str_answer.size(); i++) {
            int_answer.add(str_answer.get(i).trim().length());
        }
        return int_answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("oxooxoxxox"));

    }
}


