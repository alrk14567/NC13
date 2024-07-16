package day0508;

import java.util.Random;
import java.util.Scanner;

public class Ex02Lotto_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 1. 컴퓨터 숫자 정하기
        // 컴퓨터 숫자를 저장할 배열
        int[] computerNumbers = new int[6];
        // computerNumbers에 중복되지 않는 숫자 6개 저장
        for (int i = 0; i < computerNumbers.length; ) {
            int randomNumber = random.nextInt(45) + 1;
            boolean isDuplicated = false;
            for (int j = 0; j < i; j++) {
                if (randomNumber == computerNumbers[j]) {
                    isDuplicated = true;
                }
            }
            if (!isDuplicated) {
                computerNumbers[i] = randomNumber;
                i++;
            }
        }

        // computerNumbers 정렬
        for (int i = 0; i < computerNumbers.length - 1; i++) {
            if (computerNumbers[i] > computerNumbers[i + 1]) {
                int temp = computerNumbers[i];
                computerNumbers[i] = computerNumbers[i + 1];
                computerNumbers[i + 1] = temp;
                i = -1;
            }
        }

        // 사용자로부터 입력을 받아서 게임 수, 수동/자동 처리하기
        System.out.println("몇 게임하시겠습니까?");
        System.out.print("> ");
        int gameSize = scanner.nextInt();
        // 사용자가 입력한 수를 토대로 배열 생성
        int[][] userNumbers = new int[gameSize][6];

        // 각 게임에 대한 수동/자동 처리
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.println("===============================================");
            System.out.println((i + 1) + " 번째 게임");
            System.out.println("===============================================");
            // 자동 /수동 입력받기
            System.out.println("1. 자동 2. 수동");
            System.out.print("> ");
            int userChoice = scanner.nextInt();

            for (int j = 0; j < userNumbers[i].length; ) {                      //합쳐서 하는건 상상도 못했는데...
                int temp;

                if (userChoice == 2) {
                    System.out.println((j + 1) + " 번째 숫자");
                    System.out.println("1~45 사이의 숫자를 입력해주세요.");
                    System.out.print("> ");
                    temp = scanner.nextInt();
                } else {
                    temp = random.nextInt(45) + 1;
                }

                boolean isValid = true;

                if (!(temp >= 1 && temp <= 45)) {
                    isValid = false;
                }
                for (int k = 0; k < j; k++) {
                    if (temp == userNumbers[i][k]) {
                        isValid = false;
                    }
                }

                if (isValid) {
                    userNumbers[i][j] = temp;
                    j++;
                } else if (userChoice == 2) {
                    System.out.println("잘못 입력하셨습니다.");
                }
            }
            System.out.println("-----------------------------------------------\n");
        }

        for (int i = 0; i < userNumbers.length; i++) {
            // i번째 게임 정렬
            for (int j = 0; j < userNumbers[i].length - 1; j++) {
                if (userNumbers[i][j] > userNumbers[i][j + 1]) {
                    int temp = userNumbers[i][j];
                    userNumbers[i][j] = userNumbers[i][j + 1];
                    userNumbers[i][j + 1] = temp;
                    j = -1;
                }
            }
        }
        // 컴퓨터 숫자 출력
        System.out.print("컴퓨터 숫자: [");
        for (int i = 0; i < computerNumbers.length; i++) {
            System.out.printf("%d", computerNumbers[i]);
            if (i != computerNumbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        //사용자의 숫자와 결과를 출력한다.
        System.out.println("결과");
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.println("=======================");
            System.out.println((i + 1) + " 번째 게임");
            System.out.println("=======================");
            //맞은 갯수를 저장할 int변수
            int count = 0;

            System.out.print("사용자의 숫자:[");
            for (int j = 0; j < userNumbers[i].length; j++) {
                for (int k = 0; k < computerNumbers.length; k++) {
                    if (userNumbers[i][j] == computerNumbers[k]) {
                        count++;
                    }
                }
                System.out.printf("%d", userNumbers[i][j]);
                if (j != userNumbers[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("] - 맞은 갯수: " + count);
        }

    }
}
