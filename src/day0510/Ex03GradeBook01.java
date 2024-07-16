package day0510;
// 전역 변수와 상수를 사용한 학생 성적 관리 프로그램
import java.util.Scanner;
import util.ArrayUtil;
import util.ScannerUtil;

public class Ex03GradeBook01 {
    // 각종 정보를 담을 배열
    public static int[] idArray = new int[0];
    public static String[] nameArray = new String[0];
    public static int[] koreanArray = new int[0];
    public static int[] englishArray = new int[0];
    public static int[] mathArray = new int[0];

    // 전역 상수
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final int SCORE_MIN = 0;
    public static final int SCORE_MAX = 100;
    public static final int SUBJECT_SIZE = 3;

    public static void main(String[] args) {
        showMenu();
    }

    // 메뉴를 보여주는 메소드
    public static void showMenu() {
        String message= "1. 학생 입력 2. 전체 출력 3. 종료";
        while(true) {
            message= "1. 학생 입력 2. 전체 출력 3. 종료";
            int userChoice = ScannerUtil.nextInt(SCANNER,message);
            if (userChoice==1) {
                //학생 입력 메소드 호출
                message="학생의 번호는?";
                idArray=ArrayUtil.add(idArray,inPut(message,SCANNER));
                message="학생의 이름은?";
                nameArray=ArrayUtil.add(nameArray,inPutLine(message,SCANNER));
                message="학생의 국어점수는?";
                koreanArray=ArrayUtil.add(koreanArray,inPut(message,SCANNER,SCORE_MIN,SCORE_MAX));
                message="학생의 영어점수는?";
                englishArray=ArrayUtil.add(englishArray,inPut(message,SCANNER,SCORE_MIN,SCORE_MAX));
                message="학생의 수학점수는?";
                mathArray=ArrayUtil.add(mathArray,inPut(message,SCANNER,SCORE_MIN,SCORE_MAX));

            } else if (userChoice==2){
                // 전체출력 메소드 호출
                outPut();
            } else if (userChoice==3){
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }

    public static int inPut(String message,Scanner SCANNER) {

        int element=ScannerUtil.nextInt(SCANNER,message);
        return element;
    }

    public static int inPut(String message,Scanner SCANNER,int min, int max) {

        int element=ScannerUtil.nextInt(SCANNER,message,min,max);
        return element;
    }


    public static String inPutLine(String message,Scanner SCANNER) {

        String element =ScannerUtil.nextLine(SCANNER,message);
        return element;
    }

    public static void outPut() {
        if (ArrayUtil.size(idArray) != 0) {
            for (int i = 0; i < ArrayUtil.size(idArray); i++) {
                int id = ArrayUtil.get(idArray, i);
                String name = ArrayUtil.get(nameArray, i);
                int korean = ArrayUtil.get(koreanArray, i);
                int english = ArrayUtil.get(englishArray, i);
                int math = ArrayUtil.get(mathArray, i);
                int sum = korean + english + math;
                double average = (double) sum / 3;

                System.out.printf("번호: %2d번 이름: %s\n", id, name);
                System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math);
                System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);
            }
        } else{
            System.out.println("아직 기록이 되지 않았습니다.");
        }
    }


}
