package day0502;
// if - else 구조
// if else 구조는, if문의 조건식이 false가 나왔을 때 실행시켜야할 코드가 있을 경우 else를 연결시켜서 실행되게 만들어 준다.

// if else 구조
// if(조건식) {
//        true일때 실행시킬 코드
// } else {
//      false일때 실행시킬 코드
// }

public class Ex01IfElse {
    public static void main(String[] args){
        float asd = -3;
        if (asd >=0) {
            System.out.println("자연수입니다.");
        } else {
            System.out.println("0보다 작습니다.");
        }
        System.out.println(asd);

    }
}
