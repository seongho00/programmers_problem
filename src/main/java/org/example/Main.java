package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public String solution(String letter) {
        HashMap<String,String> morse = new  HashMap<>();
        morse.put(".-","a");
        morse.put("-...","b");
        morse.put("-.-.","c");
        morse.put("-..","d");
        morse.put(".","e");
        morse.put("..-.","f");
        morse.put("--.","g");
        morse.put("....","h");
        morse.put("..","i");
        morse.put(".---", "j");
        morse.put("-.-", "k");
        morse.put(".-..","l");
        morse.put("--","m");
        morse.put("-.", "n");
        morse.put("---", "o");
        morse.put(".--.", "p");
        morse.put("--.-", "q");
        morse.put(".-.", "r");
        morse.put("...", "s");
        morse.put("-", "t");
        morse.put("..-", "u");
        morse.put("...-", "v");
        morse.put(".--", "w");
        morse.put("-..-", "x");
        morse.put("-.--", "y");
        morse.put("--..", "z");

        List<String> letterBits = new ArrayList<>(Arrays.asList(letter.split(" ")));
        String result = "";

        for (int i = 0; i < letterBits.size(); i++) {
            result += morse.get(letterBits.get(i));
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(".--. -.-- - .... --- -."));
    }
}


