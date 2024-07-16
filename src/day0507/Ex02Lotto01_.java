package day0507;
// 로또 번호 제작기 ver 0.1
// 1~45까지 랜덤한 숫자 6개를 배열에 저장하고
// 출력하는 프로그램을 작성하시오
// 10시 40분까지

import java.util.Random;

public class Ex02Lotto01_ {
    public static void main(String[] args) {
        // 랜덤한 숫자를 봅을 때 사용할 랜덤 변수
        Random random = new Random();
        // 랜덤 숫자를 저장할 int[]
        int length = 6;
        int[] intArray = new int[length];

        // for문을 사용하여, 랜덤한 숫자 1~45를 배열에 6개 저장한다.
        for (int i = 0; i < intArray.length;i++) {
            intArray[i] = random.nextInt(45)+1;         //랜덤 함수에 45라고 쓰면 0~44까지 범위의 숫자임 기억하자
            System.out.printf("numbers[%d]: %d\n", i, intArray[i]);
        }


    }
}
