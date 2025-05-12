package org.example;


import java.util.*;

class Solution {
    public List<String> solution(String[] str_list) {
        List<String> answer = new ArrayList<>();

        if (str_list[0].equals("l")) {
            return answer;
        }

        for (int i = 1, k = 0; i < str_list.length; i++, k++) {

            if (str_list[k].equals("r")) {
                for (int j = k + 1; j < str_list.length; j++) {
                    answer.add(str_list[j]);
                }
                break;
            } else if (str_list[i].equals("l")) {
                for (int j = 0; j < i; j++) {
                    answer.add(str_list[j]);
                }
                break;

            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new String[]{"l", "r", "r", "r", "r"}));

    }
}


