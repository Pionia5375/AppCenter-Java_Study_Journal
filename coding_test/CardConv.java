import java.util.Scanner;

public class CardConv {

    static int cardConv(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "01234566789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);

        for (int i = 0; i < digits / 2; i++) {
            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = t;
        }

        return digits;
    }

    static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[32]; // 최대 길이: 32

        System.out.println("10진수를 기수변환합니다.");
        do {
            do {
                System.out.print("변환할 음이 아닌 10진수 정수: ");
                no = stdIn.nextInt();
            } while (no < 0);

            do {
                System.out.print("어쩐 진수로 변활까요? (2~36): ");
                cd = stdIn.nextInt();
            } while (cd < 2 || cd > 36);

            dno = cardConv(no, cd, cno);

            System.out.print(cd + "진수로 ");
            for (int i = 0; i < dno; i++)
                System.out.print(cno[i]);
            System.out.println("입니다.");

            System.out.print("한 번 더 할까요? (1. 예 / 0. 아니요): ");
            retry = stdIn.nextInt();
        } while (retry == 1);
    }
}
