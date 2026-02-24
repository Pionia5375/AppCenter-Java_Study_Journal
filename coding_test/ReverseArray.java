import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ReverseArray {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }
    }

    static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("요소의 수: ");
        int num = stdIn.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < x.length; i++) {
            x[i] = rand.nextInt(100);
        }

        System.out.println("기존 배열: " + Arrays.toString(x));
        reverse(x);
        System.out.println("역순정렬 후 배열: " + Arrays.toString(x));
    }
}
