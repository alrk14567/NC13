package day0509;
// 로또 번호 제작기                        -> 이름 바꾸는거 알트 쉬프트 알
// Arrayutil을 사용한 버젼

import java.util.Random;

import util.ArrayUtil;
public class Ex01Lotto_00 {
    public static void main(String[] args){
        Random random = new Random();
        int[] computerNumbers=new int[0];

        while(ArrayUtil.size(computerNumbers)<6) {
            int randomNumber=random.nextInt(45)+1;
            if (!(ArrayUtil.contains(computerNumbers,randomNumber))) {
                computerNumbers=ArrayUtil.add(computerNumbers,randomNumber);
            }
        }
        ArrayUtil.order(computerNumbers);
        for(int i=0; i < ArrayUtil.size(computerNumbers);i++) {
            System.out.println(computerNumbers[i]);
        }
    }

}
