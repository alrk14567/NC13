package day0513;
// ArrayList
// 자바가 기본적으로 제공하는 동적할당 배열

import java.util.ArrayList;

public class Ex04ArrayList {
    public static void main(String[] args) {
        // 어레이리스트는 우리가 반드시 어떤 것(=데이터타입)의 모음인지를 적어주어야한다.
        // 적어줄때에는 다음과 같이 적어주게 된다.
        // ArrayList<타입> 이름 = new ArrayList<>();
        // 단, 한가지 주의할 점은 타입에는 반드시 클래스만 들어가야한다!!!!!!!!!!
        // 기본형 데이터 못들어간다

        // 당연히 기본형 데이터타입은 못들어가지만 자바가 제공해준 기본형 데이터타입을 클래스화 시킨 클래스들을 넣을 수 있다.
        // 이러한 클래스를 우리가 "포장 클래스(Wrapper Class)" 라고 부른다.

        // int의 포장 클래스는 Integer 클래스
        // double의 포장 클래스는 Double
        // char의 포장클래스는 String

        // Integer의 ArrayList를 만들어보자
        ArrayList<Integer> list = new ArrayList<>();

        // 1. list의 현재 크기를 알고 싶다면?
        // size()
        System.out.println("1. list.size(): "+list.size());

        // 2. 현재 어레이리스트가 비어있는지 체크할 때에는?
        // isEmpty()
        System.out.println("2. list.isEmpty(): "+list.isEmpty());

        // 3. 현재 어레이리스트에 새로운 요소를 추가할때에는?
        // add()
        Integer i = 4;
        list.add(i);

        // 4. 현재 어레이리스트에 특정 인덱스에 저장된 값을 불러올 때
        // get()
        System.out.println("4. list.get(0): "+list.get(0));

        // 5. 현재 어레이리스트에 특정 인덱스에 새로운 값을 끼워넣을 때에는
        // add(인덱스, 값)
        list.add(0,20);
        System.out.println("5. add(인덱스,값) 후 list.get(0): "+list.get(0));

        // 5. 현재 어레이리스트의 특정 값의 가장 먼저 등장하는 인덱스를 알고 싶다면?
        // indexOf()
        System.out.println("6. list.indexOf(4): "+list.indexOf(4));
        System.out.println("6. list.indexOf(1892)"+list.indexOf(1892));

        // 7. 현재 어레이리스트의 특정 값의 가장 나중에 등장하는 인덱스를 알고 싶다면?
        // lastindexOf()
        list.add(20);
        System.out.println("7. list.lastIndexOf(20): "+list.lastIndexOf(20));

        // 8. 현재 어레이리스트의 특정 값이 존재하는지 알고 싶다면?
        // contains()
        System.out.println("8. list.contains(28878):" +list.contains(28878));
        System.out.println("8. list.contains(4):" +list.contains(4));

        // 9. 현재 어레이리스트의 특정 인덱스의 값을 교체하고 싶다면?
        // set()
        System.out.println("9. list.set(0,50) 전 list.get(0):" +list.get(0));
        Integer i2 = list.set(0,50);
        System.out.println("9. list.set(0,50) 후 list.get(0):" +list.get(0));
        System.out.println("9. list.set(0,50) i2: " +i2);

        // 10. 현재 어레이리스트의 특정 인덱스의 값을 삭제하고 싶다면?
        // remove()
        System.out.println("10. remove(0) 전 list.contains(50): "+list.contains(50));
        System.out.println(list.get(0));
        list.remove(0);
        System.out.println("10. remove(0) 후 list.contains(50): "+list.contains(50));
        System.out.println(list.get(0));

        // 11. 현재 어레이리스트의 특정 값을 찾아서 삭제하고 싶다면?                       한개만 삭제된다
        // remove()
        System.out.println("11. remove(20) 전 list.indexOf(20): "+list.indexOf(20));
        Integer i3 =20;
        list.remove(i3);
        System.out.println("11. remove(20) 후 list.indexOf(20): "+list.indexOf(20));

        // 단, 우리가 만든 클래스를 모아둔 어레이리스트의 경우, 반드시 우리 클래스 안에 equals()가 오버라이드 되어야 정상적으로
        // indexOf(), lastIndexOf(), contains(), remove(element) 가 잘 작동한다.

        // 오버라이드(override)
        // 오버라이드란, 자식 클래스가 부모 클래스로부터 상속 받은 메소드를, 자신에게 맞게 재정의하는 것을 뜻한다.
        // 우리가 직접적으로 상속을 하지않더라도, 자바의 모든 클래스들은 Object라는 클래스를 상속을 받는데, 해당 Object 클래스의
        // equals() 메소드는 우리가 어레이리스트를 사용하기 위해서는 반드시 재정의해주어야 하는 메소드이다.



    }
}
