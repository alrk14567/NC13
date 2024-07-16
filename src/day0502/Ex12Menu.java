package day0502;
// 무한 반복문을 사용한 메뉴 프로그램

import java.util.Scanner;

public class Ex12Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("1. 1번 기능 2. 2번기능 3. 3번 기능 4. 종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();
            if(userChoice == 1) {
                // 1번 기능 코드 구현
            } else if(userChoice == 2) {
                // 2번 기능 코드 구현
            } else if(userChoice == 3) {
                // 3번 기능 코드 구현
            } else if(userChoice == 4) {
                System.out.println("사용해주셔서 감사합니다!!!");
                break;
            }
        }

    }
}
