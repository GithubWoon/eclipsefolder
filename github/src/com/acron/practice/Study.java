package com.acron.practice;

import java.util.Scanner;

public class Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int selectedBtnPrev = 0;
		int selectedBtnNow = 0;

		while (true) {
			System.out.println("^_^ �޴� ^_^");
			System.out.println("1. ���ϱ�");
			System.out.println("2. ����");
			System.out.println("3. ���ϱ�");
			System.out.println("4. ������");
			System.out.println("99. ��� ���� ����");

			selectedBtnPrev = sc.nextInt();
			if (selectedBtnPrev == 99) {
				System.out.println("�����մϴ�~");
				break; // 99�� �Ǹ� Ż���ϰ� ����
			} else if ((selectedBtnPrev < 1) || (selectedBtnPrev > 4)) { // || �������� or
				System.out.println("�߸��� �����Դϴ�. �ٽ�!");
				continue;
			}

			// ���õ� ��ɿ� ���� ó���� �߰��� �� ����
		}

		sc.close();
	}
}
