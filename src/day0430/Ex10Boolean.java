package day0430;
// 기본형 데이터타입 04. 논리형
// 논리형 데이터타입은 boolean 이라는 데이터타입만 존재하고
// boolean 데이터타입에는 딱 2가지 값만 저장 가능하다.
// true false

public class Ex10Boolean {
    public static void main(String[] args) {
        // boolean 변수 isTrue를 선언하고 true 값으로 초기화해라
        boolean isTrue = true;
        // isTrue의 현재 값을 출력해라 -> boolean true = 1 , boolean false = 0
        System.out.println("isTrue의 현재 값");
        System.out.println(isTrue);

        // boolean 변수 isFalse를 선언하고 false로 초기화해라
        boolean isFalse = false;

        // isFalse의 현재 값을 출력해라
        System.out.println("isFalse의 현재 값");
        System.out.println(isFalse);
    }
}
