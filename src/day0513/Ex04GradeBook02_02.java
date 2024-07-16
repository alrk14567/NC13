package day0513;

// ArrayList를 사용하여
// 학생 관리 프로그램을 작성하시오
// 수정/삭제도 가능해야함
// 메소드 분리의 경우 가능할 경우 하시오
// 전역변수는
// public static ArrayList<Student> list = new ArrayList<>()
// public static int nextId = 1
// 2가지를 만들어서 사용하시고
// 필요에 따라서는 다양한 전역상수를 직접 만들어서
// 코딩하시면 됩니다.
// 4시 30분까지

import types.Student;
import util.ScannerUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04GradeBook02_02 {
    public static ArrayList<Student> list = new ArrayList<>();
    public static int nextId = 1;

    public static final int SCORE_MIN = 0;
    public static final int SCORE_MAX = 100;
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        String message = "1. 입력 2. 목록 보기 3. 종료";
        while (true) {
            int userChoice = ScannerUtil.nextInt(SCANNER, message);

            if (userChoice == 1) {
                // 학생 입력 메소드 실행
                insert();
            } else if (userChoice == 2) {
                // 학생 목록 출력 메소드 실행
                printList();
            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }

        }
    }

    public static void insert() {
        // 학생의 정보를 임시로 저장할 Student 객체
        Student s = new Student();

        String message;

        // 학생의 번호 입력하기
        s.id = nextId++;

        // 학생의 이름 입력하기
        message = "학생의 이름을 입력해주세요.";
        s.name = ScannerUtil.nextLine(SCANNER, message);

        // 학생의 국어 점수 입력하기
        message = "학생의 국어 점수를 입력해주세요.";
        s.korean = ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX);

        // 학생의 영어 점수 입력하기
        message = "학생의 영어 점수를 입력해주세요.";
        s.english = ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX);

        // 학생의 수학 점수 입력하기
        message = "학생의 수학 점수를 입력해주세요.";
        s.math = ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX);

        list.add(s);
    }

    public static void printList() {
        if (list.isEmpty()) {
            System.out.println("아직 입력된 학생이 존재하지 않습니다.");
        } else {
            for (int i = 0; i < list.size(); i++) {
                Student s = list.get(i);
                System.out.printf("%d. %s\n", s.id, s.name);
            }
            String message = "상세보기할 학생의 번호나 뒤로 가실려면 0을 입력해주세요.";
            int userChoice = ScannerUtil.nextInt(SCANNER, message);

            while (!validate(userChoice)) {
                System.out.println("잘못 입력하셨습니다.");
                userChoice = ScannerUtil.nextInt(SCANNER, message);
            }

            if (userChoice != 0) {
                printOne(userChoice);
            }
        }
    }

    public static boolean validate(int id) {
        if (id == 0) {
            return true;
        }

        Student s = new Student();
        s.id = id;

        return list.contains(s);
    }

    public static void printOne(int id) {
        Student s = selectOne(id);
        if (s == null) {
            System.out.println("잘못된 번호입니다.");
            System.out.println("학생 목록 출력으로 돌아갑니다.");
            printList();
        } else {
            s.printInfo();
            String message = "1. 수정 2. 삭제 3. 뒤로 가기";
            int userChoice = ScannerUtil.nextInt(SCANNER, message, 1, 3);
            if (userChoice == 1) {
                // 수정 메소드 실행
                update(id);
            } else if (userChoice == 2) {
                // 삭제 메소드 실행
                delete(id);
            } else if (userChoice == 3) {
                printList();
            }
        }
    }

    public static void update(int id) {
        Student s = selectOne(id);
        String message;
        message = "학생의 새로운 이름을 입력해주세요.";
        s.name = ScannerUtil.nextLine(SCANNER, message);

        message = "학생의 새로운 국어 점수를 입력해주세요.";
        s.korean = ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX);

        message = "학생의 새로운 영어 점수를 입력해주세요.";
        s.english = ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX);

        message = "학생의 새로운 수학 점수를 입력해주세요.";
        s.math = ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX);

        printOne(id);
    }

    public static void delete(int id) {
        Student s = selectOne(id);
        String message = "정말로 삭제하시겠습니까? Y/N";
        String answer = ScannerUtil.nextLine(SCANNER, message);
        if (answer.equalsIgnoreCase("Y")) {
            list.remove(s);
            printList();
        } else {
            printOne(id);
        }
    }

    public static Student selectOne(int id) {
        Student s = new Student();
        s.id = id;

        int index = list.indexOf(s);

        if (index == -1) {
            return null;
        } else {
            return list.get(index);
        }
    }
}











