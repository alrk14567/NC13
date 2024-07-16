package day0531;

import util.ScannerUtil;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Merge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> arr = new ArrayList<>();


        String message = "원소의 갯수는?";
        int userChoice = ScannerUtil.nextInt(scanner, message);
        int temp = random.nextInt(100) + 1;
        for (int i = 0; i < userChoice; i++) {
            temp = random.nextInt(100) + 1;
            arr.add(temp);
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println("");
        System.out.println("=======================");

        // 메서드 실행
        mergeSort(arr);

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println("");
        int[] arr2 = new int[arr.size()];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(100) + 1;
        }


    }

    public static void mergeSort(ArrayList<Integer> arr) {
        // 나누는 메서드
        sort(arr, 0, arr.size());
    }

    // 나누는 메서드
    private static void sort(ArrayList<Integer> arr, int low, int high) {
        if (high - low < 2) {
            return;
        }

        int mid = (low + high) / 2;
        sort(arr, 0, mid);
        sort(arr, mid, high);
        // 합치는 메서드
        merge(arr, low, mid, high);
    }

    //합치는 메서드
    private static void merge(ArrayList<Integer> arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(high - low);
        //처음
        int t = 0;
        // 다 나눠졌을때 위치가 왼쪽(l)이냐 오른쪽(h)이냐
        int l = low;
        int h = mid;

        // 비교해서 오른쪽꺼 비교해서 작은수 저장인데 전체 가운데에서 왼쪽 부분
        while (l < mid && h < high) {
            if (arr.get(l) < arr.get(h)) {
                if (t == 0) {
                    temp.add(arr.get(l++));
                } else {
                    temp.set(t++, arr.get(l++));
                }

            } else {
                if (t == 0) {
                    temp.add(arr.get(h++));
                } else {
                    temp.set(t++, arr.get(h++));
                }
            }
        }

        while (l < mid) {
            temp.set(t++, arr.get(l++));
        }

        while (h < high) {
            temp.set(t++, arr.get(h++));
        }

        for (int i = low; i < high; i++) {
            if (temp.get(i - low) == null) {

            } else {
                arr.set(i, temp.get(i - low));
            }

        }
    }
}
