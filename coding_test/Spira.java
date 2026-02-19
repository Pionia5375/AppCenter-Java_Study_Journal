public class Spira {
    public static void main(String[] args) {
        spira(5);
    } 

    static void spira(int n) {
        int len = 1 + (2 * (n - 1));
        for (int i = 0; i < n; i++){
            for (int j = 0; j < len; j++) {
                if (j < len / 2 - i || j > len / 2 + i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    
}
