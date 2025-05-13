package org.example;


import java.util.Locale;

class Solution {
    public String solution(String myString) {
        myString = myString.toLowerCase();
        myString = myString.replace("a", "A");
        return myString;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("abstract algebra"));

    }
}


