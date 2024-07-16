package day0509;
// 학생 5명의 번호, 이름, 국어, 영어, 수학 점수를 입력 받아서
// 예쁘게 출력하는 프로그램을 작성하시오
// 단, 한번에 5명의 정보를 모두다 입력하는 것이 아니라 메뉴를 만들어서 입력 메뉴를 통해 들어갔을 때
// 한명의 정보만 입력을 하되, 만약 5명의 정보를 모두다 입력했을 경우
// 더이상 입력이 안되게 만드시고
// 출력할 때에는 현재 입력된 학생들만 출력이 되게 만드시오.
import java.util.Scanner;

import util.ArrayUtil;
import util.ScannerUtil;
public class Ex02Gradebook {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] idNumbers = new int[0];
        String[] names = new String[0];
        int[] koreanGrades = new int[0];
        int[] englishGrades = new int[0];
        int[] mathGrades = new int[0];


        while(true) {

            int choiceNumber=ScannerUtil.nextInt(scanner,"1.입력 2.출력 3. 종료",1,3);


            if (choiceNumber==1) {
                // 입력 코딩
                int idNumber = ScannerUtil.nextInt(scanner,"번호: ");
                idNumbers=ArrayUtil.add(idNumbers,idNumber);

                ScannerUtil.printMessage("이름: ");
                scanner.nextLine();
                String name = scanner.nextLine();
                names=ArrayUtil.add(names,name);

                int koreanGrade = ScannerUtil.nextInt(scanner,"국어 성적:",0,100);

                koreanGrades=ArrayUtil.add(koreanGrades,koreanGrade);

                int englishGrade = ScannerUtil.nextInt(scanner,"영어 성적:",0,100);
                englishGrades=ArrayUtil.add(englishGrades,englishGrade);

                int mathGrade = ScannerUtil.nextInt(scanner,"수학 성적:",0,100);
                mathGrades=ArrayUtil.add(mathGrades,mathGrade);
            } else if (choiceNumber==2) {
                if (ArrayUtil.size(idNumbers)!=0){
                    //출력코딩
                    for(int i=0 ;i<ArrayUtil.size(idNumbers);i++) {
                        System.out.println("번호:" + idNumbers[i] + " 이름: "+ names[i]);
                        System.out.println("국어 점수: "+koreanGrades[i]+" 영어 점수: "+ englishGrades[i]+" 수학 점수: "+mathGrades[i]);
                    }
                } else {
                    System.out.println("아직 기록이 되지 않았습니다.");
                }
            } else if(choiceNumber==3){
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }

        }
    }


}
