package arcon;

import java.util.Scanner;

public class �޴� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. ¥���");
		System.out.println("2. «��");
		System.out.println("3. ������");
		System.out.println("4. ������");
		System.out.println("5. ������");
		System.out.println("�ֹ��Ͻ� ���Ĺ�ȣ�� �����ϼ���: ");
		
		int choice = sc.nextInt(); // ��ȣ �Է�
		
		if(choice == 1) {
			System.out.println("¥��� �ֹ��� �Ϸ�Ǿ����ϴ�");
		}
			else if(choice == 2) {
				System.out.println("«�� �ֹ��� �Ϸ�Ǿ����ϴ�");
			}
			else if(choice == 3) {
				System.out.println("������ �ֹ��� �Ϸ�Ǿ����ϴ�");
			}
			else if(choice == 4) {
				System.out.println("������ �ֹ��� �Ϸ�Ǿ����ϴ�");
			}
			else if(choice == 5) {
				System.out.println("������ �ֹ��� �Ϸ�Ǿ����ϴ�");
			}
			else {
				System.out.println("�߸��� �����Դϴ�");
				
				sc.close();
			}

	}

}
