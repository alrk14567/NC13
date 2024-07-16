package types;

public class Hobby {
    private Writer writer;            // Hobby클래스에서만 사용가능한 Writer 타입의 writer 변수 (넘버와 작가가 변수로 선언되어있음) 그런데 선언을 안해도 되네?? 이유가 같은 클래스여서??
    public Hobby(Writer writer) {                                           // Hobby클래스의 생성자 변수는 Writer 타입의 writer 변수
        this.writer = writer;
    }

    public void method1() {
        System.out.println("예제 메소드 1번입니다.");
        writer.read();
        writer.write("정기돈");
        System.out.println("예제 메소드 1번 끝\n");
    }

    public void method2() {
        System.out.println("예제 메소드 2번입니다.");
        writer.write("정기돈");
        writer.write("정기돈");
        System.out.println("예제 메소드 2번 끝\n");
    }
    public void method3() {
        System.out.println("예제 메소드 3번입니다.");
        writer.read();
        writer.read();
        System.out.println("예제 메소드 3번 끝\n");
    }
}
