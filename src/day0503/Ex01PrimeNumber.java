package day0503;
// 1부터 100까지의 소수를 구하는 프로그램
// 소수란?
// 1과 자기 자신으로 나눠지는 수
// = 약수가 2개인 숫자
// 약수란?
// A를 B로 나눴을 때, 나눠 떨어지면 B는 A의 약수이다.
// = A를 B로 나눴을 때, 나머지가 0과 같으면 B는 A의 약수이다.

public class Ex01PrimeNumber {
    public static void main(String[] args) {
        // i for문에서 i는 소수인지 아닌지를 검사할 숫자가 된다.
        // 그렇다면 i의 시작값은? 1
        // i의 반복 조건식은?
        for (int i = 1; i <= 100; i++) {                                       // 내가 검사하고 싶은 수
            // i의 약수의 갯수를 저장할 int 변수
            int count = 0;

            // j for문의 j는 i의 약수인지 아닌지를 검사할 숫자가 된다.
            // 그렇다면 j의 시작값은? 1
            // j의 반복 조건식은?
            for (int j = 1; j <= i; j++) {                                  // 검사하고 싶은 수의 판단자
                if (i % j == 0) {
                    // j for문이 반복되는 동안 i 나누기 j의 나머지가 0과 같으면 j 는 i의 약수이므로 count를 1 증가시킨다. (약수의 갯수
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(i + "은 소수입니다.");

            }
        }

    }

}
