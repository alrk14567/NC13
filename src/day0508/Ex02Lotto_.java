package day0508;

import java.util.Random;
import java.util.Scanner;

public class Ex02Lotto_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("몇게임 하시겠습니까? ");
        System.out.print("> ");
        int gameNumber = scanner.nextInt();
        int[] computerNumbers = new int[6];
        int[][] userNumbers = new int[gameNumber][6];
        int[] counts = new int[6];

        // 컴퓨터 로또 넘버 받기

        for (int i = 0; i < computerNumbers.length; ) {
            int temp = random.nextInt(45) + 1;

            boolean isDulplicated = true;

            for (int j = 0; j < computerNumbers.length; j++) {
                if (computerNumbers[j] == temp) {
                    isDulplicated = false;

                }

            }
            if (isDulplicated) {
                computerNumbers[i++] = temp;
            }

        }
        // i번째 컴퓨터 로또 정렬
        for (int i = 0; i < computerNumbers.length - 1; i++) {
            if (computerNumbers[i] > computerNumbers[i + 1]) {
                int temp = computerNumbers[i];
                computerNumbers[i] = computerNumbers[i + 1];
                computerNumbers[i + 1] = temp;
                i = -1;
            }
        }
        for (int i = 0; i < gameNumber; i++) {



            // i번째 게임 수동 자동 메뉴
            while (true) {
                System.out.println("1. 수동 2. 자동");
                System.out.print("> ");
                int selectNumber = scanner.nextInt();

                if (selectNumber == 1) {
                    //수동 받기
                    for (int j = 0; j < userNumbers[i].length; ) {
                        System.out.printf("%d번째 숫자를 입력하세요.\n", j + 1);
                        System.out.print("> ");
                        int temp = scanner.nextInt();

                        boolean isDulplicated = true;

                        while (temp <= 0 || temp > 45) {
                            System.out.println("잘못 입력하셨습니다.");
                            System.out.println("다시 입력해주세요");
                            System.out.print("> ");
                            temp = scanner.nextInt();
                        }
                        for (int k = 0; k < userNumbers[i].length; k++) {
                            if (temp == userNumbers[i][k]) {
                                isDulplicated = false;
                                System.out.println("중복된 숫자입니다.");
                            }
                        }
                        if (isDulplicated) {
                            userNumbers[i][j++] = temp;
                        }
                    }
                    // i번째 유저 수동 로또 정렬
                    for (int j = 0; j < userNumbers[i].length - 1; j++) {
                        if (userNumbers[i][j] > userNumbers[i][j + 1]) {
                            int temp = userNumbers[i][j];
                            userNumbers[i][j] = userNumbers[i][j + 1];
                            userNumbers[i][j + 1] = temp;
                            j = -1;
                        }
                    }
                    break;
                } else if (selectNumber == 2) {
                    // 자동 받기
                    for (int j = 0; j < userNumbers[i].length; ) {
                        int temp = random.nextInt(45) + 1;

                        boolean isDulplicated = true;

                        for (int k = 0; k < j;k++ ) {
                            if (userNumbers[i][k] == temp) {
                                isDulplicated = false;

                            }

                        }
                        if (isDulplicated) {
                            userNumbers[i][j++] = temp;
                        }

                    }
                    // i번째 유저 자동 로또 정렬
                    for (int j = 0; j < userNumbers[i].length - 1; j++) {
                        if (userNumbers[i][j] > userNumbers[i][j + 1]) {
                            int temp = userNumbers[i][j];
                            userNumbers[i][j] = userNumbers[i][j + 1];
                            userNumbers[i][j + 1] = temp;
                            j = -1;
                        }
                    }
                    break;
                } else {
                    System.out.println("잘못입력하셨습니다.");
                }

            }
        }
        //몇개 맞췃는지 세기
        for (int i = 0; i < gameNumber; i++) {
            for (int j = 0; j < computerNumbers.length; j++) {
                for (int k = 0; k < computerNumbers.length; k++) {
                    if (userNumbers[i][j] == computerNumbers[k]) {
                        counts[i]++;
                    }
                }
            }
        }
        // 출력하기
        for (int i = 0; i < gameNumber; i++) {
            System.out.printf("%d번째 게임 맞춘 갯수: %d\n", i+1, counts[i]);
            System.out.printf("%d번째 컴퓨터 숫자\n", i+1);
            for (int j = 0; j < computerNumbers.length; j++) {

                System.out.print(" "+computerNumbers[j]);
                if (j==computerNumbers.length-1) {
                    System.out.println();
                }
            }
            System.out.printf("%d번째 유저 숫자\n", i+1);
            for (int j = 0; j < userNumbers[i].length; j++) {

                System.out.print(" "+userNumbers[i][j]);
                if (j==userNumbers[i].length-1) {
                    System.out.println();
                }
            }


        }

    }
}
