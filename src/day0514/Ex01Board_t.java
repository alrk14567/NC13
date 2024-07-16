package day0514;


import types.Board;
import types.Board_t;
import util.ScannerUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01Board_t {
    public static ArrayList<Board_t> boardList=new ArrayList<>();
    public static int nextId=1;

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        String message="1.입력 2. 목록 3. 종료";
        while(true) {
            int userChoice = ScannerUtil.nextInt(SCANNER,message);
            if (userChoice==1) {
                insert();
            } else if (userChoice==2) {
                printList();
            } else if (userChoice==3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }

    public static void insert() {
        Board_t b = new Board_t();
        b.setId(nextId++);                                    //b.id = nextId++;
        String message;
        message="글의 제목을 입력해주세요.";
        b.setTitle(ScannerUtil.nextLine(SCANNER,message));     //b.title=ScannerUtil.nextLine(SCANNER,message);

        message="글의 작성자를 입력해주세요.";
        b.setWriter(ScannerUtil.nextLine(SCANNER,message));    //b.writer=ScannerUtil.nextLine(SCANNER,message);
        message="글의 내용을 입력해주세요.";
        String content=ScannerUtil.nextLine(SCANNER,message);
        b.setContent(content);

        boardList.add(b);
    }

    public static void printList() {
        if (boardList.isEmpty()) {
            System.out.println("아직 입력된 게시글이 존재하지 않습니다.");
        } else {
            /*for(int i=0;i<boardList.size();i++) {
                Board_t b=boardList.get(i);
                System.out.printf("%d. %s - %s\n",b.id,b.title,b.writer);
            }*/

            // 위의 코드를 간략화 시켜보자
            for (Board_t b: boardList) {                                        // 보드리스트에 있는 애들이 다 나올때 까지인데 객체의 수?? 사이즈로 봐야하나?? 대신 중간에 사이즈가 바뀌는게
                System.out.printf("%d. %s - %s\n",b.getId(),b.getTitle(),b.getWriter());       // 적용이 되지는 않는다.
            }

            String message="상세보기할 글의 번호나 뒤로가시려면 0을 입력해주세요.";
            int userChoice = ScannerUtil.nextInt(SCANNER,message);

            while(!validate(userChoice)) {
                System.out.println("잘 못 입 력 하 셨 습 니 다.");
                userChoice=ScannerUtil.nextInt(SCANNER,message);
            }

            if (userChoice !=0) {
                printOne(userChoice);
            }
        }
    }

    public static void printOne(int id){
        Board_t b= selectOne(id);
        b.printInfo();
        String message="1. 수정 2. 삭제 3. 목록으로";
        int userChoice = ScannerUtil.nextInt(SCANNER,message,1,3);
        if (userChoice==1) {
            update(id);
        } else if (userChoice==2) {
            delete(id);
        } else if (userChoice==3) {
            printList();
        }
    }

    public static Board_t selectOne(int id) {

        int index=boardList.indexOf(new Board_t(id));

        if (index!=-1) {
            return boardList.get(index);
        } else{
            return null;
        }
    }

    public static boolean validate(int id) {
        if (id==0) {
            return true;
        }                                                // --> Board_t b=new Board_t(); 다음줄의 b.id=id; 를 한줄로 만들면 Board_t b= new Board_t(id); 거기서 리턴까지 줄이면 아래
        return boardList.contains(new Board_t(id));
    }

    public static void update(int id) {
        Board_t b= selectOne(id);
        String message;
        message="새로운 제목을 입력해주세요.";
        String title=ScannerUtil.nextLine(SCANNER,message);
        b.setTitle(title);
        message="새로운 내용을 입력해주세요.";
        b.setContent(ScannerUtil.nextLine(SCANNER,message));
        printOne(id);
    }

    public static void delete(int id) {
        String message= "정말로 삭제하시겠습니까? Y/N";
        String answer=ScannerUtil.nextLine(SCANNER,message);
        if (answer.equalsIgnoreCase("Y")) {
            boardList.remove(new Board_t(id));
            printList();
        } else {
            printOne(id);
        }
    }
}
