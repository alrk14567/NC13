package day0514;
// 게시판 클래스와 어레이리스트를 활용하여 게시판 프로그램을 작성하시오

import util.ScannerUtil;

import types.Board;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01Board {
    public static ArrayList<Board> list = new ArrayList<>();
    public static int nextId = 1;

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
    }

    // 초기 화면
    public static void showMenu() {
        String message = "1. 입력 2. 게시판 목록 3. 종료";
        while (true) {
            int userChoice = ScannerUtil.nextInt(SCANNER, message);

            if (userChoice == 1) {
                //입력 메서드
                insert();
            } else if (userChoice == 2) {
                //출력 메서드
                printList();
            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }

    // 입력 메서드
    public static void insert() {
        Board s = new Board();
        s.id = nextId++;
        String message = "작성자의 닉네임을 입력하세요.";
        s.name = ScannerUtil.nextLine(SCANNER, message);
        message = "글의 제목을 입력하세요.";
        s.title = ScannerUtil.nextLine(SCANNER, message);
        message = "글의 내용을 입력하세요.";
        s.textIn = ScannerUtil.nextLine(SCANNER, message);
        list.add(s);
    }

    // 게시판 목록 메서드
    public static void printList() {
        if (list.isEmpty()) {
            System.out.println("아직 게시글이 없습니다.");
        } else {
            for (int i = 0; i < list.size(); i++) {
                Board s = list.get(i);
                System.out.printf("%d  %10s     %s\n", s.id, s.title, s.name);
            }
            String message = "보고싶은 글의 번호를 입력하시거나 뒤로가시려면 0번을 누르세요.";
            int userChoice = ScannerUtil.nextInt(SCANNER, message);

            while (!validate(userChoice)) {
                System.out.println("잘못된 번호입니다.");
                printList();
            }

            if (userChoice != 0) {
                // 상세보기 메서드
                printOne(userChoice);
            }
        }
    }

    // 번호가 게시글의 번호 또는 0번인지 판단하는 메서드
    public static boolean validate(int id) {
        if (id == 0) {
            return true;
        }
        Board s = new Board();
        s.id = id;
        return list.contains(s);
    }

    // 맞는 번호의 글을 출력하는 메서드
    public static void printOne(int id) {

        Board s = selectOne(id);                // id에 해당하는 객체 하나를 s 에 투영
        if (s==null) {
            System.out.println("잘못된 입력값입니다.");
            System.out.println("게시판 목록으로 돌아갑니다.");
            printList();
        } else {
            s.printInfo();
            String message = "1. 수정 2. 삭제 3. 뒤로가기 ";
            int userChoice = ScannerUtil.nextInt(SCANNER, message, 1, 3);
            if (userChoice == 1) {
                // 업데이트 메서드
                update(id);
            } else if (userChoice == 2) {
                // 삭제 메서드
                delete(id);
            } else if (userChoice == 3) {
                printList();
            } /*else if (userChoice == 4) {
                showMenu();
            }*/
        }


    }

    public static void update(int id) {
        Board s = selectOne(id);
        String message="작성자의 닉네임을 수정하세요.";
        s.name = ScannerUtil.nextLine(SCANNER,message);
        message = "글의 제목을 수정하세요.";
        s.title = ScannerUtil.nextLine(SCANNER, message);
        message = "글의 내용을 수정하세요.";
        s.textIn = ScannerUtil.nextLine(SCANNER, message);
        //list.set(id, s);
        printOne(id);
    }

    public static void delete(int id) {
        Board s = selectOne(id);
        String message = "정말로 삭제하시겠습니까? Y/N";
        String answer = ScannerUtil.nextLine(SCANNER, message);
        if (answer.equalsIgnoreCase("Y")) {
            list.remove(s);
            printList();
        } else {
            printOne(id);
        }
    }

    public static Board selectOne(int id) {
        Board s = new Board();
        s.id = id;

        int index = list.indexOf(s);

        if (index==-1) {
            return null;
        } else{
            return list.get(index);
        }
    }

}
