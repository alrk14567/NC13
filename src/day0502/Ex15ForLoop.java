package day0502;
// for 반복문
// for 반복문은 while 반복문과는 다르게 특정 횟수 만큼 반복을 시킬 때 좀더 자주 사용된다.
// for 반복문은 다음과 같은 형식을 가진다.
// for (제어 변수의 선언과 초기화; 조건식; 코드 반복 후의 제어 변수의 변화식) {
//        반복할 코드
// }

public class Ex15ForLoop {
    public static void main(String[] args){

        for(int i = 1; i <= 4;i++){
            System.out.println("i의 현재 값: " + i);
        }
        System.out.println("-----------------------------------------");

        int start = 4;
        int end = 6;

        for(int i = start; i <= end; i++){
            for(int j = 1; j <= i; j++){
                System.out.printf("i의 현재 값: %d, j의 현재 값: %d\n", i, j);
            }
        }
    }
}
