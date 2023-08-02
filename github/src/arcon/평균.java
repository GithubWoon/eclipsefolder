package com.acorn;

public class 평균 {

    public static void main(String[] args) { // main 쪽에 함수호출
        // 과목별 점수를 변수에 할당
        int lanpoint = 70; // 국어 점수
        int engpoint = 40; // 영어 점수
        int matpoint = 90; // 수학 점수
        
        // 전체 점수의 합, 평균, 과락점수 변수지정
        int total = lanpoint + engpoint + matpoint; 
        int average = total / 3;
        final int FAIL_SCORE = 50; // final 키워드는 변수를 상수로 선언 (50점을 고정값)
        
        System.out.println("전체 점수의 합: " + total + "점 입니다");
        System.out.println("전체 점수의 평균: " + average + "점 입니다");
        
        if(total >= 200) {
        	System.out.println("합산점수 " + total + "점 합산점수 합격입니다");
        }
        else {
        	System.out.println("합산점수 " + total + "점 합산점수 불합격입니다");
        }
        
        if(average >= 70) {
        	System.out.println("평균점수 " + average + "점 평균점수 합격입니다");
        }
        else {
        	System.out.println("평균점수 " + average + "점 평균점수 불합격입니다");
        }
        
        if (lanpoint < FAIL_SCORE) {
            System.out.println("국어 점수가 50점 미만으로 과락입니다.");
        }
        if (engpoint < FAIL_SCORE) {
            System.out.println("영어 점수가 50점 미만으로 과락입니다.");
        }
        if (matpoint < FAIL_SCORE) {
            System.out.println("수학 점수가 50점 미만으로 과락입니다.");
        }
    }
}
