package com.acorn;

public class ��� {

    public static void main(String[] args) { // main �ʿ� �Լ�ȣ��
        // ���� ������ ������ �Ҵ�
        int lanpoint = 70; // ���� ����
        int engpoint = 40; // ���� ����
        int matpoint = 90; // ���� ����
        
        // ��ü ������ ��, ���, �������� ��������
        int total = lanpoint + engpoint + matpoint; 
        int average = total / 3;
        final int FAIL_SCORE = 50; // final Ű����� ������ ����� ���� (50���� ������)
        
        System.out.println("��ü ������ ��: " + total + "�� �Դϴ�");
        System.out.println("��ü ������ ���: " + average + "�� �Դϴ�");
        
        if(total >= 200) {
        	System.out.println("�ջ����� " + total + "�� �ջ����� �հ��Դϴ�");
        }
        else {
        	System.out.println("�ջ����� " + total + "�� �ջ����� ���հ��Դϴ�");
        }
        
        if(average >= 70) {
        	System.out.println("������� " + average + "�� ������� �հ��Դϴ�");
        }
        else {
        	System.out.println("������� " + average + "�� ������� ���հ��Դϴ�");
        }
        
        if (lanpoint < FAIL_SCORE) {
            System.out.println("���� ������ 50�� �̸����� �����Դϴ�.");
        }
        if (engpoint < FAIL_SCORE) {
            System.out.println("���� ������ 50�� �̸����� �����Դϴ�.");
        }
        if (matpoint < FAIL_SCORE) {
            System.out.println("���� ������ 50�� �̸����� �����Դϴ�.");
        }
    }
}
