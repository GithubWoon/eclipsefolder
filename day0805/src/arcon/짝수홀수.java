package arcon;

import java.util.Scanner;

public class ¦��Ȧ�� {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("������ �Է��ϼ���: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("¦����");
        } else {
            System.out.println("Ȧ����");
        }

        sc.close();
    }
}

