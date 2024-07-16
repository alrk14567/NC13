package day0507;
// 로또 번호 제작기 ver 1.1
// 사용자로부터 1~45 숫자 6개를 입력받아서
// 컴퓨터의 당첨 숫자와 비교하여 사용자의 숫자, 컴퓨터의 숫자, 맞춘 갯수를 출력하는 프로그램을 작성하시오
// 단, 사용자가 잘못된 숫자를 입력하면 올바른 숫자가 입력될때까지 입력 받으세요.

import java.util.Scanner;
import java.util.Random;

public class Ex05Lotto04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] userNumbers = new int[6];
        int[] computerNumbers = new int[6];

        //컴퓨터의 숫자
        for (int i = 0; i < computerNumbers.length; ) {
            int temp = random.nextInt(45) + 1;
            boolean isDuplicated = false;

            for (int j = 0; j < computerNumbers.length; j++) {
                if (computerNumbers[j]==temp) {
                    isDuplicated = true;
                }
            }
            if (!isDuplicated) {
                computerNumbers[i++] = temp;
            }
        }
        for (int i=0; i<computerNumbers.length-1;i++){
            if (computerNumbers[i]> computerNumbers[i+1]){
                int temp = computerNumbers[i];
                computerNumbers[i] = computerNumbers[i+1];
                computerNumbers[i+1] = temp;
                i=-1;
            }
        }

        // 유저가 고른 숫자
        for (int i = 0; i < userNumbers.length; ) {
            System.out.println("1~45 숫자를 입력하세요: ");
            System.out.print("> ");
            int temp = scanner.nextInt();
            while (temp <= 0 || temp > 45 ) {
                System.out.println("잘못 입력하셨습니다.");
                System.out.println("다시 입력해주세요");
                System.out.print("> ");
                temp = scanner.nextInt();
            }

            boolean isDuplicated = false;
            for (int j = 0; j < userNumbers.length; j++) {
                if (temp == userNumbers[j]) {
                    isDuplicated = true;
                    System.out.println("중복된 숫자입니다.");
                    /*System.out.println("다시 입력해주세요");
                    System.out.print("> ");*/
                }
            }
            if (!isDuplicated) {
                userNumbers[i++] = temp;
            }
        }
        for (int i=0; i<userNumbers.length-1;i++){
            if (userNumbers[i] > userNumbers[i+1]){
                int temp = userNumbers[i];
                userNumbers[i] = userNumbers[i+1];
                userNumbers[i+1] = temp;
                i=-1;
            }
        }
        // 맞춘 갯수 세기
        int count = 0;
        for (int i = 0; i < userNumbers.length; i++) {
            for (int j = 0; j < computerNumbers.length; j++) {
                if (userNumbers[i] == computerNumbers[j]) {
                    count++;
                }
            }
        }

        //출력
        System.out.printf("사용자가 맞춘 숫자의 갯수는 %2d개 입니다.\n", count);
        System.out.printf("사용자의 숫자는 %2d %2d %2d %2d %2d %2d 입니다.\n", userNumbers[0], userNumbers[1], userNumbers[2], userNumbers[3], userNumbers[4], userNumbers[5]);
        System.out.printf("컴퓨터의 숫자는 %2d %2d %2d %2d %2d %2d 입니다.\n", computerNumbers[0], computerNumbers[1], computerNumbers[2], computerNumbers[3], computerNumbers[4], computerNumbers[5]);


    }
}

