package day0503;

import java.util.Scanner;
public class Ex05No4_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력하세요.");
        System.out.print("> ");
        int userNumber = scanner.nextInt();

        for (int i =1 ; i <= userNumber; i++) {
            String stars = "";

            for (int j = 1; j <i;j++) {
                stars += " ";
            }

            for (int j = 1; j <=userNumber-i+1; j++) {
                stars += "*";
            }
            System.out.println(stars);

        }
    }
}
