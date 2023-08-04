package arcon;

import java.util.Scanner;

public class 메뉴 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 짜장면");
		System.out.println("2. 짬뽕");
		System.out.println("3. 탕수육");
		System.out.println("4. 군만두");
		System.out.println("5. 볶음밥");
		System.out.println("주문하실 음식번호를 선택하세요: ");
		
		int choice = sc.nextInt(); // 번호 입력
		
		if(choice == 1) {
			System.out.println("짜장면 주문이 완료되었습니다");
		}
			else if(choice == 2) {
				System.out.println("짬뽕 주문이 완료되었습니다");
			}
			else if(choice == 3) {
				System.out.println("탕수육 주문이 완료되었습니다");
			}
			else if(choice == 4) {
				System.out.println("군만두 주문이 완료되었습니다");
			}
			else if(choice == 5) {
				System.out.println("볶음밥 주문이 완료되었습니다");
			}
			else {
				System.out.println("잘못된 선택입니다");
				
				sc.close();
			}

	}

}
