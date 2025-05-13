package org.example;


import java.util.Locale;

class Solution {
    public String solution(String my_string, String alp) {
        String upper_alp = alp.toUpperCase();
        my_string = my_string.replace(alp, upper_alp);
        return my_string;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("programmers", "p"));

    }
}


