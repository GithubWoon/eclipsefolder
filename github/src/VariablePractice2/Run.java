package VariablePractice2;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // �츮�� ���������� ���� �־��� �� ���� �ణ input type = text ? ����

        System.out.print("ù ��° ���ڸ� �Է��ϼ���: ");
        int First = sc.nextInt();

        System.out.print("�� ��° ���ڸ� �Է��ϼ���: ");
        int Second = sc.nextInt();

        int plus = First + Second;
        int minus = First - Second;
        int multiply = First * Second;
        int divide = First / Second;

        System.out.println("���ϱ� ����� " + plus + "�Դϴ�");
        System.out.println("���� ����� " + minus + "�Դϴ�");
        System.out.println("���ϱ� ����� " + multiply + "�Դϴ�");
        System.out.println("������ ����� " + divide + "�Դϴ�");

        sc.close();
    }
}
