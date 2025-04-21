package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        List<String> cipherBits = new ArrayList<>(Arrays.asList(cipher.split("")));
        List<String> codeBits = new ArrayList<>();

        for (int i = 1; code * i - 1 < cipherBits.size(); i++) {
            codeBits.add(cipherBits.get(code * i - 1));
        }
        return String.join("", codeBits);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("pfqallllabwaoclk", 2));
    }
}


