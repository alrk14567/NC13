package types;
// 상속에서 사용할 최상위 클래스


public class Animal {
    public void move() {
        System.out.println("동물이 움직인다.");
    }

    public void info() {
        System.out.println("동물과 식물의 차이는 세포에 세포벽이 없다 이다.");
    }

    public void makeSound() {
        System.out.println("동물이 소리를 낸다");
    }

    public Animal() {
        System.out.println("Animal() 호출");
    }
}
