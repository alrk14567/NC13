package day0502;
// Switch 조건문
// Switch 조건문은 값이 명확하게 변화하는 변수 혹은 연산의 결과값을 선택하여
// 해당 값의 결과에 따라서 특정 코드를 실행시키도록 만들어주는 제어문이다.

public class Ex06Switch {
    public static void main(String[] args) {
        // switch 조건문에서 사용할 int 변수 -> double은 넣치 못함, break가 없으면 맞는거 부터 아래로 모두 실행시킨다.
        int number = 2;
        switch (number) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("그외입니다.");
                break;
        }
        // 나이에 따라서 유치원, 초딩, 중딩, 고딩, 성인이 출력되는 프로그램을 switch문으로 만들라 하면 if 문 쓰지 ㅋㅋㅋ
    }
}
