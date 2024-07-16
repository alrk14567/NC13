package day0513;
// 학생 5명을 관리하는 프로그램을 작성하시오 (=정적할당 배열을 사용하시오)
// 단, 학생 정보를 수정/삭제할 필요없이
// 5명 까지만 입력 가능하고 출력은 입력된 학생들만 출력되는 프로그램으로 만드시오
// 선생님이 한거

import java.util.Scanner;

import util.ScannerUtil;
import types.Student;

public class Ex03GradeBook_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 학생의 정보를 저장할 Student[]
        Student[] students = new Student[5];
        // 다음 입력할 index를 저장한 nextIndex
        int nextIndex = 0;

        while (true) {
            String message = "1. 입력 2. 출력 3. 종료";
            int userChoice = ScannerUtil.nextInt(scanner, message);

            if (userChoice == 1) {
                if (nextIndex < 5) {
                    message = "학생의 번호를 입력해주세요.";
                    int id = ScannerUtil.nextInt(scanner, message);
                    message = "학생의 이름을 입력해주세요.";
                    String name = ScannerUtil.nextLine(scanner, message);
                    message = "학생의 국어 점수를 입력해주세요.";
                    int korean = ScannerUtil.nextInt(scanner, message, 0, 100);
                    message = "학생의 영어 점수를 입력해주세요.";
                    int english = ScannerUtil.nextInt(scanner, message, 0, 100);
                    message = "학생의 수학 점수를 입력해주세요.";
                    int math = ScannerUtil.nextInt(scanner, message, 0, 100);

                    students[nextIndex] = new Student();
                    students[nextIndex].id = id;
                    students[nextIndex].name = name;
                    students[nextIndex].korean = korean;
                    students[nextIndex].english = english;
                    students[nextIndex].math = math;

                    nextIndex++;
                } else {
                    System.out.println("더이상 입력하실 수 없습니다.");
                }

            } else if (userChoice == 2) {
                if(nextIndex>0) {
                    for(int i=0;i<nextIndex;i++) {
                        students[i].printInfo();
                    }
                }else {
                    System.out.println("아직 입력된 학생이 존재하지 않습니다.");
                }

            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }

    }
}
