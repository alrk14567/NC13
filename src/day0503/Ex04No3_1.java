package day0503;

import java.util.Scanner;
public class Ex04No3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char star = '*';
        char empty= ' ';

        System.out.println("숫자를 입력하세요.");
        System.out.print("> ");
        int lowNumber=scanner.nextInt();

        for (int i = 1;i <= lowNumber;i++ ) {     //i= 별의 갯수
            String stars="";
            //공백을 담당하는 j for문
            for (int j =1; j <= lowNumber-i;j++){
                stars += " ";
            }
            // 별을 담당하는 j for 문

            for (int j = 1; j <= i;j++) {

                stars +="*";

            }
            System.out.println(stars);
        }


    }
}
