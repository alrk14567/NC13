package day0502;
// 사용자로부터 점수를 입력 받아서 A ~ F 가 출력되는 프로그램.
// 단 사용자가 올바르지 않은 점수를 입력하면 올바른 점수가 입력될때까지 다시 입력을 받으시오.


import java.util.Scanner;

public class Ex09While2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수: ");
        int score = scanner.nextInt();

        while (score < 0 || score > 100) {                                   // 두번째 방법?? !(score >=0 && score <= 100) 와.. 생각도 못했다....
            System.out.println("올바른 점수가 아닙니다. 다시 입력해주세요.");

            System.out.print("점수: ");
            score = scanner.nextInt();
        }

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }


    }
}
