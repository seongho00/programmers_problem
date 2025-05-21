package org.example;


import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


class Solution {
    public String solution(String myString) {
        List<String> words = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            words.add(String.valueOf((char) (i + 97)));
        }
        for (int i = 0; i < words.size(); i++) {
            if (myString.contains(words.get(i))) {
                myString = myString.replace(words.get(i), "l");
            }
        }
        return myString;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("abcdevwxyz"));

    }
}


