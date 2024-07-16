package day0510;
// 전역 변수(Global Variable)
// 전역 변수란, 변수의 선언위치가 클래스의 최상단에 이루어져서 모든 메소드가 공통적으로 접근 가능한 변수를 전역 변수라고 한다.

// 전역 변수의 장점: 모든 메소드가 사용 가능하다.
// 전역 변수의 단점: 모든 메소드가 사용 가능하다.

// 따라서 현재 프로그래밍에서는 전역 변수의 사용을 매우 비추천한다.
// 전역 변수의 경우, 우리가 정확하게 값을 트래킹하기 어려워지기 때문이다.

// 그렇다면 전역 상수는...?? 매우 추천
// 상수는 한번 값이 저장되면 더이상 변경이 안되므로 다른 메소드가 사용한다고 해서 값을 변경할 수는 없다.
// 따라서, 여러 메소드가 공통적으로 사용해야할 상수일 경우 전역 상수를 사용하는 것이 추천된다.

public class Ex02Global {
    public static int number;
    public static final int SIZE = 4;

    public static void main(String[] args) {
        number = 20;
        System.out.println("number의 현재 값: " + number);
        increase();increase();increase();increase();increase();increase();increase();increase();increase();

        decrease();decrease();decrease();decrease();decrease();
        System.out.println("increase() 후 number: " + number);
    }

    public static void increase() {
        number++;
    }

    public static void decrease() {
        number--;
    }
}
