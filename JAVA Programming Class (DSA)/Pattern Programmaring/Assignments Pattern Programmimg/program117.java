import java.util.Scanner;

public class program117 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Eneter the number of Row Is :");
        int n = Sc.nextInt();
        printPattern(n);

    }

    public static void printPattern(int n) {
        int star = 2 * n - 1;
        int space = 0;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= space; j++)
                System.out.print("  ");
            int colMid = star / 2 + 1;
            for (int j = 1; j <= colMid; j++)

                System.out.print(j + " ");

            for (int j = colMid - 1; j >= 1; j--)
                System.out.print(j + "  ");

            star -= 2;
            space++;

            System.out.println();
        }
    }

}
