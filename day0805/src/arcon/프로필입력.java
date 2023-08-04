package arcon;
import java.util.Scanner;

public class 프로필입력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름: ");
		String name = sc.nextLine();

		System.out.print("나이: ");
		int age = sc.nextInt();
		sc.nextLine(); // 개행 문자 제거 즉 초기화

		System.out.print("학과: ");
		String major = sc.nextLine();

		System.out.print("학점: ");
		float gpa = sc.nextFloat();

		System.out.println(name + "님의 나이는 " + age + "살, 학과는 " + major + "이며 학점은 " + gpa + "점입니다.");

		sc.close();
	}

}
