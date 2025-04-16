package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public String solution(String rsp) {
        List<String> rspBits = new ArrayList<>(Arrays.asList(rsp.split("")));
        String rs = "";
        for (String r : rspBits) {
            if (r.startsWith("0")) {
                rs += "5";
            } else if(r.startsWith("2")) {
                rs += "0";
            } else {
                rs += "2";
            }
        }
        return rs;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("205"));
    }
}


