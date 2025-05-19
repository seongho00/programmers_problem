package org.example;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


class Solution {
    public String solution(String a, String b) {
        String answer = "";
        int plus1 = 0;
        boolean isUpper10 = false;
        int length = Math.min(a.length(), b.length());
        for (int i = 0; i < length; i++) {
            int a_number = a.charAt(a.length() - 1 - i) - 48;
            int b_number = b.charAt(b.length() - 1 - i) - 48;
            plus1 = 0;
            if (isUpper10) {
                plus1 = 1;
            }

            if (a_number + b_number + plus1 >= 10) {
                answer = (a_number + b_number + plus1) % 10 + answer;
                isUpper10 = true;
            } else {
                answer = (a_number + b_number + plus1) + answer;
                isUpper10 = false;
            }
        }

        if (length != a.length()) {
            for (int i = length; i < a.length(); i++) {
                int a_number = a.charAt(a.length() - 1 - i) - 48;
                plus1 = 0;
                if (isUpper10) {
                    plus1 = 1;
                }
                if (a_number + plus1 >= 10) {
                    answer = (a_number + plus1) % 10 + answer;
                    isUpper10 = true;
                } else {
                    answer = (a_number + plus1) + answer;
                    isUpper10 = false;
                }
            }
        } else if (length != b.length()) {
            for (int i = length; i < b.length(); i++) {
                int b_number = b.charAt(b.length() - 1 - i) - 48;
                plus1 = 0;
                if (isUpper10) {
                    plus1 = 1;
                }
                if (b_number + plus1 >= 10) {
                    answer = (b_number + plus1) % 10 + answer;
                    isUpper10 = true;
                } else {
                    answer = (b_number + plus1) + answer;
                    isUpper10 = false;
                }
            }
        } else if (isUpper10) {
            answer = "1" + answer;
        }

        if (isUpper10 && answer.charAt(0) == '0') {
            answer = "1" + answer;
        }


        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("582", "734"));

    }
}


