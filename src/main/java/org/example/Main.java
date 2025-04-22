package org.example;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        List<String> speakWords = new ArrayList<>();
        speakWords.add("aya");
        speakWords.add("ye");
        speakWords.add("woo");
        speakWords.add("ma");

        int count = 0;
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < speakWords.size(); j++) {
                babbling[i] = babbling[i].replaceAll(speakWords.get(j), " ");
            }
        }
        for (int i = 0; i < babbling.length; i++) {
            if(babbling[i].trim().isEmpty()){
                count++;
            }
        }
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
    }
}


