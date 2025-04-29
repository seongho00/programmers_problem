package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];

        int width = (board[0] - 1) / 2;
        int height = (board[1] - 1) / 2;
        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("left")) {
                answer[0] -= 1;
            } else if (keyinput[i].equals("right")) {
                answer[0] += 1;
            } else if (keyinput[i].equals("up")) {
                answer[1] += 1;
            } else if (keyinput[i].equals("down")) {
                answer[1] -= 1;
            }

            if (answer[0] < -width) {
                answer[0] = -width;

            } else if (answer[0] > width) {
                answer[0] = width;
            }

            if (answer[1] > height) {
                answer[1] = height;
            } else if (answer[1] < -height) {
                answer[1] = -height;
            }

        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11}));

    }
}


