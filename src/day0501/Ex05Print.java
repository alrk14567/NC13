package day0501;
// 자바 콘솔에서 출력을 하는 3가지 방법
// 1. print()
//    괄호안의 내용을 그대로 출력한다.
// 2. println()
//    print a line의 줄임말로써, 괄호안의 내용을 출력하고 그 다음 출력 위치를 다음 줄의 첫번째 칸으로 이동시킨다.
// 3. printf()
//    print in format의 줄임말로써, 괄호안의 내용을 지정된 형식으로 출력한다.

public class Ex05Print {
    public static void main(String[] args) {
        // 출력할 내용을 담을 String 변수 string1, 2를 만들고
        // 각각 "ABCDE" , "fghij" 로 초기화해주자
        String string1 = "ABCDE" , string2 ="fghij";

        // print()
        System.out.print(string1);
        System.out.print(string2);

        // println()
        System.out.println(string1);
        System.out.println(string2);

        //printf()
        System.out.printf("%s", string1);
        System.out.printf("%S", string2);  // %S 모든 글자는 대문자로 출력

        // 이스케이프 문자
        // 이스케이프 문자란 줄바꿈, 탭공백, 등의 공백과
        // 특수한 의미를 가진 기호를 입력할 때 사용되는 한개의 char 문자이다.
        // 이스케이프 문자는 \ + 코드로 이루어지는데,
        // 우리가 볼때는 2글자이지만 컴퓨터는 알아서 1글자로 인식하기 때문이다.

        // 1. 줄바꿈 문자    \n
        System.out.print(string1 + '\n');
        System.out.print(string2 + '\n');
        System.out.print("1번째줄\n2번째줄\n");
        // 2. 탭공백        \t
        System.out.println("1번째 문장 \t 2번째 문장");
        // 3. 따옴표, 쌍따옴표, 역슬러시 를 그대로 출력해야할 경우
        //    \' \" \\
        System.out.println("\"내 사전에 불가능은 없다!\" - 나플레옹");


    }
}
