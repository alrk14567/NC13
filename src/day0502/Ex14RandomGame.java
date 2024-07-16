package day0502;
// 랜덤 게임
// 컴퓨터가 1~100 사이의 랜덤한 숫자를 뽑으면 사용자가 그 숫자를 맞추는 게임
// 만약 사용자가 입력한 숫자가 컴퓨터의 숫자보다 크면? DOWN!!! 이 출력된다.
// 만약 사용자가 입력한 숫자가 컴퓨터의 숫자보다 작으면? UP!!!이 출력된다.
// 만약 사용자가 컴퓨터의 숫자를 맞추면 축하 메시지를 띄어주고
// 해당 게임에서 몇번 만에 맞췄는지를 보여준다.

// 심화: 이 게임에선 적게 입력해서 맞추는게 더 좋은 점수이므로
// 무한 반복문으로 해당 게임을 계속 즐길 수 있게 만들어보세요.
// 최고 점수(=최저 입력 횟수)를 갱신되게 만들어서
// 사용자가 최고 점수를 갱신하면 축하해주고 최고 점수를 갱신하게 프로그램을 작성 하시오

import java.util.Scanner;
import java.util.Random;

public class Ex14RandomGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int best = 0;

        while (true) {
            System.out.printf("1. 게임 하기\n2. 현재 최고기록 보기\n3. 게임 종료\n");
            System.out.print("> ");
            int selectNumber = scanner.nextInt();
            int tryNumber = 1;
            int computerNumber = random.nextInt(100) + 1;

            while (selectNumber == 1) {

                System.out.println("숫자를 입력하세요.");
                System.out.print("> ");
                int UserNumber = scanner.nextInt();


                if (UserNumber > computerNumber) {
                    System.out.println("DOWN!!!");
                    tryNumber++;

                } else if (UserNumber < computerNumber) {
                    System.out.println("UP!!!");
                    tryNumber++;
                } else if (UserNumber == computerNumber) {
                    System.out.println("Congratulations! You have won!");
                    System.out.println("Try number: " + tryNumber);

                    if (best == 0) {
                        System.out.println("이번 게임이 처음 플레이한 게임입니다!!!");
                        System.out.println("Your score is best!!!");
                        best = tryNumber;
                    } else {
                        System.out.printf("Current best score: [%03d]회\n", best);
                        if (best > tryNumber) {
                            System.out.println("Your score is best!!!");
                            best = tryNumber;
                        }
                    }

                    break;

                }


            }
            if (selectNumber == 2) {

                if (best == 0) {
                    System.out.println("Yet don't play game!");
                } else {
                    System.out.println("현재까지 최고기록은 아래와 같습니다.");
                    System.out.println("> "+best+ "회");

                }
            } else if (selectNumber == 3) {
                System.out.println("이용해 주셔서 감사합니다.");
                break;
            }


        }


    }
}
