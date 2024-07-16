package day0501;

// 비교연산자
// 비교연산자는 왼쪽과 오른쪽의 값을 비교를 하되
// 우리가 생각하는 것처럼 자동으로 어디가 더 큰지를 반환하는 것이 아니라
// 컴퓨터에게
// 왼쪽의 값이 오른쪽의 값보다 크니?
// 의 형식으로 질문을 하여
// 예/아니오 -> true/false 의 결과값을 받는 형식이 된다.

// <, <=, >, >=, ==, !=

public class Ex03Operator {
    public static void main(String[] args) {
        // int 타입의 변수 myNumber1, myNumber2를 선언하고
        // 각각 4와 5로 초기화하자
        int myNumber1 = 4, myNumber2 = 5;
        System.out.println("myNumber1 < myNumber2= " + (myNumber1 < myNumber2));
        System.out.println("myNumber1 < 3= " + (myNumber1 < 3));
        System.out.println("myNumber1 < 4= " + (myNumber1 < 4));

        System.out.println("myNumber1 <= myNumber2= " + (myNumber1 <= myNumber2));
        System.out.println("myNumber1 <= 3= " + (myNumber1 <= 3));
        System.out.println("myNumber1 <= 4= " + (myNumber1 <= 4));

        System.out.println("myNumber1 == myNumber2= " + (myNumber1 == myNumber2));
        System.out.println("myNumber1 != myNumber2= " + (myNumber1 != myNumber2));

        // 단 비교연산자의 경우, 기본형 데이터타입의 값에 대해서만
        // 정확한 결과가 나오고, 참조형 데이터타입일 경우,
        // 부정확한 결과가 나올수도 있다.

        // 스트링 변수를 만들어보는데, 초기화 방법은 각각 다른방법으로 해보자
        String string1 ="abc";                          // 힙에 저장되고 스택에 위치 주소가 저장
        String string2 = new String("abc");      // new가 붙어 새로운 공간을 확보하게 되고 abc를 새로운 힙 공간에 저장되어 스택에 다른 위치 주소가 저장된다.
        String string3 = string1;                       // 얘는 힙에 값이 할당되지 않는다. 따라서 스택값만 있는 상태

        // 3개의 String 변수의 값이 같은지 확인해보자
        System.out.println("string1: ["+string1+"]");
        System.out.println("string2: ["+string2+"]");
        System.out.println("string3: ["+string3+"]");

        System.out.println("string1 == string2= " + (string1 == string2)); // 스택값 즉 주소 값이 다르다. 펄스
        System.out.println("string1 == string3= " + (string1 == string3)); // 스택값이 같기 때문에 트루
        System.out.println("string2 == string3= " + (string2 == string3)); // 스택값이 다르기 때문에 펄스

        // JRE에는 크게 3가지 메모리 영역이 있다.
        // 1. Stack
        //    변수의 값이 저장되는 공간
        // 2. Heap
        //    참조형 값이 저장되는 공간
        // 3. Method
        //    현재 실행시킬 코드가 줄 단위로 저장되어 실행되는 공간

        // 참조형 변수와 기본형 변수의 차이
        // 기본형 변수: Stack 영역에, 현재 값을 2진법으로 변환한 값이 저장된다.
        // 참조형 변수: Heap 영역에, 현재 값이 저장이 되고, Stack 영역에는
        //            해당 값이 저장된 주소값이 저장된다.

        // 기본적으로 연산자는 힙 영역에 아예 들어가지 않고
        // 스택 영역에 값을 기준으로 연산을 한다.
        // 따라서, 비교 연산자로 스트링의 값을 비교할 시에는
        // 주소값 비교를 하기 때문에,
        // 부정확한 결과가 나올 수 있게 된다.

        // 따라서, 참조형 데이터타입 중, 클래스형 혹은 인터페이스형의
        // 값을 비교할 때에는
        // 우리가 == 또는 != 이 아닌
        // equals() 를 통하여 비교를 해야 한다.
        // equals는 다음과 같은 방법으로 사용한다.
        // 공간(=변수이름 or 힙안에 있는 저장 값).equals(비교대상)

        // equals를 통해서 비교를 해보자
        System.out.println("string1.equals(string2): "+ string1.equals(string2));
        System.out.println("string1.equals(string3): "+ string1.equals(string3));
        System.out.println("string2.equals(string3): "+ string2.equals(string3));
        System.out.println("abc.equals(string2): "+ "abc".equals(string2));


    }

}
