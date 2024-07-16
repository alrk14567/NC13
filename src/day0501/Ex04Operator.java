package day0501;

// 논리연산자
// 논리 연산자는 2개의 boolean 값에 대한 연산을 한다.
// 논리 연산자에는 AND, OR, NOT 3가지 연산자가 있다.
// AND(&&): 2개의 boolean이 모두 true 일때에만 true가 결과값으로 나온다.
// OR(||): 2개의 boolean 중 하나라도 true이면 결과값이 true가 나온다.
//         | 은 shift+\ 을 입력하면 된다.
// NOT(!): true는 false로, false는 true로 연산한다.
public class Ex04Operator {
    public static void main(String[] args) {
        // int a, b, c 를 만들고 각각 2, 3, 4로 초기화해보자
        int a = 2, b = 3, c = 4;
        // b가 a보다 크고 c보다 작은지 확인해보자
        // a < b < c
        //System.out.println("a < b < c:" + (a < b < c));
        // 위의 코드는 에러가 발생한다.
        // 왜냐하면 코드는 우선순위가 같을 경우, 왼쪽에서 오른쪽으로 실행이 되는데
        // (a < b < c) 의 경우
        // 한줄이지만
        // a < b 를 먼저 실행
        // 그리고 위의 결과값과 c를 비교하는 코드가 되어버린다!
        // 즉, a < b -> true
        // true 가 int 변수 c의 현재 값 보다 작습니까? -> 컴퓨터: ?????
        // 따라서 위의 같은 코드는 우리가 일반적인 수학적 비교가 아닌 논리 연산자를 통한 비교를 해야한다.

        System.out.println("a < b && b < c: " + (a < b && b < c));

        // NOT 연산자의 경우, 할당 연산자가 아니기 때문에
        // 코드를 실행하는 시점에서만 값을 반전시키지 실제 저장된 값을 바꾸지 않는다.
        boolean isTrue = true;
        System.out.println("!isTrue: " + !isTrue);
        System.out.println("isTrue: " + isTrue);


    }
}
