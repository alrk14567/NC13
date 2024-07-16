package studyEx1;

public class Variable {
    public static void main(String[] args) {
        int a=1;
        System.out.println(a);

        double b= 1.1;                  //int 는 안댐
        System.out.println(b);

        String c = "Hello World";
        System.out.println(c);

        String f = Integer.toString(1);           //숫자를 문자로 바꿔줌
        System.out.println(f.getClass());            //f.getClass 변수의 타입이 뭔지
    }
}
