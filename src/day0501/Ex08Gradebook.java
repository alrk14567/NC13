package day0501;
// 사용자로부터
// 번호, 이름, 국어, 영어, 수학 점수 순으로 입력을 받아서
// 다음과같은 형식으로 출력되는 프로그램을 작성하시오
// 출력형식:
// 번호: 0#번 이름: ###
// 국어: 0##점 영어: 0##점 수학: 0##점
// 총점: 0##점 평균: 0##.##점

import java.util.Scanner;

public class Ex08Gradebook {
    public static void main(String[] args) {
        // 과목의 갯수를 저장할 상수
        final int SUBJECT_SIZE = 3;
        Scanner scanner = new Scanner(System.in);

        System.out.print("사용자의 번호를 입력해주세요: ");
        int myNumber = scanner.nextInt();

        System.out.print("사용자의 이름을 입력해주세요: ");
        String myName = scanner.nextLine();
        myName = scanner.nextLine();

        System.out.print("사용자의 국어 점수를 입력해주세요: ");
        int korean = scanner.nextInt();

        System.out.print("사용자의 영어 점수를 입력해주세요: ");
        int english = scanner.nextInt();

        System.out.print("사용자의 수학 점수를 입력해주세요: ");
        int math = scanner.nextInt();

        int sum = korean + english + math;
        double average = sum / (double)SUBJECT_SIZE;                       // -> 3.0을 매지컬 넘버라고 말함 이러한 숫자는 좋지 않다. 이러한 코딩을 경직된 코딩(Hard coding) 따라서 상수로 치환

        System.out.printf("번호: %02d번 이름: %3s\n", myNumber, myName);
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math);
        System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);
        /*//  1. 번호를 입력 받는다.
        System.out.print("번호: ");
        int bunho = scanner.nextInt();

         // 2. 이름을 입력 받는다.
        System.out.print("이름: ");
        scanner.nextLine();
        String name = scanner.nextLine();

         // 3.국어점수를 입력 받는다.
         System.out.print("국어: ");
         int kor = scanner.nextInt();

         // 4.영어점수를 입력 받는다.
         System.out.print("영어: ");
         int eng = scanner.nextInt();

         // 5. 수학점수를 입력 받는다.
         System.out.print("수학: ");
         int mat = scanner.nextInt();

         // 6. 총점을 계산한다.
         int sum1 = kor + eng + mat;

         // 7. 평균을 계산한다.
         double avg = sum1/3.0;   // -> 3.0을 매지컬 넘버라고 말함 이러한 숫자는 좋지 않다. 이러한 코딩을 경직된 코딩(Hard coding)

         // 8. 번호, 이름을 출력한다.
         System.out.printf("번호: %02d번 이름: %3s\n",bunho ,name);
         // 9. 국영수 점수를 출력한다.
         System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", kor, eng, mat);
         // 10. 총점 평균을 출력한다.
         System.out.printf("총점: %03d점 평균: %06.2f점\n", sum1, avg);

         */


    }
}
