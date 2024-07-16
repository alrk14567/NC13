package day0502;
// 값 검증하기
// 사용자가 입력한 값이 언제나 우리의 의도대로 올바른 값만 들어오지 않기 때문에 입력된 값에 대한 검증이 필요로 한다.

import java.util.Scanner;

public class Ex04Validation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수: ");
        int score = scanner.nextInt();

        System.out.println("--------------------------------------------------");
        System.out.println("검증을 안할 경우");
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
        System.out.println("==================================================");
        System.out.println("정확한 조건식으로 검증하기");
        System.out.println("==================================================");

        // 값 검증을 하는 첫번째 방법
        // 조건식을 정확하게 잡아주기
        // 이 방법은 조건이 연속적이지 않을 경우 효율적이다.
        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80 && score < 90) {
            System.out.println("B");
        } else if (score >= 70 && score < 80) {
            System.out.println("C");
        } else if (score >= 60 && score < 70) {
            System.out.println("D");
        } else if (score >= 0 && score < 60) {
            System.out.println("F");
        } else {
            System.out.println("올바르지 않은 점수입니다.");
        }

        // 두번째 방법
        // 먼저 입력된 값이 올바른지 체크하고 올바른 값이 입력됬을 때에만 코드를 진행시키는 방법
        // 이 방법은 올바른 값의 범위가 연속적일 경우 효율적이다.
        System.out.println("==================================================");
        System.out.println("입력값 먼저 검증하기");
        System.out.println("==================================================");

        if (score >= 0 && score <= 100) {
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

        } else {
            System.out.println("올바르지 않은 점수입니다.");
        }
    }


}
