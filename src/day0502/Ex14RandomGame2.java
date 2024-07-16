package day0502;

import java.util.Scanner;
import java.util.Random;

public class Ex14RandomGame2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int bestScore = 0;
        while (true) {
            System.out.println("1. 플레이 2. 현재 최고 기록 보기 3. 종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();

            if (userChoice == 1) {                                 // 게임 플레이 코딩
                // 게임 시작
                // 컴퓨터 숫자 결정
                int computerNumber = random.nextInt(100) + 1;
                // 현재 점수를 저장할 변수
                int currentScore = 0;

                // 사용자가 입력한 값을 저장할 변수
                int userNumber = 0;

                while (userNumber != computerNumber) {
                    System.out.println("숫자를 입력해주세요.");
                    System.out.print("> ");
                    userNumber = scanner.nextInt();
                    currentScore++;

                    if (userNumber > computerNumber) {
                        System.out.println("!!!DOWN!!!");
                    } else if (userNumber < computerNumber) {
                        System.out.println("!!!UP!!!");
                    }
                }

                System.out.println("짝짝짝 정답입니다 짝짝짝");
                System.out.printf("이번 게임의 사용자 점수: [%03d]", currentScore);

                //bestScore 갱신 코드
                if (bestScore == 0 ) {
                    System.out.println("이번 게임이 처음 플레이한 게임입니다!!!");
                    System.out.println("당신의 기록이 최고점수가 됩니다.");
                    bestScore = currentScore;
                } else {
                    System.out.printf("현재 최고 기록: [%03d]회\n", bestScore);
                    if (bestScore > currentScore) {
                        System.out.println("!!! 당신이 새로운 최고 기록입니다 !!!");
                        bestScore = currentScore;
                    }
                }


            } else if (userChoice == 2) {                          // 최고 기록 보는 코딩
                // 현재 기록이 0일 경우, 플리에 기록이 없는 것이므로 경고메시지만 출력하고 그 외에만 현재 최고 기록을 보여주는 코드를 작성한다.
                if (bestScore == 0) {
                    System.out.println("아직 플레이 기록이 존재하지 않습니다.");
                } else {
                    System.out.printf("현재 최고 기록: [%03d]회\n", bestScore);
                }

            } else if (userChoice == 3) {                          // 종료 코딩 완료
                System.out.println("플레이해주셔서 감사합니다.");
                break;
            }
        }

    }
}
