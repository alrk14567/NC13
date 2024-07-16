package day0514;
// 상속(Inheritance)
// 아침 드라마나 실제 상황에서 부모가 자식이 상속을 해주는 이유: 자식이 부모가 가진 재산을 그대로 쓰게 하려고

// 프로그래밍에서 클래스 상속을 하는 이유: 똑같다.
// -> 부모 클래스가 가진 필드 혹은 메소드를 자식 클래스가 그대로 쓰게 하려고                              -> 부모 클래스내에 있는 메서드를 자식 클래스에서 사용할 수 있게 하는 것이 상속이다.

// 클래스 상속을 하는 방법
// 부모 클래스를 만들고 자식 클래스에서 상속을 할때                                      예시 public class 클래스이름 extends 부모클래스이름 {
// public class 자식클래스이름 extends 부모클래스이름
// 이라고 적어주면 상속이 이뤄진다.

// 단, 인터페이스 상속은 부모 클래스의 코드를 그대로 쓰기 위함이 아니라                              --> 클래스에서 상속은 코드를 쓰기 위해서지만
// 우리가 다형성 이라는 성격을 부여하기 위함이기 때문에, 지금은 다루지 않는다.                        --> 인터페이스에서 상속은 다형성이라는 성격을 부여하기 위함이다.

// 다형성(多形性, Polymorphism)
// 다양한 형태를 가지는 성질
// 다형성은 우리가 부모 클래스 객체가 들어갈 자리에 자식 클래스가 그대로 들어갈 수 있는 것을 뜻한다.
// 예를 들어
// equals 메소드의 경우 파라미터에 java.lang.Object가 있기 때문에 해당 Object 클래스를 상속 받는 모든 클래스 객체가 파라미터로 들어갈 수 있다.

// 또한, 부모 클래스 객체를 자식클래스의 생성자로 초기화하는 것도 이러한 폴리몰피즘 덕분에 가능한 것이다.

import types.Animal;
import types.Cat;
import types.Dog;
import types.Cow;
import types.IAnimal;

public class Ex03Inherit {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.info();
        a.move();
        a.makeSound();

        Dog d=new Dog();                // 애니멀이 두번 나오는 이유 도그가 애니멀의 상속을 받았기 때문에 이때 도그를 호출하면 애니멀이 먼저 호출 된다.
        d.info();                       // 도그가 애니멀의 자식 클래스이기때문에 먼저 애니멀에서 필드를 불러와서 그안에 도그가 있는 개념?
        d.move();
        d.makeSound();

        Animal animal = new Dog();          // 애니멀 타입의 필에 자식클래스의 도그 필드 선언은 가능하다 하지만 메서드가 부모,자식 둘다 있을 경우 자식의 메서드로 실행
        animal.makeSound();

        System.out.println("=============================================");
        System.out.println("인터페이스 상속");
        System.out.println("=============================================\n");
        IAnimal randomAnimal =new Cow();
        randomAnimal.info();
        randomAnimal.move();
        randomAnimal.makeSound();
        randomAnimal=new Cat();
        randomAnimal.info();
        randomAnimal.move();
        randomAnimal.makeSound();

    }
}
