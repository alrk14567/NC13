package day0503;

import java.util.Scanner;
public class Ex09No8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력하세요.");
        System.out.print("> ");
        int lowNumber = scanner.nextInt();

        for (int i = 1; i <= 1+2*(lowNumber-1); i++) {

            String star = "";

            if (i <= lowNumber) {

                for (int j =1; j <= lowNumber-i;j++){
                    star += " ";
                }
                for (int j = 1; j <= i;j++) {
                    star +="*";
                }
                System.out.println(star);

            } else  {

                String stars = "";
                int count=0;
                // 공백을 담당하는 j for문
                for (int j =1; j <= i-lowNumber; j++){
                    stars +=" ";
                    count++;
                }

                // 별을 담당하는 j for문
                for (int j = 1; j <=lowNumber-count ; j++ ) {
                    stars +="*";
                }

                System.out.println(stars);
            }


        }


    }
}
