package day0503;

import java.util.Scanner;
public class Ex03No2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char star = '*';
        char empty = ' ';

        System.out.println("숫자를 입력하세요.");
        System.out.print("> ");
        int lowNumber = scanner.nextInt();

        for (int i = 1; i <= lowNumber; i++) {     //i= 별의 갯수

            for (int j = lowNumber; j >= i; j--) {
                    System.out.print(star);

            }
            System.out.println();
        }
    }
}