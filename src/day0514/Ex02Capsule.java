package day0514;
// 접근제한자(Access Modifier)와 캡슐화(Capsulization)
// 접근 제한자
// 접근 제한자란, 해당 클래스의 필드 혹은 메소드를 외부 클래스가 접근 가능한 범위를 설정해 주는 키워드이다.
// public: 외부 패키지의 외부 클래스 누구나 접근 가능하다.
// protected: 같은 패키지의 다른 클래스는 접근 가능하지만
//            다른 패키지일 경우, 해당 클래스의 자식 클래스일 때에만 접근 가능하다.
// 디폴트: 우리가 아무런 접근 제한자를 적어주지 않을 떄에는 같은 패키지의 다른 클래스들까지만 접근이 가능하다.            --> 자식 클래스는 접근이 가능한가?? 디폴트는 불가능 하다.
//        같은 패키지의 클래스들만 접근 가능하기 때문에 패키지 접근 제한자라고도 부른다.
// private: 자기 자신이 아닌 다른 클래스들은 모두다 접근할 수 없다.                                                --> 아예 접근 불가

// 캡슐화                                                                                                     --> getter,setter을 말하는 데 이걸 잘 쓰면 코딩이 편할듯??
// 캡슐화란, 우리가 만든 클래스의 필드 그리고 메소드를 외부에서 직접적으로 접근하지 못하게 막고                             --> 그 객체 자체를 소환 시킴으로써 각 클래스 사이의 영향력? 을 줄일 수 있을듯
// 메소드의 경우, 외부에서 사용하지 않을 메소드이면 접근을 막게 만드는 방법이다.
// 캡슐화를 하는 이뉴는, 우리가 객체 지향적 관점에서 외부가 우리 클래스의 필드 혹은 메소드를 직접적으로 값을 넣거나 호출하지 말고
// 객체 그 자체를 소화시키도록 만들기 위함이다.

// 캡슐화의 기본 방법
// 1. 필드는 모두다 private
//    단, private으로 지정된 필드의 경우 우리가 직접적으로 접근할 수 없기 때문에 값을 저정하는 setter 메소드와 저장된 값을 불러오는 getter
//    getter 메소드를 통하여 간접적으로 접근하게 된다.
// 2. 외부에서 쓰는 메소드만 public, 그 외는 모두다 private

// getter 메소드 만드는 방법
// public 필드타입 get필드이름() {                      --> 필드 타입 우리가 만든 보드나 학생 같은거 필드 이름은 말그대로 변수이름
//      return 필드이름;
// }

// setter 메소드 만드는 방법
// public void set필드이름(필드타입 필드이름) {
//      this.필드이름=필드이름;
// }
public class Ex02Capsule {
}