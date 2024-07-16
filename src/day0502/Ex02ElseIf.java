package day0502;
import java.util.Scanner;
// if - else if 구조
// 만약 한가지 조건식을 체크하고 나서 해당 조건식이 false 일 때 다른 조건식을 체크할 경우에는 우리가 else if 구조를 사용하게 된다.
// if - else 구조와 마찬가지로 실제로 실행되는 코드 블락은 조건식을 만족하는 한개의 코드블락만 실행이 된다.
// if - else if의 구조는 다음과 같다.
// if (조건식1) {
//      조건식1이 true일때 실행할 코드
// } else if (조건식 2) {
//      조건식2가 true일때 실행할 코드
// } else if (조건식 3) {
// .....
// } else {
//      위의 조건식이 모두 false일 경우 실행될 코드
// }
public class Ex02ElseIf {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("나이: ");
        int age = scanner.nextInt();

        if (age < 8 ) {
            System.out.println("유치원");
        } else if (age <= 13) {
            System.out.println("초등학생");
        } else if (age <= 16) {
            System.out.println("중학생");
        } else if (age <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }

    }
}
