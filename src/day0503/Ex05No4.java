package day0503;

import java.util.Scanner;
public class Ex05No4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char star = '*';
        char empty= ' ';

        System.out.println("숫자를 입력하세요.");
        System.out.print("> ");
        int lowNumber=scanner.nextInt();

        for (int i = 1;i <= lowNumber;i++ ) {     //i= 별의 갯수

            for (int j = 1; j <= lowNumber;j++) {

                if (i <= j) {
                    System.out.print(star);

                } else {
                    System.out.print(empty);
                }

            }
            System.out.println();
        }
    }
}
