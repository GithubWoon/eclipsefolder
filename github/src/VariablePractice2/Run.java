package VariablePractice2;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 우리가 유동적으로 값을 넣어줄 수 있음 약간 input type = text ? 느낌

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int First = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int Second = sc.nextInt();

        int plus = First + Second;
        int minus = First - Second;
        int multiply = First * Second;
        int divide = First / Second;

        System.out.println("더하기 결과는 " + plus + "입니다");
        System.out.println("빼기 결과는 " + minus + "입니다");
        System.out.println("곱하기 결과는 " + multiply + "입니다");
        System.out.println("나누기 결과는 " + divide + "입니다");

        sc.close();
    }
}
