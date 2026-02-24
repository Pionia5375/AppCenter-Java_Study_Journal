import java.util.Scanner;

public class SeqSearchSen {
    static int seqSearchSen(int a[], int max, int key) {
        int i = 0;
        a[max] = key;

        while (true) {
            if (a[i] == key)
                break;
            i++;
        }

        return i == max ? -1 : i;
    }

    static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.println("요소의 수: ");
        int max = stdin.nextInt();

        int[] array = new int[max + 1];

        for (int i = 0; i < max; i++) {
            do {
                System.out.println(i + "번째 요소: ");
                array[i] = stdin.nextInt();
            } while (array[i] < 0);
        }

        System.out.println("키 값을 입력하세요: ");
        int key = stdin.nextInt();

        System.out.println("순차 검색을 시작합니다.");
        int res = seqSearchSen(array, max, key);
        System.out.println("검색 결과: " + res + "번째 요소");

    }
}
