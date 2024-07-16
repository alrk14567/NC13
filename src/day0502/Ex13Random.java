package day0502;
// Random 클래스
// 만약 우리가 래덤한 숫자가 필요할 때에는
// Random 클래스 변수를 사용하여 랜덤 숫자를 뽑아내게 된다.
// Scanner와 마찬가지로 외부에서 import 해야한다.

import java.util.Random;

public class Ex13Random {
    public static void main(String[] args) {
        // 랜덤 클래스 변수 선언 및 초기화
        Random random = new Random();

        // 랜덤한 실수 뽑기
        // 랜덤한 실수는 0~1 사이의 무수한 실수 중 한개가 나오게 된다.
        double d = random.nextDouble();                 // 0~1 사이의 값??ㅌ
        System.out.println("랜덤 실수: " + d);

        // 랜덤한 정수 뽑기
        // 이 때에는 int 범위 안에서 랜덤한 정수가 나온다.
        int i = random.nextInt();
        System.out.println("랜덤 정수: " + i);
        // 특정 범위 안에서 랜덤한 정수 뽑기
        // nextInt()의 괄호 안에 숫자를 넣으면 0~숫자-1 까지의 랜덤한 숫자가 나오게 된다.
        i = random.nextInt(100)+1;                 // 0 ~ 9 까지 10개의 숫자중 랜덤한 숫자 1개
        System.out.println("랜덤 숫자: " + i);
    }
}
