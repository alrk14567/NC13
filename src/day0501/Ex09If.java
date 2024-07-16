package day0501;
// 제어문(Control Statement)
// 제어문이란 특정 코드들의 실행 여부 혹은 반복 여부를 제어하는 특수한 코드이다.

// 제어문에는 크게 조건문과 반복문 2가지가 있다.
// 조건문: 조건이 맞으면 코드들을 실행
//        조건문에는 if문과 swirch문이 있다.
// 반복문: 조건이 맞는동안 코드들을 실행
//        반복문에는 for문과 while문이 있다.

// 코드 블락
// 코드 블락은 한개의 { } 안에 있는 모든 코드를 한개의 코드 블락이라고 한다.
// 코드 블락 안에는 다른 코드 블락이 들어갈 수 있다.
// 코드 블락이 중요한 이유는?
// 1. 변수 혹은 상수의 유효 범위와 연결되어있다.
// 2. 제어문에서 실행 혹은 반복시킬 범위의 코드를 묶는다.

// 변수, 상수의 유효 점위 (Life Cycle)
// 변수나 상수는 해당 변수/상수가 선언된 이후부터 해당 변수 상수가 속한 코드 블락이 종료될땎지가 유효 범위가 된다.
// 해당 변수/상수가 유효한 동안에는 동일한 이름의 변수/상수를 또다시 선언할 수 없다.
// 당연하지만, 해당 변수/상수가 유효한 범위의 밖에서는 더이상 해당 변수/상수를 호출할 수 없다.

// if문
// if문은 특정 조건식(=true/false가 나올 수 있는 코드)의 결과값에 따라서 해당 if문의 코드 블락을 실행시킬지 말지를 결정하는 조건문이다.
// if문은 다음과 같은 양식을 가진다.

// if(조건식) {
//    조건식이 true일때 실행시킬 코드
// }
public class Ex09If {
    public static void main(String[] args) {
        // 조건식 check에서 사용할 int 변수를 만들고 3으로 초기화한다.
        int number = 3;
        // 만약 number가 0보다 크면
        // 화면에 "0보다 큽니다." 를 출력하게 if문을 작성한다면?
        if (number > 0 ) {
            int number2 = 30;                           // 이 변수 선언은 if 코드블락에서만 유효한 변수이다.
            System.out.println("0보다 큽니다.");
            System.out.println("number2: " + number2);
        }
        int number2= 20;                                // 별개의 공간에 저장된다.
        System.out.println("number2: " + number2);


        System.out.println("프로그램 종료");

    }
}
