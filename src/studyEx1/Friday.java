package studyEx1;

import java.util.Random;
import java.util.Scanner;

import util.ScannerUtil;

public class Friday {


    public static void main(String[] args) {
        String[] candidates = {"동욱", "인성", "기돈", "유정"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int chosenIndex = random.nextInt(candidates.length);
            String message = "1. 금요일의 담당자 | 2. 미정 | 3. 미정";
            int userChoice = ScannerUtil.nextInt(scanner, message);
            if (userChoice == 1) {
                System.out.println("이번 주 금요일의 담당자는 : " + candidates[chosenIndex] + "님 입니다. ");

            } else if (userChoice == 2) {
            }
        }

    }

}
