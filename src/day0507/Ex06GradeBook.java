package day0507;
// 학생 5명의 번호, 이름, 국어, 영어, 수학 점수를 입력 받아서
// 예쁘게 출력하는 프로그램을 작성하시오
// 단, 한번에 5명의 정보를 모두다 입력하는 것이 아니라 메뉴를 만들어서 입력 메뉴를 통해 들어갔을 때
// 한명의 정보만 입력을 하되, 만약 5명의 정보를 모두다 입력했을 경우
// 더이상 입력이 안되게 만드시고
// 출력할 때에는 현재 입력된 학생들만 출력이 되게 만드시오.

// 심화: 만약 5명을 보두다 입력했을 경우, 새로운 입력시 가장 먼저 입력된 정보를 없애고 현재 정보가 들어갈 수 있도록 코드를 작성하시오

import java.util.Scanner;

public class Ex06GradeBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int PEOPLE = 5;
        final double SUBJECTS = 3.0;

        int[] studentNumbers = new int[PEOPLE];
        String[] studentNames = new String[PEOPLE];
        int[] koreanGrades = new int[PEOPLE];
        int[] englishGrades = new int[PEOPLE];
        int[] mathGrades = new int[PEOPLE];
        int[] sum = new int[PEOPLE];
        double[] average = new double[PEOPLE];



        for (int i=0; i<=PEOPLE; ) {
            System.out.print("1. 입력    2. 출력    3. 종료\n");
            System.out.print("메뉴를 선택하세요.\n");
            System.out.print("> ");

            int choiceNumber = scanner.nextInt();

            if (choiceNumber == 1) {
                // 입력 코딩
                for (int j=0; j < PEOPLE;j++ ) {
                    boolean valid = false;
                    if (!valid) {
                        System.out.println("번호를 입력하세요.");
                        System.out.print("> ");
                        studentNumbers[j] = scanner.nextInt();
                        if (studentNumbers[j] < 0) {
                            System.out.println("잘못 입력하셨습니다.");
                            j = -1;
                            valid = false;
                        } else if (!valid) {
                            System.out.println("이름을 입력하세요.");
                            scanner.nextLine();
                            studentNames[j] = scanner.nextLine();
                            valid = true;

                        }
                    }

                    boolean valid2 = false;
                    if (valid) {
                        System.out.println("국어 점수를 입력하세요.");
                        System.out.print("> ");
                        koreanGrades[j] = scanner.nextInt();

                        if (koreanGrades[j] >= 0 && koreanGrades[j] <= 100) {
                            valid2 = true;
                        } else {
                            System.out.println("잘못 입력하셨습니다.");
                            valid2 = false;
                        }
                    }
                    valid = false;
                    boolean valid3 = false;
                    if (valid2) {
                        System.out.println("영어 점수를 입력하세요.");
                        System.out.print("> ");
                        englishGrades[j] = scanner.nextInt();

                        if (englishGrades[j] >= 0 && englishGrades[j] <= 100) {
                            valid3 = true;
                        } else {
                            System.out.println("잘못 입력하셨습니다.");
                            valid3 = false;
                        }
                    }
                    valid2=false;
                    boolean valid4 = false;
                    if (valid3) {
                        System.out.println("수학 점수를 입력하세요.");
                        System.out.print("> ");
                        mathGrades[j] = scanner.nextInt();

                        if (mathGrades[j] >= 0 && mathGrades[j] <= 100) {
                            valid4 = true;
                            sum[j] = koreanGrades[j] + englishGrades[j] + mathGrades[j];
                            average[j] = sum[j]/SUBJECTS;
                            break;
                        } else {
                            System.out.println("잘못 입력하셨습니다.");
                            valid4 = false;
                        }
                    }
                    valid2=false;
                    valid3=false;
                    valid4=false;

                    i++;


                }
            } else if (choiceNumber == 2) {
                //출력 코딩
                System.out.println("번호     이름     국어  영어  수학  총점    평균");
                for (int k = 0; k < PEOPLE; k++) {
                    System.out.printf("%2d  %8s    %3d  %3d  %3d  %3d    %5.2f\n",studentNumbers[k], studentNames[k], koreanGrades[k], englishGrades[k], mathGrades[k], sum[k], average[k]);
                }
            } else if (choiceNumber == 3) {
                System.out.println("이용해주셔서 감사합니다.");
                break;
            } else {
                System.out.printf("잘못 입력하셨습니다.\n");
            }

        }


    }
}
