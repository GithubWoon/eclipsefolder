package com.acorn;

public class ����� {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // �� ����
            String sharp = ""; // sharp �� �� ���ڿ��� �ʱ�ȭ
            String star = "";

            for (int j = 1; j <= i; j++) { // �� ����
                sharp += "#";
            }

            for (int k = 1; k <= i; k++) { // �� ����
                star += "*";
            }

            System.out.println(sharp + star);
        }
        System.out.print("�����ϼ̽��ϴ�");
    } 
}
