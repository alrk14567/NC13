package day0531;

import util.ScannerUtil;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SortStudy {
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
        //mergeSort(arr);

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println("");
        int[] arr2 = new int[arr.size()];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(100) + 1;
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println("");
        System.out.println("=======================");

        //메서드 실행
        int[] arr3 = new int[arr2.length];
        MergeSorter.mergeSort(arr2);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    // 삽입정렬 두번째 원소부터 앞에 원소와 큰지 작은지 비교해서 자리에 넣어주는 방식
    public static ArrayList<Integer> insertSort(ArrayList<Integer> arr) {

        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) < arr.get(j)) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        return arr;
    }

    // 버블정렬 인접한 원소끼리 자리 교환하면서 맨끝부터 정렬이 된다.
    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> arr) {

        int count = 0;
        while (count < arr.size() - 1) {
            // 버블정렬 실행
            for (int i = 0; i < arr.size() - 1; i++) {
                if (arr.get(i) > arr.get(i + 1)) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(i + 1));
                    arr.set(i + 1, temp);
                }
            }
            count++;
        }
        return arr;
    }

    // 선택정렬 앞에서 부터 차례대로 정렬, 최솟값을 찾으면 가장 앞자리에 배열
    public static ArrayList<Integer> selectSort(ArrayList<Integer> arr) {
        int min;
        int count = 0;

        while (count < arr.size()) {
            //최소값 찾기
            min = arr.get(count);
            for (int i = count; i < arr.size(); i++) {
                if (arr.get(i) < min) {
                    min = arr.get(i);
                }
            }
            int index = arr.indexOf(min);
            int temp = arr.get(count);
            arr.set(count, min);
            arr.set(index, temp);
            count++;
        }
        return arr;
    }

    // merge
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
            if (temp.get(i-low) == null) {

            } else{
                arr.set(i, temp.get(i - low));
            }

        }
    }

    // 왼쪽 오른쪽 숫자를 비교해서 작은쪽 숫자를 출력해주는 메서드
    public static int smallAtoB(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int bigAtoB(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static ArrayList<Integer> order(ArrayList<Integer> arr) {
        return insertSort(arr);
    }

    // 퀵정렬 내가 배운걸로는 할수가 없겠는데??

    // 쉘정렬


}
