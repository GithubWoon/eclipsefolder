package VariableParctice4;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String Name = sc.nextLine();
		// A, B, C�� ���� ���� ���ڴ� char Ÿ������ ǥ��
		char First = Name.charAt(0); // Name �� ���ڿ��߿� 0��° ���ڿ��� �����´�
		char Second = Name.charAt(1);
		char Third = Name.charAt(2);
		
		System.out.println("���ڿ��� �Է��ϼ���");
		
		System.out.println("ù��° ���ڿ��� " +  First + " �Դϴ�");
		
		System.out.println("�ι�° ���ڿ��� " + Second + " �Դϴ�");
		
		System.out.println("����° ���ڿ��� " + Third + " �Դϴ�");
	
		sc.close();
		

	}

}
