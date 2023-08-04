package arcon;

import java.util.Scanner;

public class Â¦¼öÈ¦¼ö {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Á¤¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Â¦¼ö´Ù");
        } else {
            System.out.println("È¦¼ö´Ù");
        }

        sc.close();
    }
}

