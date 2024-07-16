package day0430;
// 변수(Variable)
// 변수란, 우리가 값을 여러번 덮어씌울 수 있는 공간을
// 변수라고 한다.
// 변수를 사용하기 위해서는
// 선언과 초기화가 필요하다.
// 변수의 선언 방법
// 데이터타입 변수이름;
// 변수의 초기화방법
// 변수이름 = 값;

public class Ex05Variable {
    public static void main(String[] args){
        //int 타입의 변수 myNumber를 선언해보자
        int myNumber;
        //myNumber는 현재 선언만 된 상태이므로
        // 초기화를 하기 전 까지는 사용을 할 수 없다.

        //myNumber의 현재값을 출력하시오
        //System.out.println(myNumber); -> myNumber에 아무런 값이 없으므로 에러 발생

        //myNumber에 5를 저장해보자
        // 초기화, 할당, 저장 모두 프로그래밍에서는 같은 의미가 된다.
        myNumber = 5;
        // myNumber에 현재 저장된 값을 출력해보자
        System.out.println("myNumber에 현재 저장된 값");
        System.out.println(myNumber);

        //myNumber 에 10을 저장해보자
        myNumber = 10;

        //myNumber에 현재 저장된 값을 출력해보자
        System.out.println("myNumber에 현재 저장된 값");
        System.out.println(myNumber);

    }
}
