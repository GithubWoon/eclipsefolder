package arcon;
import java.util.Scanner;

public class �������Է� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�̸�: ");
		String name = sc.nextLine();

		System.out.print("����: ");
		int age = sc.nextInt();
		sc.nextLine(); // ���� ���� ���� �� �ʱ�ȭ

		System.out.print("�а�: ");
		String major = sc.nextLine();

		System.out.print("����: ");
		float gpa = sc.nextFloat();

		System.out.println(name + "���� ���̴� " + age + "��, �а��� " + major + "�̸� ������ " + gpa + "���Դϴ�.");

		sc.close();
	}

}
