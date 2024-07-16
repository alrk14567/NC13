package day0503;

import java.util.Scanner;

public class Ex10No9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("숫자를 입력하세요.");
        System.out.print("> ");
        int lowNumber = scanner.nextInt();
        int low = 1 + 2 * (lowNumber - 1);

        for (int i = 1; i <= low; i++) {

            String star = "";
            String empty = "";

            if (i <= lowNumber) {

                for (int j = 1; j <= lowNumber + i - 1; j++) {

                    if (j <= lowNumber - i) {
                        empty += " ";
                    } else {
                        star += "*";
                    }
                }
                System.out.println(empty + star);
            } else {
                String stars = "";
                int count=0;
                // 공백을 담당하는 j for문
                for (int j =1; j <= i-lowNumber; j++){
                    stars +=" ";
                    count++;
                }

                // 별을 담당하는 j for문
                for (int j = 2; j <=low-2*(i-6)-1 ; j++ ) {
                    stars +="*";
                }

                System.out.println(stars);



            }

        }
    }
}
