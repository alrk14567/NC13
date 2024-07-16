package day0501;
// 연산자(Operator)
// 연산자란 수학적 기호에 프로그래밍 기능을 정의한것이다.
// 연산자에는
// 산술연산자, 증감연산자, 할당연산자, 논리연산자, 비트연산자
// 5가지가 있지만 우리는 그 중에서 비트 연산자는 배우지 않는다.
// 비트 연산자 -> 이진법으로 계산하기 때문에 어려움 잘 안씀

// 산술연산자
// 산술연산자는 2개의 값에 대한 기본적인 산수 계산을 하는 연산자이다.
// + - * / %(나머지값 산출) 5가지가 있다.

public class Ex01Operator {
    public static void main(String[] args) {
        // 1. 정수끼리의 산술 연산
        // int 변수 myNumber1, myNumber2를 선언하고
        // 각각 5 와 3 으로 초기화해보자
        int myNumber1 = 5, myNumber2 = 3;
        System.out.println("myNumber1 + myNumber2 = " + (myNumber1 + myNumber2));
        System.out.println("myNumber1 - myNumber2 = " + (myNumber1 - myNumber2));
        System.out.println("myNumber1 * myNumber2 = " + (myNumber1 * myNumber2));
        System.out.println("myNumber1 / myNumber2 = " + (myNumber1 / myNumber2)); // 나눌때 몫이 출력됨(정수라서?) -> double 이라면 소수점까지 표기
        System.out.println("myNumber1 % myNumber2 = " + (myNumber1 % myNumber2)); // 나눌때 나머지가 출력됨

        // 실수와 실수의 산술연산
        // double 변수 myDouble1, myDouble2를 선언하고 각각 5.0과 3.0으로 초기화
        double myDouble1 = 5.0, myDouble2 = 3.0;
        System.out.println("myDouble1 + myDouble2 = " + (myDouble1 + myDouble2));
        System.out.println("myDouble1 - myDouble2 = " + (myDouble1 - myDouble2));
        System.out.println("myDouble1 * myDouble2 = " + (myDouble1 * myDouble2));
        System.out.println("myDouble1 / myDouble2 = " + (myDouble1 / myDouble2)); // 실수 값이기 때문에 소수점까지 계산 실제 나누기 연산으로 계산된다.
        System.out.println("myDouble1 % myDouble2 = " + (myDouble1 % myDouble2));

        // 정수와 실수의 산술연산
        // 이때에는 정수가 암시적 형변환을 통해 실수로 변환이 되어
        // 실수와 실수의 산술연산이 일어나게 된다.

        // 산술연산에서 주의할점
        // 다음 코드를 직접 해보자
        // 국영수 점수를 저장할 int 변수 3개를 만들고 각각 90, 90, 91을 ㅈ장하자
        int korean = 90, english= 90, math = 91;
        // 총점을 계산해보자
        int sum = korean + english + math;
        // 평균을 계산해보자. 단 평균은 실수로 나와야 한다.
        double average = (double)sum / 3; // 인트 인트 계산이기 때문에 계한한 정수 값이 평균에 할당되어 90.0이 출력 -> sum 또는 3 을 실수로 바꿔주어야 제대로 나옴
        //평균을 출력해보자
        System.out.println("평균점수: " + average +"점");

        // String
        // String은 여러 글자를 다룰 수 있는 클래스형 데이터타입이다.
        // String 글래스의 값은 "" 로 감싸서 나타낸다.
        // String 클래스의 값은 + 연산이 가능하다.
        // String 클래스의 값의 + 연산은 앞에 값과 뒤의 값을 이어서 하나의 스트링으로
        // 만들어주는 연산이 된다.
        // 만약, 다른 데이터타입의 값과 String클래스의 값이 + 연산이 될 경우,
        // 다른 데이터타입을 String 클래스 값으로 변환하여 이어붙이게 된다.

        // 따라서 여러분들이 코딩을 하실 때 다음과 같은 상황을 주의하셔야 합니다.
        System.out.println("myNumber1 + myNumber2 =" + myNumber1 + myNumber2);

        // 다음 중 값이 다르게 나오는 것은
        System.out.println("1" + 23);
        System.out.println("123");
        System.out.println(100+23);
        System.out.println("100" + 23);


    }
}
