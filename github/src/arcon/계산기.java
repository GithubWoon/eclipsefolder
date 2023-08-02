package com.acorn;

import java.io.InterruptedIOException;
import java.util.Scanner;

public class 계산기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계산기 프로그램");
		System.out.println("메뉴");
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("99. 종료");
		System.out.print("원하는 메뉴를 선택하세요");
		int iKeyValue = sc.nextInt();
		if(iKeyValue != 1) && (iKeyValue != 2) && (iKeyValue != 99)){
			System.out.print("잘못된 메뉴를 선택하였습니다");
			System.out.print("원하는 메뉴를 다시 선택하세요");
		}
		
		if(iKeyValue == 99) {
			System.out.println("프로그램을 종료합니다");
			System.exit(0);
		}
		
		if( (iKeyValue != 1) && (iKeyValue !=2)) {
			System.out.println("잘못된 메뉴를 선택하셨습니다");
			System.out.println("원하는 메뉴를 다시 선택하세요");
		}
	}
}
