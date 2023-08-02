package com.acorn;

import java.util.Scanner;

public class study3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수:");
		int lanpoint = sc.nextInt();
		
		System.out.println("영어점수:");
		int engpoint = sc.nextInt();
		
		System.out.println("수학점수:");
		int matpoint = sc.nextInt();
		
		System.out.println("전체 점수의 합:" + (lanpoint + engpoint + matpoint));
		sc.close();
	}
}

		// 과목별 과락 점수를 지정
		// 임의의 과목 3개의 점수
		// 모든 점수 합산
		// 모든 점수 평균
		// 합산 점수의 합격 / 불합격 결정
		// 평균 점수의 합격 / 불합격 결정
		// 과락 기준에 따른 합격 불합격 결정
		// 합격 여부, 불합격 여부의 이유 출력
