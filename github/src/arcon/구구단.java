package com.acorn;

public class 구구단 {
    public static void main(String[] args) {
        for (int dan = 2; dan <= 9; dan++) { // 2단부터 9단까지
            System.out.print(dan + "단: "); // 단 문구 출력 // dan 수치의 값에 + "단" 문구를 붙임
            for (int i = 1; i <= 9; i++) { // *1, *2, *3, *4, *5, *6, *7, *8, *9 뒤에 곱하는 수
                int result = dan * i; // 결과값에는 dan 수치와 i를 곱할것임
                System.out.print(result + " "); // 계산결과 문구 출력
   }
            System.out.println("");
  }
        System.out.println("변수명 바꿔본 구구단입니다");
        
    
 }
}

