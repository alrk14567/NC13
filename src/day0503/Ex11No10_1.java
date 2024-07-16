package day0503;

import java.util.Scanner;

public class Ex11No10_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력하세요.");
        System.out.print("> ");
        int userNumber = scanner.nextInt();
        int spaceWidth = 0;
        int starWidth = 0;
        int height = 2 * userNumber - 1;
        int totalWidth = 2 * userNumber - 1;

        for (int i = 1; i <= height; i++) {
            String stars = "";
            if (i == 1 || i == height) {
                for (int j = 1; j <= height; j++) {
                    stars += "*";
                }

            } else {
                spaceWidth = 0;
                starWidth = 0;

                if (i < userNumber) {
                    // 윗부분
                    int upperi = i - 1;
                    starWidth = userNumber - upperi;

                } else {
                    // 아랫부분
                    int loweri = i - userNumber + 1;
                    starWidth = loweri;
                }

                spaceWidth = totalWidth - 2 * starWidth;

                for (int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }
                for (int j = 1; j <= spaceWidth; j++) {
                    stars += " ";
                }
                for (int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }

            }
            System.out.println(stars);

        }
    }


}
