package arcon;

import java.util.Scanner;

public class ����1���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int middleTerm = sc.nextInt();
		int finalTerm = sc.nextInt();
		int report = sc.nextInt();
		int attendCnt = sc.nextInt();
		
		int conMiddleTerm = (int)(middleTerm * 0.2);
		int conFinalTerm = (int)(finalTerm * 0.3);
		int conReport = (int)(report * 0.3);
		int conAttendCnt = (int)((attendCnt/20) * 0.2);
		
		int totalScore = conMiddleTerm + conFinalTerm + conReport + conAttendCnt;
		
		if( (totalScore >= 70) && (conAttendCnt > 30) ) System.out.println("Pass");
		else System.out.println("Fail");
		
		sc.close();

	}

}

// �߰����, �⸻���, ��������, �⼮Ƚ���� �Է��ϰ� Pass, Fail �� ����Ͻÿ�
// �򰡺����� �⼮20%, �߰� 20%, �⸻ 30%, ���� 30% �Դϴ�
// �⼮������ �� �⼮�� 20ȸ�߿��� ������ ������ �����ϴ�
// ���� 70�� �̻��ϰ�� 

// &&: and
// and: and
// ||: or
// or: or
// !: not