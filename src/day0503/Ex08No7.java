package day0503;

import java.util.Scanner;

public class Ex08No7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력하세요.");
        System.out.print("> ");
        int lowNumber = scanner.nextInt();

        for (int i = 1; i <= 1 + 2 * (lowNumber - 1); i++) {

            String star = "*";

            if (i <= lowNumber) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(star);
                }
            } else if (i > lowNumber) {
                for (int j = 1 + 2 * (lowNumber - 1); j >= i; j--) {
                    System.out.print(star);
                }
            }
            System.out.println();

        }


    }
}
