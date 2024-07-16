package types;
// Animal 클래스를 상속받는 자식클래스 Dog
// public class 자식클래스이름 extends 부모클래스이름
// 이라고 적어주면 상속이 이뤄진다.
public class Dog extends Animal {
    public Dog() {
        System.out.println("Dog() 호출");
    }

    // 오버라이드(Override)
    // 오버라이드란, 부모 클래스의 메소드를 자식 클래스가 사용하고자 했는데 만약 자식 클래스가 재정의가 필요하다면 부모클래스의 메소드를 그대로 선언하고
    // 메소드의 내용을 바꾸어서 만들어주는 방법이다.
    // 예) public boolean equals(Object obj)
    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }
}
