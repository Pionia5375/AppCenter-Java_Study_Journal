public class Iter {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 0)
                System.out.print(" |");
            else
                System.out.print(" " + i);
        }

        System.out.println();

        for (int i = 0; i < 25; i++) {
            if (i == 1)
                System.out.print("+");
            else if (i == 24)
                System.out.println();
            else
                System.out.print("-");
        }

        for (int i = 0; i < 9; i++) {
            System.out.print((i + 1) + "|");
            for (int j = 0; j < 9; j++) {
                System.out.print(" " + (i + 1) * (j + 1));
            }
            System.out.println();
        }
    }
}
