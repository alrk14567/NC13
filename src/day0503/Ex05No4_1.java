package day0503;

import java.util.Scanner;
public class Ex05No4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("숫자를 입력하세요.");
        System.out.print("> ");
        int lowNumber=scanner.nextInt();
        int height = lowNumber;

        for (int i = 1;i <= height;i++ ) {
            String stars = "";
            // 공백을 담당하는 j for문
            for (int j =1; j <= i-1; j++){
                stars +=" ";
            }

            // 별을 담당하는 j for문
            for (int j = i; j <= lowNumber; j++ ) {
                stars +="*";
            }

            System.out.println(stars);
        }
    }
}