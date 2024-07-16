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
public class Ex14RandomGame1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //사용자가 입력한 숫자를 저장할 변수
        int userInput =0 ;                                              // 선언만 해도 될듯?

        // 컴퓨터의 숫자
        int computerNumber = random.nextInt(100) + 1;

        // 사용자가 입력한 횟수
        int score = 0;

        while(userInput != computerNumber) {
            System.out.print("숫자: ");
            userInput = scanner.nextInt();
            score++;

            if(userInput > computerNumber) {
                System.out.println("!!!DOWN!!!");
            } else if(userInput < computerNumber) {
                System.out.println("!!!UP!!!");
            }
        }

        System.out.println("짝짝짝 맞추셨습니다.");
        System.out.printf("맞춘 횟수: [%03d]회\n", score);

    }
}
