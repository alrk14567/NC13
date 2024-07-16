package day0507;
// 학생 5명의 번호, 이름, 국어, 영어, 수학 점수를 입력 받아서
// 예쁘게 출력하는 프로그램을 작성하시오
// 단, 한번에 5명의 정보를 모두다 입력하는 것이 아니라 메뉴를 만들어서 입력 메뉴를 통해 들어갔을 때
// 한명의 정보만 입력을 하되, 만약 5명의 정보를 모두다 입력했을 경우
// 더이상 입력이 안되게 만드시고
// 출력할 때에는 현재 입력된 학생들만 출력이 되게 만드시오.

// 심화: 만약 5명을 보두다 입력했을 경우, 새로운 입력시 가장 먼저 입력된 정보를 없애고 현재 정보가 들어갈 수 있도록 코드를 작성하시오

import java.util.Scanner;

public class Ex06GradeBook_00 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] idArray = new int[5];
        String[] nameArray = new String[5];
        double[] koreanArray = new double[5];
        double[] englishArray = new double[5];
        double[] mathArray = new double[5];
        double[] sumArray = new double[5];
        double[] averageArray = new double[5];
        final double SUBJECTS = 3.0;
        int indx = 0;

        while (true) {
            System.out.println("1. 입력 2. 출력 3. 종료");
            System.out.println("메뉴를 선택하세요.");
            System.out.print("> ");
            int choiceNumber = scanner.nextInt();


            if (choiceNumber == 1) {
                // 입력 코드 실행


                if (indx < 5) {
                    while (true) {
                        System.out.println("번호");
                        System.out.print("> ");
                        idArray[indx] = scanner.nextInt();
                        if (idArray[indx] > 0) {
                            break;
                        } else {
                            System.out.println("잘못된 입력값입니다.");
                        }
                    }

                    System.out.println("이름");
                    System.out.print("> ");
                    scanner.nextLine();
                    nameArray[indx] = scanner.nextLine();

                    while (true) {
                        System.out.println("국어");
                        System.out.print("> ");
                        koreanArray[indx] = scanner.nextDouble();
                        if (koreanArray[indx] >= 0 && koreanArray[indx] <= 100) {
                            break;
                        } else {
                            System.out.println("잘못된 입력값입니다.");
                        }
                    }

                    while (true) {
                        System.out.println("영어");
                        System.out.print("> ");
                        englishArray[indx] = scanner.nextDouble();
                        if (englishArray[indx] >= 0 && englishArray[indx] <= 100) {
                            break;
                        } else {
                            System.out.println("잘못된 입력값입니다.");
                        }
                    }

                    while (true) {
                        System.out.println("수학");
                        System.out.print("> ");
                        mathArray[indx] = scanner.nextDouble();
                        if (mathArray[indx] >= 0 && mathArray[indx] <= 100) {
                            break;
                        } else {
                            System.out.println("잘못된 입력값입니다.");
                        }
                    }

                    sumArray[indx] = koreanArray[indx] + englishArray[indx] + mathArray[indx];
                    averageArray[indx] = sumArray[indx] / SUBJECTS;
                    indx++;
                }else if (indx == 5) {
                    for (int i=1; i<5; i++) {
                        idArray[i-1] = idArray[i];
                        nameArray[i-1] = nameArray[i];
                        koreanArray[i-1] = koreanArray[i];
                        englishArray[i-1] = englishArray[i];
                        mathArray[i-1] = mathArray[i];
                        sumArray[i-1] = sumArray[i];
                        averageArray[i-1] = averageArray[i];

                    }
                    indx =4;
                    while (true) {
                        System.out.println("번호");
                        System.out.print("> ");
                        idArray[indx] = scanner.nextInt();
                        if (idArray[indx] > 0) {
                            break;
                        } else {
                            System.out.println("잘못된 입력값입니다.");
                        }
                    }

                    System.out.println("이름");
                    System.out.print("> ");
                    scanner.nextLine();
                    nameArray[indx] = scanner.nextLine();

                    while (true) {
                        System.out.println("국어");
                        System.out.print("> ");
                        koreanArray[indx] = scanner.nextDouble();
                        if (koreanArray[indx] >= 0 && koreanArray[indx] <= 100) {
                            break;
                        } else {
                            System.out.println("잘못된 입력값입니다.");
                        }
                    }

                    while (true) {
                        System.out.println("영어");
                        System.out.print("> ");
                        englishArray[indx] = scanner.nextDouble();
                        if (englishArray[indx] >= 0 && englishArray[indx] <= 100) {
                            break;
                        } else {
                            System.out.println("잘못된 입력값입니다.");
                        }
                    }

                    while (true) {
                        System.out.println("수학");
                        System.out.print("> ");
                        mathArray[indx] = scanner.nextDouble();
                        if (mathArray[indx] >= 0 && mathArray[indx] <= 100) {
                            break;
                        } else {
                            System.out.println("잘못된 입력값입니다.");
                        }
                    }
                    indx++;
                }

                /*else if (indx >=5) {                                              5개 넘으면 못 저장하는 코드
                    System.out.println("더이상 입력할 수 없습니다.");
                }*/

            } else if (choiceNumber == 2) {
                // 출력 코드 실행
                if (indx == 0) {
                    System.out.println("기록된 내용이 없습니다.");
                } else {
                    for (int i = 0; i <indx; i++) {
                        System.out.printf("%3d번  %s\n",idArray[i],nameArray[i]);
                        System.out.printf("국어: %6.2f점 영어: %6.2f점 수학: %6.2f점 총점: %6.2f점 평균: %6.2f점\n",koreanArray[i],englishArray[i],mathArray[i],sumArray[i], averageArray[i]);
                    }
                }
            } else if (choiceNumber == 3) {
                // 종료 코드 실행
                System.out.println("사용해주셔서 감사합니다.");
                break;
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }

        }

    }
}
