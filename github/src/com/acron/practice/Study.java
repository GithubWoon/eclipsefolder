package com.acron.practice;

import java.util.Scanner;

public class Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int selectedBtnPrev = 0;
		int selectedBtnNow = 0;

		while (true) {
			System.out.println("^_^ 메뉴 ^_^");
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.println("99. 기능 선택 종료");

			selectedBtnPrev = sc.nextInt();
			if (selectedBtnPrev == 99) {
				System.out.println("축하합니다~");
				break; // 99가 되면 탈출하고 끝내
			} else if ((selectedBtnPrev < 1) || (selectedBtnPrev > 4)) { // || 논리연산자 or
				System.out.println("잘못된 선택입니다. 다시!");
				continue;
			}

			// 선택된 기능에 따라 처리를 추가할 수 있음
		}

		sc.close();
	}
}
