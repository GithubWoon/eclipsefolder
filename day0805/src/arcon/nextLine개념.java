package arcon;

import java.util.Scanner;

public class nextLine���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// ���ڿ� ������ ���ڿ��� ������ �Է��� ���޴� ������ �߻��� (���๮                                                                                                             �ڸ� ���޾ƿ��� ����)
		// nextInt() -> nextLine() �̶� �߰����� nextLine �� �ѹ� �� �ۼ����ָ� �ذ�ȴ�
		System.out.println("ù��°");
		int a = sc.nextInt(); 
		
		sc.nextLine(); // nextInt ���������� ?
		String b = sc.nextLine();
		System.out.println("�̰Ŵ� " + a + " " + b);
		
		
		float c = sc.nextFloat();
		System.out.println("�̰Ŵ� " + a + " " + b + " " + c);
		
		sc.nextLine();
		String d = sc.nextLine();
		System.out.println("�̰Ŵ� " + a + " " + b + " " + c + " " + d);
		
		sc.close();
	}

}
