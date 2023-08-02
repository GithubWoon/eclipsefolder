package com.acorn;
public class oneandten {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " ");
            for(int j =1; j <= 9; j++) {
            	System.out.println(j + " ");
            }
            System.out.println();
        }
        System.out.println("출력이 완료되었어요");
        System.out.print("출력을 완료하였으니 쉬세요");
    }
}

// 결과값

// 1: 1 2 3 4 5 6 7 8 9
// 2: 1 2 3 4 5 6 7 8 9