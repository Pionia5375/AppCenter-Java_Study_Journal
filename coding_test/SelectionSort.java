import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main() {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("배열의 길이를 입력하세요: ");
        int length = stdIn.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println(i + "번째 요소의 값을 입력하세요: ");
            array[i] = stdIn.nextInt();
        }

        System.out.println("선택 정렬을 실행합니다.");
        System.out.println("선택 정렬 실행 전 배열: " + Arrays.toString(array));

        selectionSort(array, length);
        System.out.println("선택 정렬 실행 후 배열: " + Arrays.toString(array));

    }

    static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    static void selectionSort(int[] array, int length) {
        for (int i = 0; i < length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++)
                if (array[j] < array[min])
                    min = j;
            swap(array, i, min);
        }
    }
}
