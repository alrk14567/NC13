package day0502;
// 사용자로부터 키와 몸무게를 입력받아서 비만도를 출력하는 프로그램
// 단, 사용자가 잘못된 값을 입력할 경우
// 올바른 값이 입력될때까지 다시 입력을 받으시오.


import java.util.Scanner;

public class Ex10While3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받을때, 사용자로부터 어떤 값을 입력해야하는지를 알려주는 String 변수 message
        String message;
        // 사용자가 입력한 값을 임시로 보관할 double 변수 temp
        double temp;

        // 키 입력 받기
        message = "키를 cm 단위로 입력해주세요.";

        System.out.println(message);
        System.out.print("> ");

        temp = scanner.nextDouble();

        // 잘못된 입력인지 체크하고 잘못됐으면 다시 입력
        while (temp <= 0 || temp > 272) {
            System.out.println("잘못 입력하셨습니다.");
            System.out.println(message);
            System.out.print("> ");
            temp = scanner.nextDouble();
        }

        double height = temp/100;

        //몸무게 입력
        message = "몸무게를 kg 단위로 입력해주세요.";                    // 질문도 변수 설정이 가능하다.... 어떻게 생각하냐;;;

        System.out.println(message);
        System.out.print("> ");

        temp = scanner.nextDouble();

        // 잘못된 입력인지 체크하고 잘못됐으면 다시 입력
        while (temp <= 0 || temp > 565) {
            System.out.println("잘못 입력하셨습니다.");
            System.out.println(message);
            System.out.print("> ");
            temp = scanner.nextDouble();
        }

        double weight = temp;
        double bmi = weight / (height * height);
        /* 내가 한것
        System.out.print("키(cm): ");
        double height = scanner.nextDouble();

        while (height < 0 || height > 272) {                                    // 두번째 방법 !(height >= 0 && height <= 272)
            System.out.println("잘못된 값이 입력되었습니다. 다시한번 입력해 주세요.");

            System.out.print("키(cm): ");
            height = scanner.nextDouble();
        }

        System.out.print("몸무게(kg): ");
        double weight = scanner.nextDouble();

        while (weight < 0 || weight > 565) {
            System.out.println("잘못된 값이 입력되었습니다. 다시한번 입력해 주세요.");

            System.out.print("몸무게(kg): ");
            weight = scanner.nextDouble();

        }

        final int UNIT=100;
        double bmi = weight / (height/UNIT * height/UNIT);
         */

        if (bmi < 18.5) {
            System.out.println("저체중 입니다.");
        } else if (bmi < 23) {
            System.out.println("정상체중 입니다.");
        } else if (bmi < 25) {
            System.out.println("과체중 입니다.");
        } else {
            System.out.println("비만입니다.");
        }

        System.out.printf("현재 bmi 지수는 %6.2f 입니다.\n", bmi);


    }
}
