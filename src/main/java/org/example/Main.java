package org.example;


import java.util.*;

class Solution {
    public List<String> solution(String[] names) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < names.length; i += 5) {
            answer.add(names[i]);
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new String[]{"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"}));

    }
}


