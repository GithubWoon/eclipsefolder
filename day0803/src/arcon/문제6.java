package arcon;

import java.util.Scanner;

public class ����6 {
    public static void main(String[] args) {
        String[] days = {"��", "ȭ", "��", "��", "��", "��", "��"}; // �迭�� ������־����ϴ�
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("0���� 6���� ���ڸ� �Է��ϼ���: ");
        int Number = sc.nextInt();
        
        if (Number >= 0 && Number <= 6) {
            System.out.println(days[Number] + "����");
        } else {
            System.out.println("�߸� �Է��ϼ̽��ϴ�.");
        }
        
        sc.close();
    }
}

