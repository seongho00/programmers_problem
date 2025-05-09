package org.example;


import java.util.*;


class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean V1 = V(x1, x2);
        boolean V2 = V(x3, x4);
        boolean answer = X(V1, V2);
        return answer;

    }

    private boolean X(boolean v1, boolean v2) {
        if (v1 == false || v2 == false) {
            return false;
        }
        return true;
    }

    private boolean V(boolean b1, boolean b2) {
        if (b1 == false && b2 == false) {
            return false;
        }
        return true;
    }

}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(true, false, false, false));

    }
}


