package com.acron.practice;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); // 입력값을 넣는다 스캐너 객체 생성
		
		// TODO Auto-generated method stub
		
		System.out.println("이름");
		String name = sc.nextLine(); // String 은 문자열을 받아온다 nextLine도 문자열 받음
		
		System.out.println("성별");
		String gender = sc.nextLine();
		
		System.out.println("나이");
		int age = sc.nextInt(); // 나이는 정수까지 받아오는걸로 
		
		System.out.println("키");
		float height = sc.nextFloat(); // 키는 소숫점까지 받아오는걸로
		
		
		System.out.println("키" + height + " cm 인 " + age + " 살 " + gender + " " + name + " 님 " + " 반갑습니다!");
		sc.close(); // Scanner 을 사용한 후 닫아줍시다
		
		// nextLine, nextFloat, nextInt 메서드 
		

	}

}
