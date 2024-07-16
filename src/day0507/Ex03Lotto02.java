package day0507;
// 로또 번호 제작기 ver 0.5
// 중복되지 않는 랜덤한 숫자 6개를 뽑아서 배열에 저장하는 프로그램

// 중복이란?
// 같은 값이 여러번 나오는 것
// = 어떠한 숫자가 다른 인덱스에서 나오는 경우

import java.util.Random;

public class Ex03Lotto02 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[6];

        // for문의 경우, 내부의 초기화식이나, 변경식 같은 것을 공백을 넣어줄 수도 있다.
        // 단, 이때에는 무한루프가 되지 않도록 break 또는 변화식을 반드시 포함시켜 주는 것이 중요하다.

        // i for문을 만들되, 변화식은 비어있는 i for문을 만들어주자
        for (int i = 0; i < numbers.length; ) {
            // 랜덤한 숫자를 뽑아서 int 변수 temp에 저장해 주자
            int temp = random.nextInt(45) + 1;

            // 중복을 찾을때만 true가 저장될 boolean 변수
            boolean isDuplicated = false;                               // 활용을 잘하자
            // j for문을 만들어서, numbers의 모든 요소와 //temp를 비교해보자

            for (int j = 0; j < numbers.length; j++) {
                // 만약, number[j]가 temp와 같으면
                // isDuplicated의 값을 true로 변경해주자
                if (numbers[j] == temp) {
                    isDuplicated = true;
                }
            }

            if (!isDuplicated) {                            // isDuplicated가 false 이므로 !로 true로 만들어준다.
                // temp의 값이 중복이 아니므로
                // number[i]에 값을 저장하고 i를 1 증가시킨다.
                numbers[i++] = temp;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("numbers[%d]: %d\n", i, numbers[i]);
        }


    }
}
