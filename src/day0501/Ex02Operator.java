package day0501;
// 할당연산자
// 오른쪽 값을 산술 연산한 값을 왼쪽 공간에 저장할 때 사용이 된다.
// =, +=, -=, *=, /=, %=

// 증감연산자
// 해당 연산자가 달린 공간의 값을 1씩 증가시키거나 감소시킨다.
// ++, --
public class Ex02Operator {
    public static void main(String[] args) {
        // int 변수 myNumber를 선언
        int myNumber;
        // 1. =
        // myNumber 에 4를 저장
        myNumber = 4;
        // myNumber의 현재값을 출력
        System.out.println("myNumber = " + myNumber);

        // 2. +=
        // 위의 연산자를 풀어서 쓰면?
        // myNumber = myNumber +3;
        // 과 같은 형태가 된다.
        myNumber += 3;
        // myNumber의 현재값을 출력
        System.out.println("myNumber = " + myNumber);

        // 3. -=
        // myNumber의 현재 값에 5를 뺀 결과값을 다시 myNumber에 저장해라
        myNumber -= 5;
        // myNumber의 현재값을 출력
        System.out.println("myNumber = " + myNumber);

        // 증감연산자
        // 증감연산자는 해당 변수의 값을 1씩 변화시키지만
        // 변수의 앞에 붙냐 뒤에 붙냐에 따라서
        // 실행 순서가 바뀐다.
        // 앞에 붙을 땡는 가장 높은 우선순위를 갖고(=가장 먼저 실행 되고)
        // 전위 증감연산자 락 부른다.
        // 뒤에 붙을 때에는 가장 낮은 우선순위를 갖고(=가장 나중에 실행되고)
        // 후위 증감연산자 라고 부른다.

        // int 변수 myNumber1 과 myNumber2를 선언하고 각각 5와 4로 초기화하자
        int myNumber1 = 5, myNumber2 = 4;
        System.out.println("myNumber1++: " + myNumber1++); // 뒤에 ++이 붙을 경우 이 줄의 명령어가 끝나기 전에 1이 더해진다.
        System.out.println("myNumber1: " + myNumber1);

        System.out.println("++myNumber2: "+ ++myNumber2); // 이 줄의 명령어에서 가장 먼저 실행됨
        System.out.println("myNumber2: " + myNumber2);

        System.out.println(++myNumber2 - myNumber1--);
        //화면에 출력되는 결과
        // 출력된 후의 myNumber1 5, myNumber2 6의 값을 적으시오
        System.out.println("myNumber1: "+myNumber1+", myNumber2: " + myNumber2);

    }
}
