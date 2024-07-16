package types;

public class Writer {
    private int number;
    private String author;

    public Writer(int number, String author) {                              // Writer 클래스의 생성자 (파라미터변수들이 있는
        this.number = number;
        this.author = author;
    }

    public int getNumber() {                                                // Writer 타입의 넘버 값을 반환해 주는 getter
        return number;
    }

    public void setNumber(int number) {                                     // Writer 타입의 넘버 값을 입력받는 setter
        this.number = number;
    }

    public void write(String name) {                                        // Writer 타입에서 사용 가능 한 write 메서드
        System.out.println(name + "가 글을 씁니다.");
    }

    public void read() {                                                     // read메서드
        System.out.println("저는 지금까지 좋아하는 작가인" + author+"의 글을" + number + "번 읽었어요");
    }

}
