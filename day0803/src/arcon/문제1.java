package arcon;

import java.util.Scanner;

public class ����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(); // �߰����� �Է°�
		int B = sc.nextInt(); // �⸻���� �Է°�
		int C = sc.nextInt(); // �������� �Է°�
		int D = sc.nextInt(); // �⼮Ƚ�� �Է°�
		

		// ȯ������, Ÿ���� ���ڷ� ��Ÿ����� �ϴϱ� �տ� int �� �ٿ���
		int E = (int)(A * 0.2); // �߰�ȯ��
		int F = (int)(B * 0.3); // �⸻ȯ��
		int G = (int)(C * 0.3); // ����ȯ��
		int H = (int)(D); // �⼮ȯ�� // ȯ��Ǵ� �ִ� �⼮���� 20�� // �� ������ 20��, ���� 1ȸ�� 1������ // �⼮ 6ȸ ���ϸ� �Ἦ
		int total = E + F + G + H; // ����
		
		if(total >= 70) // ���� 70�� �̻��϶� Pass ����
			if(D <= 6) { // �⼮�� 6ȸ ���϶�� Fail �� �� 
				System.out.println("Fail");
			}
			else {
				System.out.println("Pass");
			}
			
		else
			System.out.println("Fail");
		
		sc.close();

	}

}
