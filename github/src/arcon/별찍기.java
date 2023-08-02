package com.acorn;

public class 별찍기 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // 행 개수
            String sharp = ""; // sharp 를 빈 문자열로 초기화
            String star = "";

            for (int j = 1; j <= i; j++) { // 샵 개수
                sharp += "#";
            }

            for (int k = 1; k <= i; k++) { // 별 개수
                star += "*";
            }

            System.out.println(sharp + star);
        }
        System.out.print("수고하셨습니다");
    } 
}
