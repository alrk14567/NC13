package day0430;
// 주석(Comment)
// 주석이란 소스파일에 적혀있지만
// 실제 컴파일 단계에서는 무시가 되는 글자들을 주석이라고 한다.
// 주석을 사용하는 이유는 자신이 쓴 코드에 대한 설명을 적기 위함이다.

// 주석에는 크게 한줄 주석과 여러줄 주석이 있는데
// 한줄 주석은 // 부터 엔터키 전까지의 모든 글자들을 주석으로 처리한다.

/* 여러줄 주석은 /*으로 시작하고
    */ //가 나오기 전까지의 모든 코드를 주석으로 처리한다.

public class Ex02Comment {
    public static void main(String[] args){
        System.out.println("1번째줄 출력");
        System.out.println("2번째줄 출력");
        System.out.println("3번째줄 출력");


        System.out.println("4번째줄 출력");
        System.out.println("5번째줄 출력");
    }

}
