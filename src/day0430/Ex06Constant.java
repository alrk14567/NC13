package day0430;
// 상수(Constant)
// 상수란, 한번 값이 초기화가 되면
// 더이상 새로운 값을 저장할 수 없는 공간을 뜻한다.

// 상수의 경우, 선언할 때 맨 앞에 final 이라는 키워드를
// 붙여주면 해당 공간은 상수로 설정이 된다.
public class Ex06Constant {
    public static void main(String[] args){
        // int 타입 상수 MY_NUMBER을 선언해보자
        final int MY_NUMBER;
        // 상수 MY_NUMBER에 20을 저장해보자
        MY_NUMBER = 20;

        //MY_NUMBER의 현재 값을 출력해보자
        System.out.println("MY_NUMBER의 현재 값");
        System.out.println(MY_NUMBER);

        // MY_NUMBER에 새로운 값 30을 저장해보자
        // MY_NUMBER = 30; -> MY_NUMBER는 상수이므로 값을
        //                     더이상 새로 저장할 수 없다.

        // MY_NUMBER에 20을 저장하자
        // -> 컴퓨터의 = 은 무조건 덮어 씌우는 의미가 되므로
        // 현재 저장된 값과 새로운 값이 같던 다르던간에
        // 무조건 에러가 발생이 된다.
    }
}
