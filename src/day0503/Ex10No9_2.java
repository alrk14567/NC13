package day0503;

import java.util.Scanner;

public class Ex10No9_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("숫자를 입력하세요.");
        System.out.print("> ");
        int userNumber = scanner.nextInt();
        int height = 2 * userNumber - 1;

        // 1개의 커다란 i for 문
        for (int i=1; i <= height; i++) {
            String stars = "";
            int spaceWidth=0;
            int starWidth=0;

            if (i < userNumber) {
                //d윗부분
                spaceWidth = userNumber -i;
                starWidth = 2*i -1;

                for (int j=1; j <= spaceWidth; j++) {
                    stars += " ";
                }

                for (int j=1; j<= starWidth; j++) {
                    stars +="*";
                }
                System.out.println(stars);

            } else {
                // 아랫부분
                int lowerI = 2*userNumber - i;
                spaceWidth = userNumber -lowerI;
                starWidth = 2*lowerI -1;
                for (int j=1; j <= spaceWidth; j++) {
                    stars += " ";
                }

                for (int j=1; j<= starWidth; j++) {
                    stars +="*";
                }
                System.out.println(stars);
            }



        }
    }

}
