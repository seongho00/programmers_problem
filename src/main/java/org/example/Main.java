package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> solution(String[] quiz) {
        List<String> isRight = new ArrayList<>();

        for (int i = 0; i < quiz.length; i++) {
            String quizString = quiz[i].split(" = ")[0];
            String answer = quiz[i].split(" = ")[1];
            int quizAnswer = 0;
            if (quizString.contains(" - ")) {
                quizString = quizString.replace(" - ", " + -");
            }
            List<String> numbers = new ArrayList<>(Arrays.asList(quizString.split(" \\+ ")));

            for (int j = 0; j < numbers.size(); j++) {
                quizAnswer += Integer.parseInt(numbers.get(j));
            }

            if (quizAnswer == Integer.parseInt(answer)) {
                isRight.add("O");
            } else {
                isRight.add("X");
            }

        }
        return isRight;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new String[]{"19 + -6 + 5 - 4 + 5 + 4 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"}));

    }
}


