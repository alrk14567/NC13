package types;
// 우리가 구조체를 흉내낸 Student 클래스
// 해당 클래스 안에는 Student 클래스 변수가 어떤 데이터를 다룰 것인지만 적어주게 된다.

// 완전한 클래스는 아니지만 이 Student클래스에서 아래의 변수와 같은 변수들을 저장할 수 있다??

// + Student 구조체에서 클래스로 업그레이드
// 우리가 위에 만들어둔 필드
// + 학생 클래스 변수가 실행해야할 메소드들을 적어주게 된다.
public class Student {
    public int id;
    public String name;
    public int korean;
    public int english;
    public int math;

    public final int SUBJECT_SIZE = 3;


    // 해당 클래스 변수가 실행시킬 수 있는 메소드

    // 해당 클래스 변수의 저장된 값을 토대로 총점을 계산하는 메소드
    public int calculateSum() {
        return korean + english + math;
    }

    // 해당 클래스 변수의 저장된 값을 토대로 평균을 계산하는 메소드
    public double calculateAverage() {
        return (double) calculateSum() / SUBJECT_SIZE;
    }

    // 해당 클래스 변수의 값을 예쁘게 출력해주는 메소드
    public void printInfo() {
        System.out.printf("번호: %2d번 이름:%s\n", id, name);
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math);
        System.out.printf("총점 %03d점 평균: %06.2f점\n", calculateSum(), calculateAverage());
    }

    // 파라미터가 있는 생성자
    // 생성자의 경우, 리턴 타입을 적지 않고 메소드의 이름은 무조건 클래스의 이름과 통일시켜준다.
    public Student(int id, String name, int korean, int english, int math) {               //생성자의 조건 - 1. 리턴 타입은 생략 2. 메소드의 이름은 무조건 클래스의 이름과 동일
        // 만약 메소드에서 파라미터의 이름과 필드의 이름이 같을 시에 해당 이름을 적으면 무조건 파라미터의 이름이 우선시 된다.
        // 만약 이러한 경우에 우리가 필드를 지칭하고 싶다면 필드의 앞에 this.을 붙여주면 해당 클래스의 변수 라는 의미가 되어
        // 필드가 지정이 된다.

        // 이 생성자를 실행시키는 객체의 id 안에 파라미터 id의 현재 값을 저장해라  객체(변수이름).id=파라미터id    --> 이렇게 아래의 저장 변수의 형태들을 선언함으로써 Student 클래스 형태의 데이터 타입의 선언이 가능
        this.id = id;                                                                               //-> 허나 이렇게만 할 경우 선언 시에 파라미터들을 무조건 넣어 주어야 한다.
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
        // 파라미터가 없는 생성자                                                                       // -> 위의 문제를 해결하기 위해 파라미터가 없는 생성자도 만들면 된다.
    public Student() {
        id = -1;
        name = "입력 안됨";
        korean = -1;
        english = -1;
        math = -1;
    }

    // 클래스이름 Student   각 객체는 s1,s2,s4

    // equals() 재정의 하기
    // 우리가 부모 클래스의 메소드를 재정의 할때에는 반드시 부모 클래스가 적은 메소드의 선언식을 그대로 받아 적어야 한다.        -> 부모 클래스의 메소드는 java에 속해 있는 주로 기본적으로 있는 메소드
    // 따라서 equals() 메소드는 public boolean equals(Object obj) 라고 적어야 한다.
    @Override // -> 해당 메소드 선언이 부모 메소드의 선언과 다르면 에러
    public boolean equals(Object obj) {
        // 만약 자기 자신과 비교하는 경우, 즉 주소값이 같으면 return true 해라         ->  s1,s2 를 비교 선언된 변수 이름이 같으면 무조건 같기 때문에 true
        if (this == obj) {
            return true;
        }

        // 만약 파라미터로 들어온 obj가 Student 클래스의 객체가 맞으면 코드를 실행해라                      s1 s2 이런거?? 스튜던트 형태의 데이터 타입이 맞는가???확인은 instanceof
        // 어떠한 클래스 객체가 특정 클래스 객체인지 확인할 때에는 instanceof 라는 키워드를 사용하게 된다.      여기서 말하는 특정 클래스란 s1, s2의 경우는 Student?
        if (obj instanceof Student) {
            Student s = (Student) obj;        // 강제 형변환이유 Object obj는 필드가 없음 네임 아이디 이런거     ??-> 왜 여기선 Student 선언이 없지?? 이유는 Student클래스여서?? 생성자가 있어서??
            return id == s.id;
        }
        return false;
    }


}
