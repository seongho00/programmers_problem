package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        int id_index = 0;
        for (int i = 0; i < db.length; i++) {
            if (id_pw[0].equals(db[i][0])) {
                id_index = i;
                break;
            }
            if (i == db.length - 1) {
                return "fail";
            }
        }

        if (id_pw[1].equals(db[id_index][1])) {
            return "login";
        }


        return "wrong pw";
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new String[]{"meosseugi", "1234"}, new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}}));

    }
}


