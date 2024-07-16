package day0503;

import java.util.Scanner;

public class Ex11No10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력하세요.");
        System.out.print("> ");
        int lowNumber = scanner.nextInt();
        int low = 2 * lowNumber - 1;

        for (int i = 1; i <= low; i++) {
            // 해당 줄의 출력 내용을 저장할 String 변수
            String stars = "";
            // 해당 줄의 공백의 갯수를 저장할 int 변수
            int spaceWidth = 0;
            //해당 줄의 별의 갯수를 저장할 int 변수\
            int starWidth = 0;
            if (i == 1 || i == low) {
                for (int j = 1; j <= low; j++) {
                    stars += "*";
                }
                System.out.println(stars);

            } else if (i <= lowNumber) {
                spaceWidth = 2 * i - 3;
                starWidth = -2 * i + 2 * lowNumber + 2;
                for (int j = 1; j <= starWidth / 2; j++) {
                    stars += "*";
                }
                // 가운데 넘어가면
                for (int j = 1; j <= spaceWidth; j++) {
                    stars += " ";
                }
                // 공백 끝나고
                for (int j = 1; j <= starWidth / 2; j++) {
                    stars += "*";
                }
                System.out.println(stars);

            } else {
                spaceWidth = -2 * i + 4 * lowNumber - 3;
                starWidth = +2 * i - 2 * lowNumber + 2;

                for (int j = 1; j <= starWidth / 2; j++) {
                    stars += "*";
                }
                // 가운데 넘어가면
                for (int j = 1; j <= spaceWidth; j++) {
                    stars += " ";
                }
                // 공백 끝나고
                for (int j = 1; j <= starWidth / 2; j++) {
                    stars += "*";
                }
                System.out.println(stars);

            }


        }


    }
}
