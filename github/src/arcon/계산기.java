package com.acorn;

import java.io.InterruptedIOException;
import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ���α׷�");
		System.out.println("�޴�");
		System.out.println("1. ���ϱ�");
		System.out.println("2. ����");
		System.out.println("99. ����");
		System.out.print("���ϴ� �޴��� �����ϼ���");
		int iKeyValue = sc.nextInt();
		if(iKeyValue != 1) && (iKeyValue != 2) && (iKeyValue != 99)){
			System.out.print("�߸��� �޴��� �����Ͽ����ϴ�");
			System.out.print("���ϴ� �޴��� �ٽ� �����ϼ���");
		}
		
		if(iKeyValue == 99) {
			System.out.println("���α׷��� �����մϴ�");
			System.exit(0);
		}
		
		if( (iKeyValue != 1) && (iKeyValue !=2)) {
			System.out.println("�߸��� �޴��� �����ϼ̽��ϴ�");
			System.out.println("���ϴ� �޴��� �ٽ� �����ϼ���");
		}
	}
}
