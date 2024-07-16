package day0430;
// 기본형 데이터타입 03. 문자형
// char: 해당 공간의 1개의 글자만 저장한다.
// 비록 char 로 적어주지만 "차" 라고 읽으면? 아주 옛날에 코딩을 배운 사람
// 캐릭터로 읽는것이 맞다.
// 값을 저장할 떄에는 값을 ' ' 로 감싸준다.

// char의 경우, 실제로 ASCII 코드라는 특수한 문자값 표를 사용하기
// 때문에, 숫자로 글자를 표현할 수 있다.
public class Ex09Character {
    public static void main(String[] args){
        // char 타입의 변수 myChar에 65라는 값을 저장해라
        char myChar = 65;

        //myChar의 현재값을 출력해라
        System.out.println("myChar의 현재 값");
        System.out.println(myChar);

    }

}
