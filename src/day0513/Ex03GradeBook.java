package day0513;
// 학생 5명을 관리하는 프로그램을 작성하시오 (=정적할당 배열을 사용하시오)
// 단, 학생 정보를 수정/삭제할 필요없이
// 5명 까지만 입력 가능하고 출력은 입력된 학생들만 출력되는 프로그램으로 만드시오
// 내가한거

import java.util.Scanner;

import util.ScannerUtil;
public class Ex03GradeBook {
    public static int[] id;
    public static String[] name;
    public static int[] korean;
    public static int[] english;
    public static int[] math;
    public static int[] sum;
    public static double[] average;

    public static final Scanner SCANNER=new Scanner(System.in);

    public static void main(String[] args) {

        while(true) {
            String message="1. 입력 2. 출력 3.종료";
            int choiceNumber=ScannerUtil.nextInt(SCANNER,message);

            if(choiceNumber==1){
                //입력
                if(id.length>5){
                    System.out.println("더이상 입력할 수 없습니다.");
                } else{
                    inPut();


                }
            }else if(choiceNumber==2){
                // 출력
                if(id.length!=0){
                    pointOut();
                }else {
                    System.out.println("기록이 없습니다.");
                }

            } else if (choiceNumber==3){
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }

        }

    }

    public static void inPut() {
        String message="학생의 번호는?";
        int id=ScannerUtil.nextInt(SCANNER,message);
        message="학생의 이름은?";
        String name=ScannerUtil.nextLine(SCANNER,message);
        message="국어 점수: ";
        int korean =ScannerUtil.nextInt(SCANNER,message);
        message="영어 점수: ";
        int english =ScannerUtil.nextInt(SCANNER,message);
        message="수학 점수: ";
        int math =ScannerUtil.nextInt(SCANNER,message);


    }

    public static void pointOut(){
        for(int i=0;i<id.length;i++){
            System.out.printf("번호: %02d번 이름: %s\n",id[i],name[i]);
            System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n",korean[i],english[i],math[i]);
            System.out.printf("총점: %03d점 평균: %06.2f점\n",sum[i], average[i]);
        }

    }


}
