package arcon;

import java.util.Scanner;

public class 숫자리버스출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 자연수를 입력하세요: ");
        int number = sc.nextInt();

        if (number < 1) {
            System.out.println("1 이상의 자연수를 입력해야 합니다");
            sc.close();
            return;
        }

        for (int i = number; i >= 1; i--) { // 반복작업
            System.out.print(i + " ");
        }

        sc.close();
	}
}