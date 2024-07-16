package day0508;

// 다차원 배열
// 우리가 배열의 정의를 다시 한번 살펴보자면
// "똑같은 데이터 타입 여러개를 모아둔 하나의 데이터타입" 이다.
// 즉, 배열 여러개를 모아둔 배열도 우리가 만들 수 있다.
// 이렇게 배열을 모아둔 배열을 우리가 2차원 배열, 3차원 배열 이라고 부르게 된다.
// 다차원 배열의 경우, 선언과 초기화를 할 시에 다음과 같이 한다/.
// 데이터타입[][] 이름 = new 데이터타입[배열의 갯수=행][각 배열의 길이=열]
// 단, 상황에 따라서는 각 배열의 길이는 우리가 따로 지정이 가능하다.
// 프로젝트 개발의 5단계
// 1. 요구사항 분석
// 2. 설계
// 3. 구현
// 4. 테스트
// 5. 유지 보수
public class Ex01MultiArray {
    public static void main(String[] args) {
        // 각 배열의 길이는 3이고 그러한 배열이 5개 모인
        // int의 2차원 배열을 만들어보자
        int[][] multiArray = new int[5][3];

        //mutliArray의 0번째 인덱스에 있는것은 무엇일까?
        System.out.println(multiArray[0]);
        System.out.println(multiArray[1]);
        // mutliArray는 int 배열이 모여있는 배열이기 때문에
        // 우리가 multiArray의 0번째 인덱스를 가리키면 0번째에 있는 int배열이 선택되는것이다.    => I@ 옆에 나오는게 저장 주소??

        // 만약 우리가 mutliArray의 2번째 배열의 1번 요소를 가리키고 싶다면 다음과 같이 적어주어야한다. 3행 2열의 위치에 있는
        System.out.println(multiArray[2][1]);

        // 우리가 만약 2차원 배열의 내용을 전부 출력하고 싶다면 무엇을 써야할까?
        // 중첩 for문
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                // multiArray[i].length -> multiArray의 i번째 배열의 길이

                // multiArray[i][j] -> i번째 배열의 j번째 요소
                System.out.printf("multiArray[%d][%d]= %d\n", i, j, multiArray[i][j]);

            }
        }

        // 가변형 배열
        // 가변형 배열이란, 2차원 이상의 배열에서 몇개가 모여있는 배열인지를 지정하지만
        // 각 배열의 길이는 사용을 할 때 따로 지정을 해서 길이가 다른 배열을 모아두는 방법이다.

        // int 배열이 4개 모여있는 2차원 배열 multiArray
        multiArray = new int[4][];
        // 이 상황에서 multiArray[0]의 값은? null 왜냐하면 길이가 저장이 되지 않았기 때문에??
        System.out.println(multiArray[0]);

        // 즉, 우리가 처음에 모여있는 각 배열의 길이까지 초기화한 경우,
        // ex) multiArray = new int[5][3]
        // 하나하나의 배열은 전부다 new int[3]이 실행되서 null이 아닌 상태지만,
        // 우리가 길이를 따로 지정하지 않았을 경우에는
        // 사용 전에 반드시 초기화를 한번씩 더 해주어야 한다.
        // multiArray의 0번째 배열은 크기가 3인 배열로 초기화해보자
        multiArray[0] = new int[3];
        // 1번째 배열은 크기가 7인 배열로 초기화해보자
        multiArray[1] = new int[7];
        // 2개의 길이를 출력해보자
        System.out.println(multiArray[0].length);
        System.out.println(multiArray[1].length);
        int count =0;
        for(int i=0; i<4;i++) {

            for(int j=0; j<3;j++){
                for (int k=1; k<7;k++){
                    count++;

                    //k for문 마지막
                }
                // j for문 마지막
            }
            // i for문 마지막
        }
        System.out.println(count);

    }
}
