package arcon;

import java.util.Scanner;

public class ����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String password = sc.nextLine(); // password �Է°�
		
		// ��й�ȣ �ڸ��ľ�
		char First = (password.charAt(0)); // password �� ù��° ����
		char Second = (password.charAt(1));
		char Third = (password.charAt(2));
		char Fourth = (password.charAt(3));
		
		// 4�ڸ� �ʰ� �Է�������
		
		if(password.length()>4) { 
		System.out.println("��й�ȣ �����Ұ� ���̸� 4�ڷ� �����ּ���");
		}
		
		// 4�ڸ� �̸� �Է�������
		else if(password.length()<4) {
			System.out.println("��й�ȣ �����Ұ� ���̸� 4�ڷ� �����ּ���");
		}
		
		// ù��° �ڸ��� 0�� �ð��
		else if(First == '0') {
			System.out.println("��й�ȣ �����Ұ� ù��° �ڸ��� 0�� ������ ���� �Է����ּ���");
		}
		
		// �ߺ��Ǵ� ����Ȯ��
		else if(First == Second || First == Third || First == Fourth || 
				Second == Third || Second == Fourth || 
				Third == Fourth) {
			System.out.println("��й�ȣ �����Ұ� �ߺ��� ���ڰ� �����մϴ�");
		}
		
		// �����Ϸ�
		else{
			System.out.println("��й�ȣ �����Ϸ�");
		}

	}
}
