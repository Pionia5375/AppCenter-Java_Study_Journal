package me.leejeong;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main() {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("배열의 길이를 입력하세요: ");
        int length = stdIn.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i ++) {
            System.out.println(i + "번째 요소의 값을 입력하세요: ");
            array[i] = stdIn.nextInt();
        }

        System.out.println("선택 정렬을 실행합니다.");
        System.out.println("선택 정렬 실행 전 배열: " + Arrays.toString(array));

        insertionSort(array, length);
        System.out.println("선택 정렬 실행 후 배열: " + Arrays.toString(array));

    }

    static void insertionSort(int[] array, int length) {
        for (int i = 1; i < length; i++) {
            int j;
            int tmp = array[i];
            for (j = i; j > 0 && array[j - 1] > tmp; j--)
                array[j] = array[j - 1];
            array[j] = tmp;
        }
    }
}
