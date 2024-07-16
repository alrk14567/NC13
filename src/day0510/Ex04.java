package day0510;
// 게시판 프로그램을 작성하시오.
// 게시글에는 글 번호, 작성자 닉네임, 제목, 내용이 들어가야 합니다.

import java.sql.SQLOutput;
import java.util.Scanner;

import util.ArrayUtil;
import util.ScannerUtil;

public class Ex04 {
    public static int[] idArray = new int[0];
    public static String[] nameArray = new String[0];
    public static String[] titleArray = new String[0];
    public static String[] textArray = new String[0];

    public static int nextId = 1;

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        String message = "1. 글 게시하기 2. 게시판 보기 3. 종료하기";
        while (true) {
            int userChoice = ScannerUtil.nextInt(SCANNER, message);

            if (userChoice == 1) {
                // 글 게시하기 메서드
                inPutText();
            } else if (userChoice == 2) {
                // 게시판을 보는 메서드
                textList();
            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }

    public static void inPutText() {

        idArray = ArrayUtil.add(idArray, nextId++);

        String message = "작성자의 닉네임을 입력해주세요.";
        nameArray = ArrayUtil.add(nameArray, ScannerUtil.nextLine(SCANNER, message));

        message = "글의 제목을 입력해주세요.";
        titleArray = ArrayUtil.add(titleArray, ScannerUtil.nextLine(SCANNER, message));

        message = "글의 내용을 입력해주세요.";
        textArray = ArrayUtil.add(textArray, ScannerUtil.nextLine(SCANNER, message));
    }

    public static void textList() {
        if (ArrayUtil.size(idArray) == 0) {
            System.out.println("게시글이 없습니다.");
        } else {
            System.out.println("게시판 현황");
            for (int i = 0; i < idArray.length; i++) {

                System.out.printf("글 번호: %d         작성자: %s\n", idArray[i], nameArray[i]);
                System.out.printf("제목: %s\n", titleArray[i]);
            }
            String message = "원하는 글의 번호를 입력하세요. 0번을 누르시면 뒤로 갑니다.";
            int textId = ScannerUtil.nextInt(SCANNER, message, 0, ArrayUtil.size(idArray));
            if(!ArrayUtil.contains(idArray,textId)){
                System.out.println("삭제된 게시물입니다.");
                textList();
            } else if (textId != 0) {
                //글 내용이 나오는 메서드 작성
                textOne(textId);
            } else if (textId == 0) {
                showMenu();
            }
        }
    }

    public static void textOne(int number) {
        int index = ArrayUtil.indexOf(idArray, number);
        System.out.printf("글 번호: %d        %s              작성자:  %s\n", idArray[index], titleArray[index], nameArray[index]);
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.printf("                                    글 내용                                              ");
        System.out.println("");
        System.out.printf("%s\n", textArray[index]);

        String message = "1. 수정하기 2. 삭제하기 3. 이전으로 0. 처음으로";
        int userChoice = ScannerUtil.nextInt(SCANNER, message, 0, 3);
        if (userChoice == 0) {
            showMenu();
        } else if (userChoice == 1) {
            // 업데이트 하는 메서드
            update(number);
            textOne(number);
        } else if (userChoice == 2) {
            // 삭제하는 메서드
            delete(number);
            textList();
        } else if (userChoice == 3) {
            textList();
        }
    }

    public static void update(int number) {
        int index = ArrayUtil.indexOf(idArray, number);
        String message = "글의 제목을 수정해주세요.";
        String title = ScannerUtil.nextLine(SCANNER, message);
        ArrayUtil.set(titleArray, index, title);

        message = "글의 내용을 수정해주세요.";
        String text = ScannerUtil.nextLine(SCANNER, message);
        ArrayUtil.set(textArray, index, text);
    }

    public static void delete(int number) {
        int index = ArrayUtil.indexOf(idArray, number);
        String message = "정말로 삭제하시겠습니까? [Y/N]";
        String answer = ScannerUtil.nextLine(SCANNER, message);

        if (answer.equalsIgnoreCase("Y")) {
            idArray = ArrayUtil.remove(idArray, index);
            nameArray = ArrayUtil.remove(nameArray, index);
            titleArray = ArrayUtil.remove(titleArray, index);
            textArray = ArrayUtil.remove(textArray, index);

        } else {
            textOne(index);
        }

    }


}
