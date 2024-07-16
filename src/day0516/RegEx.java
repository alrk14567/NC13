package day0516;
// 정규표현식(Regular Expression)
// 정규표현식이란, 어떠한 String 값이 특정 패턴을 만족하는지 체크하는지 확인할 때 사용하는 것으로써, 특정 패턴을 식으로 표현한 것이다.
public class RegEx {
    public static void main(String[] args) {
        // 정규표현식의 경우, 시작은^ 끝은 $로 표현한다.
        // 만약 검사할 String 값이 "ABC" 인지 확인하고 싶다면
        // ^ABC$ 라고 적어주게된다.
        String a ="ABC";
        System.out.println(a.matches("^ABC$"));
        // 만약 우리가 알파벳이 여러번 나오는지 확인하고 싶다면?
        System.out.println("\"A1\" ->" +"A1".matches("^[A-Za-z]+$"));
        // []의 의미: 그 안의 있는 글자범위 안에 글자를 포함해야 함
        // A-Z의 의미: 알파벳 대문자 A부터 Z
        // a=z의 의미: 알파벳 소문자 a부터 z
        // +의 의미: 왼쪽[]의 1개 이상 있어야함
        // ^[A-Za-z]+$의 의미: 스트링이 대문자A부터 Z, 소문자 a부터 z까지 로만 여러글자로 이루어져야 한다.

        // 만약 우리가 값이 숫자로만 이루어져 있는지 확인하고 싶다면??
        System.out.println("\"123i45\"-> "+"123i45".matches("^\\d+$"));

        // 값이 숫자로 시작하고 알파벳으로 끝나는지 확인하고 싶은 경우
        System.out.println("123ABC ->"+"123ABC".matches("^\\d+[A-Za-z]+$"));
        System.out.println("123 ->"+"123".matches("^\\d+[A-Za-z]+$"));
        System.out.println("ABC ->"+"ABC".matches("^\\d+[A-Za-z]+$"));
        System.out.println("ABC123 ->"+"ABC123".matches("^\\d+[A-Za-z]+$"));
        System.out.println("===============================================");
        System.out.println("123ABC ->"+"123ABC".matches("^\\d+[A-Za-z]+$"));
        System.out.println("123 ->"+"123".matches("^\\d+$"));
        System.out.println("ABC ->"+"ABC".matches("^[A-Za-z]+$"));
        System.out.println("ABC123 ->"+"ABC123".matches("^[A-Za-z]+\\d+$"));

        // 값이 순서와 상관없이 알파벳, 숫자 5글자이상으로 이루어졌는지 체크
        System.out.println("123ABC ->"+"123ABC".matches("^[A-Za-z0-9]{5,}$"));  // {5,10}  5글자 이상 10글자 이하
        System.out.println("123 ->"+"123".matches("^[A-Za-z0-9]{5,}$"));
        System.out.println("ABC ->"+"ABC".matches("^[A-Za-z0-9]{5,}$"));
        System.out.println("ABC123 ->"+"ABC123".matches("^[A-Za-z0-9]{5,}$"));

        // 한글로만 이루어졌는지
        System.out.println("가나다 ->"+"가나다".matches("^[가-힣]+$"));
        System.out.println("1가나다 ->"+"1가나다".matches("^[가-힣]+$"));
        System.out.println("가a나다 ->"+"가a나다".matches("^[가-힣]+$"));
    }
}
