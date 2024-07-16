package types;

public class Board {

    public int id;
    public String name;
    public String title;
    public String textIn;

    // 글의 번호, 제목, 작성자, 내용을 출력해주는 코드
    public void printInfo() {
        System.out.printf(" %d        %s               작성자:%s\n", id, title, name);
        System.out.println("---------------------------------------------------------");
        System.out.printf("%s\n", textIn);
    }

    public Board(){
        id = -1;
        name = "입력 안됨";
        title = "입력 안됨";
        textIn = "입력 안됨";
    }

    public Board(int id, String name, String title, String textIn) {
        this.id=id;
        this.name=name;
        this.title=title;
        this.textIn=textIn;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) {                  //파라미터와 this 변수이름(객체?)를 비교
            return true;
        }

        if (obj instanceof Board) {         // 타입이 같은지 확인하고
            Board s= (Board) obj;           // 타입이 같으면 id 가 같으면 같다?
            return id==s.id;
        }
        return false;
    }
}
