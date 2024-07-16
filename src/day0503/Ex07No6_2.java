package day0503;

import java.util.Scanner;

public class Ex07No6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("숫자를 입력하세요.");
        System.out.print("> ");
        int lowNumber = scanner.nextInt();
        int height = lowNumber;

        for (int i = lowNumber ; i >= 1 ; i--) {
            // 해당 줄의 출력 내용을 저장할 String 변수
            String stars ="";
            // 해당 줄의 공백의 갯수를 저장할 int 변수
            int spaceWidth = lowNumber - i;
            //해당 줄의 별의 갯수를 저장할 int 변수\
            int starWidth = 2 * i -1;

            // 공백을 담당하는 j for 문
            for (int j=1; j <= spaceWidth ; j++) {
                stars +=" ";
            }
            // 별을 담당하는 j for 문
            for (int j = 1; j <= starWidth ; j++) {
                stars +="*";
            }
            System.out.println(stars);
        }

    }
}
