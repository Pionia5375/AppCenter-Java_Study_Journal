import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("배열의 길이를 입력하세요: ");
        int length = stdIn.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println(i + "번째 요소의 값을 입력하세요: ");
            array[i] = stdIn.nextInt();
        }

        System.out.println("버블 정렬을 실행합니다.");
        System.out.println("버블 정렬 실행 전 배열: " + Arrays.toString(array));

        bubbleSort(array, length);
        System.out.println("버블 정렬 실행 후 배열: " + Arrays.toString(array));

    }

    static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    static void bubbleSort(int[] array, int length) {
        int k = 0;
        while (k < length - 1) {
            int last = length - 1;
            for (int j = length - 1; j > k; j--) {
                if (array[j - 1] > array[j]) {
                    swap(array, j - 1, j);
                    last = j;
                }
            }
            k = last;
        }
    }

}
