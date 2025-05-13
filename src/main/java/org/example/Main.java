package org.example;


import java.util.Locale;

class Solution {
    public int solution(String myString, String pat) {
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        if (myString.contains(pat)) {
            return 1;
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("AbCdEfG", "aBc"));

    }
}


