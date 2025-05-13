package org.example;


import java.util.Locale;

class Solution {
    public String solution(String myString) {
        return myString.toUpperCase();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("aBcDeFg"));

    }
}


