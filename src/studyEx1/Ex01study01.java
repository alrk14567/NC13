package studyEx1;
//https://sso-feeling.tistory.com/79 예제 보고 한것
public class Ex01study01 {

    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main(): x= " + d.x);
        change(d.x);
        System.out.println("change(d.x) 메서드 호출 후");
        System.out.println("main(): x "+d.x);
        int x= 5;
        System.out.println("main(): x "+d.x);
        System.out.println("main(): x "+x);
    }

    public static void change(int x) {
        x = 1000;
        System.out.println("change(): x= "+x);
        return;
    }
    static class Data{
        int x;
    }
}
