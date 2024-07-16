package day0513;

import types.Student;

// 구조체
// 구조체란 여러가지의 데이터타입을 합쳐서 한가지의 데이터타입으로 묶는 특수한 자료형을 뜻한다.
// 단, 구조체는 C, C++에서만 사용 가능하고 자바에서는 사용이 불가능하다.
// 하지만 우리가 구조체와 유사한걸 만들어낼 수 있다.
public class Ex01Struct {
    public static void main(String[] args) {
        // Student를 선언해보자
        Student kim = new Student();

        // Student 변수 kim 안에 값을 저장해보자
        // 우리가 클래스형 변수 안에 값을 저장할 때에는
        // 변수이름.종류 = 값; 으로 저장하게 된다.
        kim.id = 1;
        kim.name = "김철수";
        kim.korean = 80;
        kim.english = 81;
        kim.math = 83;

        // 저장된 값을 불러올때도 마찬가지
        System.out.printf("번호: %02d번 이름: %s\n",kim.id, kim.name);
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점",kim.korean,kim.english,kim.math);

        Student lee = new Student();
        lee.id = 2;
        lee.name= "이영희";
        lee.korean= 90;
        lee.english=91;
        lee.math= 92;
    }
}
