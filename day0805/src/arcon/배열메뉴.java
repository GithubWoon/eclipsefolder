package arcon;

import java.util.Scanner;

public class �迭�޴� {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("�޴���");

        String[] menu = { "¥���", "«��", "������", "������", "������" };

        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }

        System.out.print("�ֹ��Ͻ� ���� ��ȣ�� �Է��ϼ���: ");
        int choice = sc.nextInt();

        if (choice >= 1 && choice <= menu.length) {
            System.out.println(menu[choice - 1] + " �ֹ��� �Ϸ�Ǿ����ϴ�.");
        } else {
            System.out.println("�߸��� �Է��Դϴ�");
        }

        sc.close();
    }
}
