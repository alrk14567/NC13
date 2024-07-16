package types;

import java.sql.SQLOutput;

public class Board_t {
    private int id;
    private String title;
    private String writer;
    private String content;

    // 필드 캡슐화에 따른 getter/setter 만들기 Ex02Capsule과 이어짐 이부분만
    // getter 메소드 만드는 방법
    // public 필드타입 get필드이름() {                      --> 필드 타입 우리가 만든 보드나 학생 같은거 필드 이름은 말그대로 변수이름
    //      return 필드이름;
    // }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getWriter() {
        return writer;
    }
    public String getContent() {
        return content;
    }
    // setter 메소드 만드는 방법
    // public void set필드이름(필드타입 필드이름) {
    //      this.필드이름=필드이름;
    // }
    public void setId(int id) {
        this.id=id;
    }
    public void setTitle(String title) {
        this.title=title;
    }
    public void setWriter(String writer) {
        this.writer=writer;
    }
    public void setContent(String content) {
        this.content=content;
    }


    // id를 파라미터로 받아 새로운 객체에 초기화 하는 생성자
    public Board_t(int id) {
        this.id = id;
    }

    public Board_t() {

    }

    // equals 재정의
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Board_t) {
            Board_t b = (Board_t) o;
            return id == b.id;
        }
        return false;
    }

    public void printInfo() {
        System.out.println("=========================================");
        System.out.println("번호: " + id);
        System.out.println("제목: " + title);
        System.out.println("작성자: " + writer);
        System.out.println("-----------------------------------------");
        System.out.println("내용: " + content);
        System.out.println("=========================================\n");
    }
}
