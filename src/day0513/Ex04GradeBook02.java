package day0513;
// ArrayList를 사용하여 학생 관리 프로그램을 작성하시오
// 수정/삭제도 가능해야함
// 메소드 분리의 경우 가능할 경우 하시오
// 전역 변수는
// public static ArrayList<Stident> list = new ArrayList<> ()
// public static int nextId=1
// 2가지를 만들어서 사용하고 필요에 따라서 다양한 전역 상수를 직접만들어서 코딩하면 된다.
// 4시 30분 까지

import java.util.ArrayList;
import java.util.Scanner;
import util.ScannerUtil;
import types.Student;

import static util.ArrayUtil.add;


public class Ex04GradeBook02 {
    public static ArrayList<Student> list = new ArrayList<>();
    public static int nextId=1;
    public static int nextIndex=0;
    public static final Scanner SCANNER=new Scanner(System.in);
    public static final int SCORE_MIN=0;
    public static final int SCORE_MAX=100;
    public final int SUBJECT_SIZE=3;
    public String name;
    public int korean;
    public int english;
    public int math;

    public static void main(String[] args){

        Student[] students=new Student[1];

        while(true) {
            String message="1. 입력 2. 출력 3. 종료";
            int userChoice=ScannerUtil.nextInt(SCANNER,message);

            if (userChoice==1) {
                // 입력 받기 코드
                message="학생의 이름을 입력하세요";
                String name=ScannerUtil.nextLine(SCANNER,message);
                message="학생의 국어 점수를 입력하세요";
                int korean= ScannerUtil.nextInt(SCANNER,message,SCORE_MIN,100);
                message="학생의 영어 점수를 입력하세요";
                int english= ScannerUtil.nextInt(SCANNER,message,0,100);
                message="학생의 수학 점수를 입력하세요";
                int math= ScannerUtil.nextInt(SCANNER,message,0,100);

                students[nextIndex] = new Student();
                students[nextIndex].id=nextId;
                students[nextIndex].name=name;
                students[nextIndex].korean=korean;
                students[nextIndex].english=english;
                students[nextIndex].math=math;
                list.add(students[nextIndex]);
                nextId++;
            } else if (userChoice==2){
                // 출력 하기
                for (int i=0; i<list.size();i++){
                    list.get(i).printInfo();
                }
                if (list.size()!=0){
                    message="수정 혹은 삭제를 원하는 학생의 번호를 입력하세요";
                    int idNumber=ScannerUtil.nextInt(SCANNER,message,1,list.size());

                    if(list.contains(idNumber)){
                        list.get(list.indexOf(idNumber)).printInfo();
                        message="1. 수정 2. 삭제 ";                         //3. 이전으로 메서드 만들면 넣기
                        int userNumber=ScannerUtil.nextInt(SCANNER,message);
                        if (userNumber==1) {
                            message="학생의 이름을 입력하세요";
                            String name=ScannerUtil.nextLine(SCANNER,message);
                            message="학생의 국어 점수를 입력하세요";
                            int korean= ScannerUtil.nextInt(SCANNER,message,0,100);
                            message="학생의 영어 점수를 입력하세요";
                            int english= ScannerUtil.nextInt(SCANNER,message,0,100);
                            message="학생의 수학 점수를 입력하세요";
                            int math= ScannerUtil.nextInt(SCANNER,message,0,100);
                            students[nextIndex].id=nextId;
                            students[nextIndex].name=name;
                            students[nextIndex].korean=korean;
                            students[nextIndex].english=english;
                            students[nextIndex].math=math;
                            list.set(idNumber,students[nextIndex]);
                        } else if(userNumber==2) {
                            list.remove(idNumber);
                        }

                    } else{
                        System.out.println("등록된 정보가 없습니다.");
                    }

                } else{
                    System.out.println("아직 기록되지 않았습니다.");
                }


            } else if (userChoice==3) {
                System.out.println("사용해주셔서 감사합니다");
                break;
            }

        }
    }





}
