package day0507;

import java.util.Scanner;

public class Ex06GradeBook_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 학생들의 정보를 저장할 배열들
        // 번호 배열
        int[] idArray = new int[5];
        // 이름 배열
        String[] nameArray = new String[5];
        // 국어 점수 배열
        int[] koreanArray = new int[5];
        // 영어 점수 배열
        int[] englishArray = new int[5];
        // 수학 점수 배열
        int[] mathArray = new int[5];
        // 다음 입력할 인덱스를 저장할 int 변수
        int idx = 0;
        while (true) {
            System.out.println("1. 입력 2. 출력 3. 종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();

            if (userChoice == 1) {
                // 입력 코드 구현
                if (idx < idArray.length) {
                    // 아직 학생을 더 입력할 수 있음
                    System.out.print("번호: ");
                    idArray[idx] = scanner.nextInt();

                    // 2. 이름을 입력 받는다.
                    System.out.print("이름: ");
                    scanner.nextLine();
                    nameArray[idx] = scanner.nextLine();

                    // 3.국어점수를 입력 받는다.
                    System.out.print("국어: ");
                    koreanArray[idx] = scanner.nextInt();

                    // 4.영어점수를 입력 받는다.
                    System.out.print("영어: ");
                    englishArray[idx] = scanner.nextInt();

                    // 5. 수학점수를 입력 받는다.
                    System.out.print("수학: ");
                    mathArray[idx] = scanner.nextInt();

                   idx++;
                } else {
                    // 더이상 학생을 입력할 수 없음
                    System.out.println("더이상 학생을 입력할 수 없습니다.");
                }

            } else if (userChoice == 2) {
                // 출력 코드 구현
                if (idx == 0) {
                    // idx의 값이 0이다.
                    // -> idx++이 실행된 적이 없다
                    // -> idx++은 학생 정보 입력을 해야지만 실행된다.
                    // -> 따라서 아직 입력된 학생이 존재하지 않는다.
                    System.out.println("아직 입력된 정보가 존재하지 않습니다.");

                } else {
                    for (int i=0; i<idx; i++) {
                        // i번째 학생의 총점 계산
                        int sum = koreanArray[i] + englishArray[i] + mathArray[i];
                        // 평균 계산
                        double average = (double) sum / 3;
                        System.out.printf("%d번. %s \n", idArray[i], nameArray[i]);
                        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", koreanArray[i], englishArray[i], mathArray[i]);
                        System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);
                    }
                }
            } else if (userChoice == 3) {
                // 종료 코드 구현
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }


    }
}
