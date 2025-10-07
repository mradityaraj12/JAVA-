
/**
 * !  Enter the Number of Row Is : 5

A  B  C  D  E
  A  B  C  D
    A  B  C
      A  B
        A


 */

import java.util.Scanner;

public class program102 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number of Row Is : ");
        int n = Sc.nextInt();
        printPattern(n);
    }

    public static void printPattern(int n) {
        int star = n;
        int space = 0;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= space; j++)
                System.out.print("  ");
            for (int j = 1; j <= star; j++)
                System.out.print((char) (j + 64) + "  ");
            star--;
            space++;

            System.out.println();
        }
    }

}
