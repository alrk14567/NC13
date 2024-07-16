package day0510;
// 값에 의한 호출과 참조에 의한 호출

// 자바에서 파라미터로 값을 보내줄때 2가지의 호출이 일어난다.
// 값에 의한 호출: 기본형 데이터타입일 경우, 해당 변수 혹은 값이 복사되서 보내진다.                  => 기본형 데이터 타입은 논리형,문자형, 정수형,실수형
//               즉, 보내진 값은 복사본이므로, 다른 메소드에서 해당 값을 변경을 하더라도 원본에는 변경이 가해지지 않는다.
// 참조에 의한 호출: 참조형 데이터타입일 경우, 주소값이 보내진다. 주소값이 보내졌기 때문에, 파라미터로 받은 메소드와 원본 모두      -> 그 외에 나머지 다 참조형타입이다
//                 똑같은 힙 영역의 공간을 보게된다. 따라서, 다른 메소드가 변경을 가하면, 힙 영역에 공간에 변경이 가해지고
//                 원본도 마찬가지로 변경이 된다. 단, 해당 메소드가 다른 주소값을 부여하게 되면 변경이 되지 않는다.
// new 키워드: 해당 참조형 변수에 새로운 주소값을 부여한다.
public class Ex01Call {
    public static void main(String[] args) {
        int a=10;
        System.out.println("callValue 전 값: "+a);
        callValue(a);
        System.out.println("callValue 후 값: "+a);
        int[] array=new int[4];
        System.out.println("callRef 전 값: "+array[0]);
        callRef(array);
        System.out.println("callRef 후 값 "+ array[0]);

        array[0]=100;
        System.out.println("alloc 전 값: "+array[0]);
        alloc(array);
        System.out.println("alloc 후 값 "+ array[0]);

    }


    public static void callValue(int value) {
                value++;
        System.out.println("callValue에서 value의 값: "+value);
    }

    public static void callRef(int[] array) {
        array[0]=20;
        System.out.println("array[0]: "+array[0]);
    }

    // 다른 주소값을 부여할 경우
    public static void alloc(int[] array) {
        array= new int[5];                  //새로운 주소값으로 부여했기 때문에 이름은 같지만 주소가 다르다 동명이인
        array[0]= 20;
        System.out.println("alloc.array[0]: "+array[0]);
    }

}

/*숙제
값에 의한 호출(Call By Valie)와
예시 데이터 d 에 x 를 10이라고 저장하고
어떠한 메서드를 호출해서 값을 출력하려 할때 메서드 내에 x 라는 데이터 주소값을 재외한 변수 이름만 입력하여
메서드가 산출될 경우 x가 메인에서 출력되는 값은 메서드에서 산출한 값이 아닌 메인에서 저장되어진 값(=10)이다.

즉 데이터를 통해 저장한 변수의 값들의 경우 메서드에서 주소?를 함께 입력하여 산출하지 않을 경우 값의 변동이 없다.
그럼 메인에서 데이터의 변수만 가지고 계산할 경우에 어떻게 바뀔 것인가??


참조에 의한 호출(Call By Reference)를 공부해오시오.
예시 데이터 d에 x를 10이라 저장하고
어떠한 메서드를 호출해서 값을 출력하려 할때 메서드 내에서 x 의 데이터 주소까지 포함하여 변수를 입력하여
메서드가 산출될 경우 x 가 메인에서 출력되는 값은 메서드를 통해 산출된 값과 같다.

데이터를 통해 저장한 변수의 값들이 메서드 내에서 주소를 함께 입력하면 메인에서도 값의 변동이 있다.


data D 는 데이터 타입 데이터
여기서 int형 산출 식을 해서 값이 바뀌어도 데이터 타입의 x값이 변화하는게 아니기 때문에 d.x의 값은 변하지 않는다.
하지만 데이터형 산출식을 통해 값을 바꾸어 준다면 d.x의 값이 변화한다.*/
