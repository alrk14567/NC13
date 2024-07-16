package day0508;
// 우리가 입력할 때 도움을 줄
// ScannerUtil을 직접 체험해볼 클래스
import java.util.Scanner;
import util.ScannerUtil;            // 유틸 패키지 파일에 있는 클래스 파일에 만들어 놓은 메소드를 쓸수 있게 하겠다.



public class Ex04ScannerUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ScannerUtil을 안쓸경우
        // 사용자로부터 숫자 3개를 입력받아 보자                --> for문으로 바꾸기 가능
        System.out.println("0~10 사이의 숫자를 입력해주세요.");
        System.out.print("> ");
        int number = scanner.nextInt();
        while (!(number >=0 && number <= 10)) {
            System.out.println("잘못 입력하셨습니다.");
            System.out.println("0~10 사이의 숫자를 입력해주세요.");
            System.out.print("> ");
            number = scanner.nextInt();
        }
        System.out.println("사용자가 입력한 숫자: "+number);

        number= ScannerUtil.nextInt(scanner,"0~10사이의 숫자를 입력해주세요.",0,10);// 변수에 스캐너유틸 클래스 파일의 해당 메서드를 사용하겠다
        System.out.println("사용자가 입력한 숫자: "+number);



       /* System.out.println("숫자를 입력해주세요.");
        System.out.print("> ");
        number = scanner.nextInt();
        System.out.println("사용자가 입력한 숫자: "+number);*/

        // ScannerUtil을 쓸 경우
        // 단, 외부 패키지에 있는 클래스를 호출하려면 반드시 import 해주어야 한다.
        /*number = ScannerUtil.nextInt(scanner,"숫자를 입력해주세요.");
        System.out.println("사용자가 입력한 숫자: "+number);*/

    }
}
