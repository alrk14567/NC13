package day0501;

// printf의 다양한 형식
// 우리가 필요에 따라서는 printf를 사용해서 우리가 원하는 내용을 콘솔에 지정한 형식으로 출력이 가능하다.
// 단, 우리가 웹프로그래밍에 들어가게되면 더이상 출력하는 곳이 콘솔이 아니기 때문에 사용되지 않는다.
public class Ex06Printf {
    public static void main(String[] args) {
        //정수 출력에 사용할 int 변수
        int number = 15;
        // 1. 10진법 정수(Decimal)
        System.out.printf("==========================================\n");
        System.out.println("1. 10진법 정수");
        System.out.println("---------------------------------------");
        // A. 10진법 정수를 그대로 출력해라
        System.out.printf("1-A. [%d]\n", number);
        // B. 10진법 정수를 오른쪽 정령 5자리로 출력해라
        System.out.printf("1-B. [%5d]\n", number);
        // C. 10진법 정수를 왼쪽 정렬 5자리로 출력해라
        System.out.printf("1-C. [%-5d]\n", number);
        // D. 10진법 정수를 오른쪽 정렬 5자리로 출력하되, 왼쪽 빈 자리는 0으로 채워라
        System.out.printf("1-D. [%05d]\n", number);
        System.out.println("=======================================");
        System.out.println();
        System.out.println("===========================================");
        // 2. 실수(float)
        // 실수 출력에 사용할 double 변수
        double myDouble = 3.141592;
        System.out.println("2. 실수");
        System.out.println("---------------------------------------");
        // A. 실수를 그대로 출력해라
        System.out.printf("2-A. [%f]\n", myDouble);
        // B. 실수를 오른쪽 정렬 10자리로 출력해라
        System.out.printf("2-B. [%10f]\n", myDouble); // 왼쪽의 10은 총 자릿수(숫자를 포함한)
        // C. 실수를 왼쪽 정렬 10자리로 출력해라
        System.out.printf("2-C. [%-10f]\n", myDouble);
        // D. 실수를 오른쪽 정렬 10자리로 출력하되 왼쪽 빈 자리는 0으로 채워라
        System.out.printf("2-D. [%010f]\n", myDouble);
        // E. 실수를 소숫점 2번째 자리까지 출력해라
        System.out.printf("2-E. [%.2f]\n", myDouble);
        System.out.println("===========================================");
        System.out.println();
        System.out.println("===========================================");
        System.out.println("3. 스트링(String)");
        System.out.println("--------------------------------------------");
        // A. String을 그대로 출력해라
        System.out.printf("3-A. [%s]\n", "abcdEFGH");
        // B. String을 모두 대문자로 출력해라
        System.out.printf("3-B. [%S]\n", "abcdEFGH");
        // C/ String을 오른쪽 정렬 10자리로 출려해라
        System.out.printf("3-C. [%10s]\n", "abcdEFGH");
        // D. String을 왼쪽 정렬 10자리로 출력해라
        System.out.printf("3-D. [%-10s]\n", "abcdEFGH");
        // 단, 왼쪽 빈 자리를 0으로 채워라는 0도 문자이기 때문에 불가능하다.
        System.out.println("============================================");
        // 만약 printf로 여러개의 형식을 맞추어 출력해야 한다면?
        System.out.printf("%2d %03d %08d\n", 1, 2, 3);

        // 여러분들이 자유롭게 변수를 만들어서 다음과 같은 형식으로 출력이 되는 코드를 작성해 보세요
        // 결과물:
        // 이름: ### 나이: 0##세
        // 국어: 0##점 영어: 0##점 수학: 0##점
        // 총점: 0##점 평균: 0##.##점
        String myName = "정기돈";                                                         // 이름
        int myAge = 33, korean = 10, english= 19, math=26;                               // 각 과목의 점수
        int sum = korean + english + math;                                               // 총점 여기까지 정수
        double myAverage=(double)sum/3;                                                  // 평균 값 실수로 정의
        System.out.printf("이름: %s 나이: %03d세\n",myName,myAge);                         // 이름 나이 출력
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점",korean, english, math);   // 각 과목 점수 출력 오른쪽 정렬 3 정수로 출력
        System.out.printf("\n총점: %03d점 평균: %06.2f점\n",sum,myAverage);                   // 총점은 정수로 출력 -> 2자리수 일때 0이
                                                                                          // 나오도록 평균은 실수로 출력 .포함6자리 빈칸엔 0이 나오도록
        System.out.println("--------------------------------------------");
        //출력에 사용할 변수들
        //이름
        String name = "조재영";
        //나이
        int age = 18;
        //국어
        int kor = 90;
        //영어
        int eng = 90;
        //수학
        int ma = 91;
        //총점
        int sum1 = kor + eng+ma;
        //평균
        double avg = sum1/3.0;
        System.out.printf("이름: %s 나이: %03d세\n", name, age);
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n",kor, eng, ma);
        System.out.printf("총점: %03d점 평균: %06.2f점\n", sum1,avg);


    }
}
