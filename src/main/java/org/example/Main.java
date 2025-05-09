package org.example;


import java.util.*;


class Solution {
    public List<Integer> solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            boolean isBreak = false;
            List<String> numbers = new ArrayList<>(Arrays.asList(String.valueOf(i).split("")));
            for (String number : numbers) {
                if (!number.equals("0") && !number.equals("5")) {
                    isBreak = true;
                    break;
                }
            }

            if (isBreak) {
                continue;
            }

            answer.add(i);
        }
        Collections.sort(answer);
        if (answer.isEmpty()) {
            answer.add(-1);
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(5, 555));

    }
}


