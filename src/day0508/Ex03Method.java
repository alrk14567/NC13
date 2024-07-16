package day0508;
// 메소드(Method)      --> 중복되서 같은 코드를 짜는게 귀찮으니까
// 메소드란, 우리가 반복적으로 실행되는 코드를 좀더 간단하게 실행시키기위해
// 코드를 모아서 하나의 명령어로 묶는 것이다.
// 이렇게 하나로 묶여 있게 된다면 우리가 해당 코드들을 처음부터 끝까지 다시 적어줄 필요 없이 해당 메소드의 이름만으로
// 그 코드들을 실행시킬 수 있게 된다.

// 메소드는 다음과 같은 형식을 가지게 된다.
// public static 리턴타입 메소드이름(파라미터) {         --> 파라미터는 소모되는 재료이다.
//      해당 메소드가 실행시킬 코드들
// }

// public, static: 일단은 지금 단계에서는 무조건 써주기
// 리턴 타입: 해당 메소드를 실행시킨 곳으로 보내줄 값의 데이터타입.
//           만약 아무런 값도 보내지 않는 다면 void 라고 적어주게 된다.
//           리턴 타입이 존재할 경우, 해당 메소드는 반드시 return 이라는 명령어를 통해서, 해당 타입의 값을 보내주는 코드가 있어야 한다.
// 메소드 이름: 소문자로 시작하고 낙타등 표기법을 사용하는 동사
// 파라미터: 해당 메소드를 실행시킬 때 혹시라도 외부에서 어떠한 값이 필요할 경우 우리가 파라미터에 변수를 선언하듯이 적어주게 된다.
//          그러면 해당 메소드는 그 외부의 값을 변수로 사용할 수 있다.

// 메소드 오버로딩(Overloading)                            ==> 예시 println() 괄호안에 어떠한 타입이 들어가더라도 이미 함수로 짜여져 있어서  어떠한 타입으로도 사용이 가능하다.
// 메소드 오버로딩이란, 어떤 특정 목적을 가진 메소드들을 만들어야 할 경우
// 매번 이름을 다르게 만들어 주는 대신, 이름을 통일 시켜서 알아보기 쉽게 만들어주는 방법이다.
// 단, 한가지 주의할 점은 파라미터의 타입이 나오는 순서가 반드시 달라야한다.

public class Ex03Method {
    public static void main(String[] args) {
        // 내가 int 값을 보내면
        // 화면에 "사용자가 보낸 int 값" 이라고 표시해주는 메소드를 만들어보자

        int d = 10;
        printUserNumber(d);
        int myNumber = 3000;
        printUserNumber(myNumber);
        printUserNumber(450);
        int value=return80()+8;                       // 메소드 는 식으로 안된다?? 된다.
        System.out.println("메소드가 보내준 값: "+value);
        System.out.println(return80());  //= 화면에 return80()의 결과인 80을 출력시켜라
        int result= compare(d,value);

        System.out.println("result:"+ result);



    }
    // int a = myNumber의 현재값;
    // int a = 450;
    public static void printUserNumber(int a){
        System.out.println("사용자가 보낸 값: "+a);
    }
    // 사용자가 호출하면
    // 80을 돌려주는 메소드
    public static int return80() {

        return 80;
    }
    // 사용자가 2개의 int 값을 보내주면
    // 해당 값의 산술연산자의 결과 값을 화면에 출력하고
    // 둘 중 더 큰 값을 돌려주는 메소드
    public static int compare(int a, int b) {
        System.out.printf("%d + %d =%d\n",a,b, (a+b));
        System.out.printf("%d - %d =%d\n",a,b, (a-b));
        System.out.printf("%d * %d =%d\n",a,b, (a*b));
        System.out.printf("%d / %d =%d\n",a,b, (a/b));
        System.out.printf("%d %% %d =%d\n",a,b, (a%b));

        if (a>b) {
            return a;
        } else{
            return b;
        }

    }
}
