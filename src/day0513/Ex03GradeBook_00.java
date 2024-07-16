package day0513;
// 학생 5명을 관리하는 프로그램을 작성하시오 (=정적할당 배열을 사용하시오)
// 단, 학생 정보를 수정/삭제할 필요없이
// 5명 까지만 입력 가능하고 출력은 입력된 학생들만 출력되는 프로그램으로 만드시오

import java.util.Scanner;

import types.Student;
import util.ScannerUtil;

public class Ex03GradeBook_00 {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static int index = 0;
    //public static int id=index+1;
    //public static Student[] students = new Student[5];

    public static final int SCORE_MIN = 0;
    public static final int SCORE_MAX = 100;

    public static void main(String[] args) {
        Student[] students= new Student[5];
        int[] a=new int[10];


        while (true) {
            //Student[] students = new Student[5];
            String message = "1. 입력 2. 출력 3.종료";
            int userChoice = ScannerUtil.nextInt(SCANNER, message);

            if (userChoice == 1) {
                // 입력하는거 메소드 없이
                if (index < 5) {
                    message = "학생의 번호를 입력하세요.";
                    int id = ScannerUtil.nextInt(SCANNER, message);
                    message = "학생의 이름을 입력하세요.";
                    String name = ScannerUtil.nextLine(SCANNER, message);
                    message = "학생의 국어 점수를 입력하세요.";
                    int korean = ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX);
                    message = "학생의 영어 점수를 입력하세요.";
                    int english = ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX);
                    message = "학생의 수학 점수를 입력하세요.";
                    int math = ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX);

                    students[index] = new Student();                    //다시 선언해야함
                    students[index].id = id;
                    students[index].name = name;
                    students[index].korean = korean;
                    students[index].english = english;
                    students[index].math = math;
                    index++;
                } else {
                    System.out.println("더 이상 기록할 수 없습니다.");
                }

            } else if (userChoice == 2) {
                // 출력하는거
                if (index == 0) {
                    System.out.println("기록된 값이 없습니다.");
                } else {
                    for (int i = 0; i < index; i++) {
                        students[i].printInfo();
                    }
                }

            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 갑사합니다.");
                break;
            }
        }
    }
}
