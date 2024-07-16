package day0501;

import java.util.Scanner;
public class Homework01 {
    // 1. 사용자로부터 숫자를 입력받아서 양의 정수이면 "양의 정수입니다" 가 출력되는 코드를 작성하시오
    // 2. 사용자로부터 나이를 입력받아서 미성년자일 경우 "미성년자 입니다" 가 출력되는 코드를 작성하시오.
    // 3. 사용자로부터 국어, 영어, 수학 점수를 입력받아서 평균이 60점 이상이고, 모든 과목이 50점 초과일때 합격입니다. 가 출력되는 코드를 작성하시오
    // 4. 사용자로부터 아이디와 비밀번호를 입력받아서 아이디가 "admin", 비밀번호가 "!Q@W3e4r" 일경우 "로그인 성공" 이 출력되는 코드를 작성하시오
    // 5. 사용자가 숫자를 입력했을 때 0~100사이의 숫자가 입력됬을 경우 "올바른 시험 점수입니다." 가 출력되는 코드를 작성하시오
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 사용자로부터 숫자를 입력받아서 양의 정수이면 "양의 정수입니다" 가 출력되는 코드를 작성하시오
        System.out.print("숫자를 입력하세요: ");
        double number = scanner.nextDouble();
        if (number > 0 && number % 1 == 0 ) {                                          // 여기서 if에 0보다 크고 number%1 == 0 이라는 조건도 넣으면 실수를 넣었을때 양의 정수입니다가 안뜸
            System.out.println("\"양의 정수입니다.\"");
        }

        System.out.println("=========================================");


        // 2. 사용자로부터 나이를 입력받아서 미성년자일 경우 "미성년자 입니다" 가 출력되는 코드를 작성하시오.
        System.out.print("나이를 입력하세요: ");
        int myAge = scanner.nextInt();
        if (myAge < 19) {
            System.out.println("\"미성년자 입니다.\"");
        }

        System.out.println("=========================================");

        // 3. 사용자로부터 국어, 영어, 수학 점수를 입력받아서 평균이 60점 이상이고, 모든 과목이 50점 초과일때 합격입니다. 가 출력되는 코드를 작성하시오
        System.out.print("국어 점수: ");
        int korean = scanner.nextInt();

        System.out.print("영어 점수: ");
        int english = scanner.nextInt();

        System.out.print("수학 점수: ");
        int math = scanner.nextInt();
        final int SUBJECT_NUM = 3;

        int sum = korean + english + math;
        double average = sum/ (double)SUBJECT_NUM;

        if (average >= 60 && korean > 50 && english > 50 && math > 50 ) {
            System.out.println("\"합격입니다.\"");
        }

        System.out.println("=========================================");

        // 4. 사용자로부터 아이디와 비밀번호를 입력받아서 아이디가 "admin", 비밀번호가 "!Q@W3e4r" 일경우 "로그인 성공" 이 출력되는 코드를 작성하시오
        System.out.print("사용자의 아이디를 입력하세요: ");
        scanner.nextLine();
        String userId= scanner.nextLine();

        System.out.print("사용자의 비밀번호를 입력하세요: ");
        String userPW= scanner.nextLine();

        if(userId.equals("admin")  && userPW.equals("!Q@W3e4r")){
            System.out.println("\"로그인 성공\"");

        }

        System.out.println("=========================================");

        // 5. 사용자가 숫자를 입력했을 때 0~100사이의 숫자가 입력됬을 경우 "올바른 시험 점수입니다." 가 출력되는 코드를 작성하시오
        System.out.print("점수를 입력하세요: ");
        int testResult = scanner.nextInt();                                 //score 이름이 더맞는듯... ㅎㅎㅎ...

        if (testResult > 0 && testResult < 100) {                           // 0이상 100 이하로... ㅠㅠ
            System.out.println("\"올바른 시험 점수 입니다.\"");
        } else{
            System.out.println("\"올바르지 않은 시험 점수 입니다.\"");
        }

        System.out.println("=========================================");

        System.out.println("프로그램 종료");


    }




}
