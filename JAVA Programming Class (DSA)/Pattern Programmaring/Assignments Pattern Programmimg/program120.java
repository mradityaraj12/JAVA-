
/**
 * ! Eneter the number of Row Is : 5 

A A A A A A A A A 
  B B B B B B B
    C C C C C
      D D D
        E

 */

import java.util.Scanner;

public class program120 {

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

            for (int j = 1; j <= star; j++)
                System.out.print((char) (i + 64) + " ");
            star -= 2;
            space++;

            System.out.println();
        }
    }

}
