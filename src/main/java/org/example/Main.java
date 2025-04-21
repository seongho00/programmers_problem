package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isUpperCase(my_string.charAt(i))) {
                answer += (my_string.charAt(i) + "").toLowerCase();
            } else {
                answer += (my_string.charAt(i) + "").toUpperCase();
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("cccCCC"));
    }
}


