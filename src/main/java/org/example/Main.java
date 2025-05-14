package org.example;


import java.util.Locale;

class Solution {
    public String solution(String myString, String pat) {
        if (myString.contains(pat)) {
            myString = myString.replaceAll(pat, "0");
            for (int i = myString.length() - 1; i >= 0; i--) {
                if (myString.charAt(i) == '0') {
                    myString = myString.substring(0, i + 1);
                    break;
                }
            }
        } else {
            return "";
        }
        myString = myString.replaceAll("0", pat);
        return myString;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("AbCdEFG", "dE"));

    }
}


