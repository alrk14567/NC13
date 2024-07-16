package day0513;
// ArrayList를 사용하여 학생 관리 프로그램을 작성하시오
// 수정/삭제도 가능해야함
// 메소드 분리의 경우 가능할 경우 하시오
// 전역 변수는
// public static ArrayList<Stident> list = new ArrayList<> ()
// public static int nextId=1
// 2가지를 만들어서 사용하고 필요에 따라서 다양한 전역 상수를 직접만들어서 코딩하면 된다.

import types.Student;

import java.util.ArrayList;


import java.util.Scanner;

import util.ScannerUtil;

public class Ex04Gradebook02_00 {
    public static ArrayList<Student> list = new ArrayList<>();
    public static int nextId = 1;

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final int SCORE_MIN = 0;
    public static final int SCORE_MAX = 100;

    public static void main(String[] args) {
        // 메뉴 보여주는 메소드
        showMenu();
    }

    public static void showMenu() {
        while (true) {
            String message = "1. 입력 2. 목록 보여주기 3. 종료";
            int userChoice = ScannerUtil.nextInt(SCANNER, message);

            if (userChoice == 1) {
                // 입력 메소드
                insert();
            } else if (userChoice == 2) {
                // 목록 메소드
                pointList();
            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }

    public static void insert() {
        String message;
        Student s = new Student();
        s.id = nextId++;
        message = "학생의 이름을 입력해주세요.";
        s.name = ScannerUtil.nextLine(SCANNER, message);
        message = "학생의 국어 점수를 입력해주세요.";
        s.korean = ScannerUtil.nextInt(SCANNER, message,SCORE_MIN,SCORE_MAX);
        message = "학생의 영어 점수를 입력해주세요.";
        s.english = ScannerUtil.nextInt(SCANNER, message,SCORE_MIN,SCORE_MAX);
        message = "학생의 수학 점수를 입력해주세요.";
        s.math = ScannerUtil.nextInt(SCANNER, message,SCORE_MIN,SCORE_MAX);

        list.add(s);
    }

    public static void pointList() {
        if (list.size() == 0) {
            System.out.println("아직 기록이 없습니다.");
        } else {
            for (int i = 0; i < list.size(); i++) {
                Student s = new Student();
                s = list.get(i);
                System.out.printf("%d.  %s\n", s.id, s.name);
            }
            String message = "성적이 보고싶은 학생의 번호를 누르세요. 0번을 누르시면 이전 메뉴로 돌아갑니다.";
            int userChoice = ScannerUtil.nextInt(SCANNER, message);
            if (userChoice == 0) {
                showMenu();
            } else if (!list.contains(userChoice)) {
                System.out.println("잘못된 번호입니다.");
                pointList();
            } else if (list.contains(userChoice)) {
                pointOne(userChoice);
            }
        }
    }

    public static void pointOne(int id) {
        Student s=new Student();
        list.get(id).printInfo();

        String message="1. 수정 2. 삭제 3. 뒤로가기 4.초기 화면";
        int userChoice=ScannerUtil.nextInt(SCANNER,message,1,4);
        if(userChoice==1) {
            // 수정 메서드
            update(id);
        } else if (userChoice==2) {
            // 삭제 메서드
            delete(id);
        } else if (userChoice==3) {
            pointList();
        } else if (userChoice==4) {
            showMenu();
        }
    }

    public static void update(int id) {
        Student s = new Student();
        s.id=id;
        int index=list.indexOf(s);
        String message;
        message="학생의 이름을 입력하세요.";
        s.name=ScannerUtil.nextLine(SCANNER,message);
        message="학생의 국어 점수를 입력하세요.";
        s.korean=ScannerUtil.nextInt(SCANNER,message);
        message="학생의 영어 점수를 입력하세요.";
        s.english=ScannerUtil.nextInt(SCANNER,message);
        message="학생의 수학 점수를 입력하세요.";
        s.math=ScannerUtil.nextInt(SCANNER,message);
        list.set(index,s);
    }

    public static void delete(int id) {
        Student s= list.get(id);
        String message= "정말로 삭제하시겠습니까? Y/N";
        String answer=ScannerUtil.nextLine(SCANNER,message);
        /*System.out.println("정말로 삭제하시겠 습니까? Y/N");
        String answer=;*/
        if (answer.equalsIgnoreCase("Y")) {
            list.remove(s);
            pointList();
        } else {
            pointOne(id);
        }
    }

}
