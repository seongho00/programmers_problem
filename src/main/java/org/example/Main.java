package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(String s) {
        String answer = "";
        List<String> list = Arrays.asList(s.split(""));

        for (int i = 0; i < list.size(); i++) {
            boolean isMulti = false;
            if (list.get(i).equals("")) {
                continue;
            }
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.set(j, "");
                    isMulti = true;
                }
            }
            if (isMulti) {
                list.set(i, "");
            }
        }
        Collections.sort(list);

        return String.join("",list).trim();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("hello"));
    }
}


