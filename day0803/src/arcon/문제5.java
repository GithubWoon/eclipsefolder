package arcon;

import java.util.Scanner;

public class ����5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ����ڷκ��� ���ڿ� �Է� �ޱ�
        System.out.print("���ڿ��� �Է��ϼ���: ");
        String text = sc.nextLine();

        // ����ڷκ��� �˻��� ���� �Է� �ޱ�
        System.out.print("�˻��� ���ڸ� �Է��ϼ���: ");
        char searchtext = sc.nextLine().charAt(0); // �Է��� ���ڿ����� ���� ù��°�� ����� ����

        // �˻��� ���ڰ� �� �� �� �ִ��� ������ �ε��� ���
        int count = 0; // ����?
        for (int a = 0; a < text.length(); a++) { // �ʱ갪 0������ ����, ���� < ���� ���̼� ���� ���� �ݺ��� ����, a ����
            if (text.charAt(a) == searchtext) {
                count++;
                System.out.println("'" + searchtext + "'�� " + (a + 1) + "��° �ε����� ��ġ�մϴ�.");
            }
        }

        if (count == 0) {
            System.out.println("'" + searchtext + "'�� ���ڿ��� �������� �ʽ��ϴ�.");
        } else {
            System.out.println("'" + searchtext + "'�� �� " + count + "�� �ֽ��ϴ�.");
        }

        sc.close();
    }
}
