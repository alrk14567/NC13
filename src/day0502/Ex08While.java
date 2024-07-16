package day0502;
// while 반복문
// while 반복문은 조건식이 true가 나오면 코드를 실행시키고 다시 조건식을 확인한다.
// while문의 구조
// while (조건식) {
//      조건식이 true이면 실행시킬 코드
// }

// 반복문을 사용하는 이유?
// 어떤 코드가 반복적으로 실행되야 하는 경우,
// 또는 특정 규칙에 따라서 코드를 반복시켜야 하는 경우 우리는 반복문을 사용한다.

import java.util.Scanner;
public class Ex08While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1~4까지 출력하는 코드를 작성하시오
        System.out.println("1입니다.");
        System.out.println("2입니다.");
        System.out.println("3입니다.");
        System.out.println("4입니다.");

        System.out.println("=============================================");

        int number =6;
        System.out.println(number++ +"입니다.");
        System.out.println(number++ +"입니다.");
        System.out.println(number++ +"입니다.");
        System.out.println(number++ +"입니다.");

        System.out.println("=============================================");

        number = 6;
        while (number <=9 ) {
            System.out.println(number++ + "입니다.");
        }

        // 단 while문은
        // 지정된 횟수 만큼 반복하는 용도보다는 특정 조건을 만족하는 동안 반복시키는 목적으로 주로 사용이 된다.

        // 사용자가 3이라고 입력할때까지 계속 입력을 받는 코드

        System.out.print("숫자: ");
        int useNumber = scanner.nextInt();

        while (useNumber != 3) {
            System.out.println("3과 다릅니다.");
            System.out.print("숫자: ");
            useNumber = scanner.nextInt();
        }

        System.out.println("3입니다.");


    }

}
