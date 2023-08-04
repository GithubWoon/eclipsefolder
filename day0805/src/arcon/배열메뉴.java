package arcon;

import java.util.Scanner;

public class 배열메뉴 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("메뉴판");

        String[] menu = { "짜장면", "짬뽕", "탕수육", "군만두", "볶음밥" };

        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }

        System.out.print("주문하실 음식 번호를 입력하세요: ");
        int choice = sc.nextInt();

        if (choice >= 1 && choice <= menu.length) {
            System.out.println(menu[choice - 1] + " 주문이 완료되었습니다.");
        } else {
            System.out.println("잘못된 입력입니다");
        }

        sc.close();
    }
}
