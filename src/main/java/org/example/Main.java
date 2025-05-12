package org.example;


import java.util.*;

class Solution {
    public List<String> solution(String[] todo_list, boolean[] finished) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < finished.length; i++) {
            if (finished[i] == false) {
                answer.add(todo_list[i]);
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"}, new boolean[]{true, false, true, false}));

    }
}


