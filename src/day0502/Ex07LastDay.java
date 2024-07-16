package day0502;
// 사용자로부터 월을 입력 받으면
// 해당 월의 마지막 날이 몇일인지 보여주는 프로그램

import java.util.Scanner;

public class Ex07LastDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("월: ");
        int month = scanner.nextInt();

        switch (month) {
            case 2:
                System.out.println("28일");
                break;
            case 4,6,9,11:
                System.out.println("30일");
                break;
            case 1, 3, 5, 7, 8, 10, 12:                 // case 1: case 3: 쭈주죽 해도 되고 쉽표로도 가능!
                System.out.println("31일");
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
                break;

        }
    }
}
