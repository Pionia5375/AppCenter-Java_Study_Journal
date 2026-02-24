import java.util.Scanner;

public class BinSearch {

    static int binSearch(int[] array, int max, int key) {
        int ptl = 0;
        int ptr = max - 1;

        do {
            int ptc = (ptr + ptl) / 2;
            if (array[ptc] == key)
                return ptc;
            else if (array[ptc] < key)
                ptl = ptc + 1;
            else
                ptr = ptc - 1;
        } while (ptr >= ptl);

        return -1;
    }

    static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("배열의 길이를 입력하세요: ");

        int max = stdIn.nextInt();
        int[] array = new int[max];

        System.out.println("0번째 요소의 값: ");
        array[0] = stdIn.nextInt(); // 첫번째 요소의 값을 미리 입력 받아서, 첫 루프에서의 i와 i - 1의 연산이 가능하도록 함.

        for (int i = 1; i < max; i++) {
            do {
                System.out.println(i + "번째 요소의 값: ");
                array[i] = stdIn.nextInt();
            } while (array[i] < array[i - 1]);
        }

        System.out.println("키의 값을 입려히세요: ");
        int key = stdIn.nextInt();

        int res = binSearch(array, max, key);
        System.out.println("이진 탐색의 결과 (-1일 시 탐색 실패): " + res + "번째 인덱스");
    }
}
