package day0516;
// 자바에서 특정 데이터타입의 여러 객체를 한번에 다루는 클래스는 모두 Collection 이라는 인터페이스를 상속 받는다.
// 그리고 콜렉션 인터페이스를 상속받는 3가지 종류는
// 1. 리스트: 중복이 가능한 배열 형태의 인터페이스
// 2. 셋: 중복이 불가능한 배열 형태의 인터페이스                    // 인덱스가 부여되지 않음
// 3. 맵: 중복되지 않는 키를 가지고 밸류(단일 값이 들어감)를 컨트롤 하는 인터페이스  -> 키에 대응하는 밸류가 있음
// 이렇게 된다.

import types.Student;

import java.util.HashMap;

// Map의 경우, 여러가지
public class Map {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>();

        Student s1 = new Student();
        s1.name = "김철수";
        s1.id = 1;
        s1.korean = 80;
        s1.english = 81;
        s1.math = 81;

        Student s2 = new Student();
        s2.name = "이영희";
        s2.id = 2;
        s2.korean = 80;
        s2.english = 81;
        s2.math = 83;

        Student s3 = new Student();
        s3.name = "AAA";
        s3.id = 3;
        s3.korean = 83;
        s3.english = 83;
        s3.math = 84;

        Student s4 = new Student();
        s4.name ="ABC";
        s4.id=4;

        // map에 데이터 추가하기
        map.put("김철수",s1);
        map.put("이영희",s2);
        map.put("AAA",s3);
        map.put("AAA",s4);

        // map에 데이터 가져오기
        System.out.println("map.get(\"김철수\").id:" + map.get("김철수").id);
        System.out.println("map.get(\"bbb\"): "+map.get("bbb"));
        System.out.println("map.get(\"AAA\").name: "+map.get("AAA").name);

        // 입력된 값들의 키 전체 확인하기
        System.out.println(map.keySet());           // set,map => Lifo(라스트인 퍼스트 아웃) 입력한 순서가 역전이 된다. 리스트는 => FIFO(퍼스트인 퍼스트아웃)
                                                    // 해쉬맵의 경우는 동일 key를 입력했을 때 덮어써서 저장을 하지만 중복되었을때 덮어쓰지않고 오류가 뜨는 맵도 있다.
        for(String k: map.keySet()) {
            System.out.println(map.get(k).id);
        }

        // 특정 키가 존재하는지 확인하기
        System.out.println(map.containsKey("aaa"));
        System.out.println(map.containsKey("AAA"));
    }
}
