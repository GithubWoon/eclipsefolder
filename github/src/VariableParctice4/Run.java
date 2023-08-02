package VariableParctice4;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String Name = sc.nextLine();
		// A, B, C와 같이 단일 문자는 char 타입으로 표현
		char First = Name.charAt(0); // Name 의 문자열중에 0번째 문자열을 가져온다
		char Second = Name.charAt(1);
		char Third = Name.charAt(2);
		
		System.out.println("문자열을 입력하세요");
		
		System.out.println("첫번째 문자열은 " +  First + " 입니다");
		
		System.out.println("두번째 문자열은 " + Second + " 입니다");
		
		System.out.println("세번째 문자열은 " + Third + " 입니다");
	
		sc.close();
		

	}

}
