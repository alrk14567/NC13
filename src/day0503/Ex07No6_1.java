package day0503;

import java.util.Scanner;

public class Ex07No6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("숫자를 입력하세요.");
        System.out.print("> ");
        int lowNumber = scanner.nextInt();
        int height = lowNumber;

        for (int i = 1; i <= lowNumber; i++) {
            // 해당 줄의 출력 내용을 저장할 String 변수
            String stars = "";
            int spaceWidth = i - 1;
            int starWidth = -2*i + 2*lowNumber + 1;

            // 공백을 담당하는 j for 문
            for (int j = 1; j <= spaceWidth; j++) {
                stars += " ";
            }
            // 별을 담당하는 j for 문
            for (int j = 1; j <= starWidth; j++) {
                stars += "*";
            }
            System.out.println(stars);

        }
    }
}