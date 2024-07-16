package day0430;
// 형 변환(Type Casting)
// 형 변환이란, 특정 데이터타입의 값을
// 다른 데이터타입으로 바꾸는 것을 뜻한다.
// 형 변환에는 2가지 종류가 있는데
// 암시적 형변환과 명시적 형변환 2가지가 있다.

// 암시적 형변환(Implicit Type Casting)
// 우리가 직접적으로 형변환을 하는 명령어를 적어주지 않더라도
// 인터프리터가 알아서 형변환을 자동으로 해준다.
// 더 작은 데이터타입의 값을 더 큰 데이터타입으로 변환하거나
// 데이터 손실이 발생하지 않을 경우에
//암시적 형변환이 발생된다.

// 명시적 형변환(Explicit Type Casting)
// 명시적 형변환은 반드시 명령어를 적어서 강제로 형변환을 해주는것을
// 뜻한다.
// 더큰 데이터타입의 값을 저 작은 데이터타입으로 변환하거나
// 데이터 손실이 발생할 경우
// 반드시 명시적 형변환을 통해서 형변환을 해주어야 한다.
public class Ex11TypeCast {
    public static void main(String[] args) {
        // 암시적 형변환
        // 1. byte의 값을 int 공간에 담아보자

        // 1-1. byte 변수 myByte를 선언하고 30을 저장해보자
        byte myByte = 30;
        // 1-2. int 변수 myNumber를 선언하고
        //      myByte의 현재 값으로 초기화해보자
        int myNumber = myByte;
        //1-3. myNumber의 현재값을 출력해보자
        System.out.println("myNumber의 현재 값");
        System.out.println(myNumber);

        // 2. 정수를 실수로 바꿔보자
        // double변수 myDouble에 myNumber의 현재 값을 저장해보자
        double myDouble = myNumber;
        // myDouble의 현재 값을 출력해보자
        System.out.println("myDouble의 현재 값");
        System.out.println(myDouble);

        // 명시적 형변환
        // 명시적 형변화는 변환할 값 앞에 바꿀 데이터타입을()로
        // 감싸서 저장한다.
        //myNumber의 현재 값을 myByte에 저장해보자
        myByte = (byte)myNumber;
        // myByte의 현재 값을 출력해보자
        System.out.println("myByte의 현재 값");
        System.out.println(myByte);

        // 실수를 정수로 바꿀때에도 명시적 형변환이 필요하다.
        // myNumber에 myDouble의 현재 값을 저장해보자
        myNumber = (int)myDouble;

        // 번외. overflow, underflow 체험해보기
        // myByte에 128을 저장하고 출력해보자
        myByte = (byte)128;
        System.out.println("myByte의 현재 값");
        System.out.println(myByte);

        //myByte에 -129를 저장하면?
        myByte = (byte)-130;
        System.out.println("myByte의 현재 값");
        System.out.println(myByte);
    }
}
