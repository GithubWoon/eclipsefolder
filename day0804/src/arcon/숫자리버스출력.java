package arcon;

import java.util.Scanner;

public class ���ڸ�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1�̻��� �ڿ����� �Է��ϼ���: ");
        int number = sc.nextInt();

        if (number < 1) {
            System.out.println("1 �̻��� �ڿ����� �Է��ؾ� �մϴ�");
            sc.close();
            return;
        }

        for (int i = number; i >= 1; i--) { // �ݺ��۾�
            System.out.print(i + " ");
        }

        sc.close();
	}
}