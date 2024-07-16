package day0503;

import java.util.Scanner;

public class Ex03No2_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("숫자를 입력하세요.");
        System.out.print("> ");
        int lowNumber = scanner.nextInt();
        int height = lowNumber;

        for (int i = 1; i <= height; i++) {     //i= 별의 갯수
            // 해당 줄의 출력 내용을 저장할 String 변수
            String stars = "";

            for (int j = i; j <= lowNumber; j++) {
                stars += "*";

            }
            System.out.println(stars);

        }
    }
}
