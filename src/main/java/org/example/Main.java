package org.example;


import java.util.Locale;

class Solution {
    public String[] solution(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                strArr[i] = strArr[i].toLowerCase();
            } else {
                strArr[i] = strArr[i].toUpperCase();
            }
        }
        return strArr;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new String[]{"AAA", "BBB", "CCC", "DDD"}));

    }
}


