package com.acron.practice;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); // �Է°��� �ִ´� ��ĳ�� ��ü ����
		
		// TODO Auto-generated method stub
		
		System.out.println("�̸�");
		String name = sc.nextLine(); // String �� ���ڿ��� �޾ƿ´� nextLine�� ���ڿ� ����
		
		System.out.println("����");
		String gender = sc.nextLine();
		
		System.out.println("����");
		int age = sc.nextInt(); // ���̴� �������� �޾ƿ��°ɷ� 
		
		System.out.println("Ű");
		float height = sc.nextFloat(); // Ű�� �Ҽ������� �޾ƿ��°ɷ�
		
		
		System.out.println("Ű" + height + " cm �� " + age + " �� " + gender + " " + name + " �� " + " �ݰ����ϴ�!");
		sc.close(); // Scanner �� ����� �� �ݾ��ݽô�
		
		// nextLine, nextFloat, nextInt �޼��� 
		

	}

}
