package day0502;
// 사용자로부터 키와 몸무게를 입력 받아서
// 저체중, 정상체중, 과체중, 비만을 출력하는 프로그램을 작성하시오
// BMI 공식: 몸무게(kg) / 키(M) / 키(M)
// BMI에 따른 비만도
// 18.5 미만: 저체중
// 18.5 ~ 23: 정상체중
// 23 ~ 25: 과체중

// 단, 기네스북에 따르면, 세상에서 가장 키가 컸던 사람은 2.72M였습니다.
// 세상에서 가장 몸무게가 무거웠던 사람은 565kg였습니다.
// 만약 사용자가 잘못된 값을 입력할 경우, 더이상의 진행없이 "잘못된 값이 입력되어 프로그램이 종료됩니다"

import java.util.Scanner;

public class Ex05Bmi {
    public static void main(String[] arfs) {
        Scanner scanner = new Scanner(System.in);

        //키를 입력받는다.
        System.out.print("키(cm): ");
        double high = scanner.nextDouble();
        final int UNIT = 100;

        if (high > 0 && high <= 272) {

            System.out.print("몸무게(kg): ");
            double weight = scanner.nextDouble();

            if (weight > 0 && weight <= 565) {
                double bmi = weight / (high / UNIT * high / UNIT);


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


            } else {
                System.out.println("잘못된 값이 입력되어 프로그램이 종료됩니다.");
            }

        } else {
            System.out.println("잘못된 값이 입력되어 프로그램이 종료됩니다.");
        }


    }
}
