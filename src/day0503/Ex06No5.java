package day0503;

import java.util.Scanner;
public class Ex06No5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        System.out.println("숫자를 입력하세요.");
        System.out.print("> ");
        int lowNumber=scanner.nextInt();
        int low=1+2*(lowNumber-1);

        for (int i = 1; i <=lowNumber;i++) {

            String star = "";
            String empty = "";

            for (int j = 1; j <= lowNumber+i-1; j++) {

                if (j <= lowNumber-i) {
                    empty += " ";
                } else {
                    star += "*";
                }
            }
            System.out.println(empty + star);

        }
    }
}
