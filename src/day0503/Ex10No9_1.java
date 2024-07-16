package day0503;

import java.util.Scanner;

public class Ex10No9_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("숫자를 입력하세요.");
        System.out.print("> ");
        int userNumber = scanner.nextInt();


        for (int i = 1; i <= userNumber; i++) {
            String stars = "";
            int spaceWidth = userNumber -i;
            int starWidth = 2*i -1;

            for (int j= 1; j <= spaceWidth; j++) {
                stars += " ";
            }

            for (int j = 1; j <= starWidth; j++) {
                stars += "*";
            }

            System.out.println(stars);
        }
        for (int i = userNumber-1; i >= 1; i--) {
            String stars = "";
            int spaceWidth = userNumber -i;
            int starWidth = 2*i -1;

            for (int j= 1; j <= spaceWidth; j++) {
                stars += " ";
            }

            for (int j = 1; j <= starWidth; j++) {
                stars += "*";
            }

            System.out.println(stars);

        }


    }
}
