package arcon;

import java.util.Scanner;

public class nextLine개념 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 숫자열 다음에 문자열로 받을때 입력을 못받는 문제가 발생함 (개행문                                                                                                             자를 못받아오는 문제)
		// nextInt() -> nextLine() 이때 중간에서 nextLine 을 한번 더 작성해주면 해결된다
		System.out.println("첫번째");
		int a = sc.nextInt(); 
		
		sc.nextLine(); // nextInt 문구까지만 ?
		String b = sc.nextLine();
		System.out.println("이거는 " + a + " " + b);
		
		
		float c = sc.nextFloat();
		System.out.println("이거는 " + a + " " + b + " " + c);
		
		sc.nextLine();
		String d = sc.nextLine();
		System.out.println("이거는 " + a + " " + b + " " + c + " " + d);
		
		sc.close();
	}

}
