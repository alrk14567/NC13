package day0514;
// 의존성 주입(Dependency Injection)
// 의존성 주입이란, 우리의 클래스가 다른 클래스에 의존적인 관계일 경우, 해당 의존성을 약화시키기 위해 사용되는 방법이다.
// 예를 들어 우리가 A라는 클래스가 있고 해당 클래스는 B라는 클래스가 있어야 정상적으로 동작하는 클래스라고 가정해보자
// 그래서 우리 A 클래스가 내부적으로 B클래스 타입의 필드가 있고 모든 메소드는 해당 클래스의 메소드를 다양하게 활용한다고 가정해보자
// 이러한 경우, A 클래스는 B 클래스에 매우 의존적인 관계가 맺어지게된다.

// 그러던 어느날, B 클래스가 대규모 패치를 하게되어 모든 메소드의 내용이 바뀌었다고 가정해보자.
// 그렇다면 A 클래스의 운명은?
// 똑같이 A 클래스도 똑같이 대규모 패치를 해주어야 하는 경우가 발생하게 된다.

import types.Hobby;
import types.Writer;

// 이러한 의존성을 줄이기 위하여 여러 방법이 시도 되었으나 가장 좋은 방법은 다음과 같은 방법으로 해소를 하는 것이다.

// 의존성은 2가지 방법으로 줄일 수가 있는데
// 2가지 방법 모두 B라는 원본 클래스를 A가 직접 초기화를 하는 것이 아니라 A에 해당 객체를 전달시켜서 사용하게 하는 방법이 된다.
// 방법 1: setter를 통한 의존성 주입
// 방법 2: 생성자를 통한 의존성 주입
public class Ex04DI {
    public static void main(String[] args) {
        Writer writer = new Writer(3,"아가사 크리스티");
        Hobby hobby = new Hobby(writer);
        hobby.method1();
        hobby.method2();
        hobby.method3();
    }
}
