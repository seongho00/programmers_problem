package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> solution(String my_string) {
        List<String> answer = new ArrayList<>(Arrays.asList(my_string.split(" ")));

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("i love you"));

    }
}


