package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String code) {
        List<String> codeBits = new ArrayList<>(Arrays.asList(code.split("")));
        List<String> ret = new ArrayList<>();

        int mode = 0;
        for (int idx = 0; idx < codeBits.size(); idx++) {
            // mode 0 일 때
            if (mode == 0) {
                // 모드 바꾸기
                if (codeBits.get(idx).equals("1")) {
                    mode = 1;
                    continue;
                }

                // 1이 아닐 때 : idx 짝수일 때만 문자 넣기
                if (idx % 2 == 0){
                    ret.add(codeBits.get(idx));
                }
            }

            // mode 1 일 때
            if (mode == 1) {
                // 모드 바꾸기
                if (codeBits.get(idx).equals("1")) {
                    mode = 0;
                    continue;
                }

                // 1이 아닐 때 : idx 홀수일 때만 문자 넣기
                if (idx % 2 == 1){
                    ret.add(codeBits.get(idx));
                }
            }
        }
        // ret 에 아무것도 없을 때
        if (ret.isEmpty()){
            return "EMPTY";
        }

        return String.join("", ret);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("abc1abc1abc"));
    }
}


