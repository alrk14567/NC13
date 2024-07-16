package day0501;
// 사용자로부터 숫자를 입력받아서
// 0보다 크면 자연수 입니다. 가 출력되는 프로그램을 작성해보시오
import java.util.Scanner;
public class Ex10If2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int myNumber=scanner.nextInt();
        if (myNumber > 0) {
            System.out.println("\"자연수 입니다\"");

        }
        else if (myNumber < 0) {
            System.out.println("\"음수 입니다.\"");
        }

        System.out.println("프로그램 종료");

        // 1. 사용자로부터 숫자를 입력받는다.

        // 2. if문을 사용해 사용자의 숫자가 0보다 큰지 확인한다.

        // 2-1. 0보다 크면 "자연수입니다" 출력한다.
    }
}
