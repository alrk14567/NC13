package day0510;
// 전역 변수와 상수를 사용한 학생 성적 관리 프로그램

import java.util.Scanner;

import util.ArrayUtil;
import util.ScannerUtil;


public class Ex03GradeBook01_01 {// 각종 정보를 담을 배열
    public static int[] idArray = new int[0];
    public static String[] nameArray = new String[0];
    public static int[] koreanArray = new int[0];
    public static int[] englishArray = new int[0];
    public static int[] mathArray = new int[0];
    // 다음 입력될 학생의 번호를 저장한 전역 변수
    public static int nextId = 1;

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
        String message = "1. 학생 입력 2. 전체 출력 3. 종료";
        while (true) {
            int userChoice = ScannerUtil.nextInt(SCANNER, message);
            if (userChoice == 1) {
                //학생 입력 메소드 호출
                insert();
            } else if (userChoice == 2) {
                // 전체출력 메소드 호출
                printList();

            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }

    // 학생의 정보를 입력하는 메소드
    public static void insert() {
        String message;

        //message = "학생의 번호를 입력해주세요.";

        idArray = ArrayUtil.add(idArray, nextId++);
        message = "학생의 이름을 입력해주세요.";
        nameArray = ArrayUtil.add(nameArray, ScannerUtil.nextLine(SCANNER, message));

        message = "학생의 국어 점수를 입력해주세요.";
        koreanArray = ArrayUtil.add(koreanArray, ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX));

        message = "학생의 영어 점수를 입력해주세요.";
        englishArray = ArrayUtil.add(englishArray, ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX));

        message = "학생의 수학 점수를 입력해주세요.";
        mathArray = ArrayUtil.add(mathArray, ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX));
    }

    // 학생 정보 출력 메소드
    public static void printList() {
        for (int i = 0; i < idArray.length; i++) {
            String name = ArrayUtil.get(nameArray, i);
            int id = ArrayUtil.get(idArray, i);

            System.out.printf("%d. %s\n", id, name);
        }

        String message = "상세보기할 학생의 번호나 뒤로 가시려면 0을 입력해 주세요.";
        int userChoice = ScannerUtil.nextInt(SCANNER, message);
        while (!validate(userChoice)) {
            System.out.println("잘못 입력하셨습니다.");
            userChoice = ScannerUtil.nextInt(SCANNER, message);
        }
        if (userChoice!=0){
            // 학생 개별 보기 메소드 호출
            printOne(userChoice);
        }

    }

    // 목록 보기에서 사용자가 입력한 값이 유효한 값인지 체크하여 유효하면 true 아니면 false가 리턴되는 메소드
   /* public static boolean print1(Scanner SCANNER) {

        int temp=ScannerUtil.nextInt(SCANNER,"학생의 번호를 입력하세요.");

        return ArrayUtil.contains(idArray,temp);
    }*/

    public static boolean validate(int value) {

        if (value == 0) {
            return true;
        }

        return ArrayUtil.contains(idArray, value);
    }


    public static void printOne(int id) {
        int index = ArrayUtil.indexOf(idArray,id);
        String name = ArrayUtil.get(nameArray,index);
        int korean = ArrayUtil.get(koreanArray,index);
        int english= ArrayUtil.get(englishArray,index);
        int math = ArrayUtil.get(mathArray,index);

        int sum = korean+english+math;
        double average = (double)sum/SUBJECT_SIZE;

        System.out.println("=======================================");
        System.out.println(name+" 학생의 정보");
        System.out.println("---------------------------------------");
        System.out.printf("번호: %2d번 이름: %s\n",id,name);
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n",korean,english,math);
        System.out.printf("총점: %03d점 평균: %06.2f점\n",sum,average);
        System.out.println("=======================================");
        String message = "1. 수정 2. 삭제 3. 뒤로";
        int userChoice = ScannerUtil.nextInt(SCANNER,message,1,3);
        if (userChoice==1) {
            //학생 수정 메소드 실행
            update(id);
            printOne(id);
        } else if (userChoice==2) {
            // 학생 삭제 메소드 실행
            delete(id);

        } else if (userChoice==3) {
            // 학생 리스트를 보는 것을 다시 실행시켜준다.
            printList();
        }
    }

    public static void update(int id) {
        int index=ArrayUtil.indexOf(idArray,id);
        String message;
        message ="학생의 이름을 다시 입력해주세요.";
        String name = ScannerUtil.nextLine(SCANNER,message);
        ArrayUtil.set(nameArray,index,name);

        message ="학생의 국어 점수를 다시 입력해주세요.";
        int korean= ScannerUtil.nextInt(SCANNER,message,SCORE_MIN,SCORE_MAX);
        ArrayUtil.set(koreanArray,index,korean);

        message ="학생의 영어 점수를 다시 입력해주세요.";
        int english= ScannerUtil.nextInt(SCANNER,message,SCORE_MIN,SCORE_MAX);
        ArrayUtil.set(englishArray,index,english);

        message ="학생의 수학 점수를 다시 입력해주세요.";
        int math= ScannerUtil.nextInt(SCANNER,message,SCORE_MIN,SCORE_MAX);
        ArrayUtil.set(mathArray,index,math);
    }

    public static void delete(int id) {
        int index = ArrayUtil.indexOf(idArray,id);
        String message = "정말로 삭제하시겠습니까? Y/N";
        String answer = ScannerUtil.nextLine(SCANNER,message);
        // 스트링 값 비교를 할때 대소문자 없이 같으면 true, 다르면 false를 확인하고 싶다면?
        // equalsIgnoreCase
        if (answer.equalsIgnoreCase("Y")) {
            // 사용자가 동의했으므로 삭제
            idArray=ArrayUtil.remove(idArray,index);
            nameArray=ArrayUtil.remove(nameArray,index);
            koreanArray=ArrayUtil.remove(koreanArray,index);
            englishArray=ArrayUtil.remove(englishArray,index);
            mathArray=ArrayUtil.remove(mathArray,index);
            printList();
        } else {
            // 상세보기를 다시 실행시켜준다.
            printOne(id);
        }

    }

 //클래스 마지막줄
}

