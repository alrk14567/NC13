package day0531;

import java.util.Random;

public class MergeSortKIM {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arr = new int[20];
        int[] tempArr = new int[20];

        for (int i = 0; i < 20; i++) {
            arr[i] = random.nextInt(100);
        }

        printArr(arr);

        mergeSort(arr, tempArr, 0, 19);
    }

    public static void mergeSort(int[] arr, int[] tempArr, int first, int last) {
        if (first < last) {
            int middle = (first + last) / 2;

            mergeSort(arr, tempArr, first, middle);
            mergeSort(arr, tempArr, middle + 1, last);

            int left = first;
            int right  = middle + 1;
            int tempIdx = first;

            while(left <= middle || right <= last) {
                if (right > last || (arr[left] <= arr[right] && left <= middle)) {
                    tempArr[tempIdx++] = arr[left++];
                } else {
                    tempArr[tempIdx++] = arr[right++];
                }
            }

            for (int i = first; i <= last; i++) {
                arr[i] = tempArr[i];
            }

            printArr(arr);
        }

    }


    public static void printArr(int[] arr) {
        for (int j : arr) {
            System.out.printf("%d ", j);
        }
        System.out.println();
    }
}
