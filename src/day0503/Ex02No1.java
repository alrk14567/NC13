package day0503;

import java.util.Scanner;
public class Ex02No1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char star = '*';

        System.out.println("숫자를 입력하세요.");
        System.out.print("> ");
        int lowNumber=scanner.nextInt();

        for (int i = 1;i <= lowNumber;i++ ) {               // i 값  행으로 생각

            for (int j = 1; j <= lowNumber;j++) {           // j 값 열로 생각

                if (i >=j) {                            //별이 들어갈 조건
                    System.out.print(star);
                }

            }
            System.out.println("");

        }

    }
}
