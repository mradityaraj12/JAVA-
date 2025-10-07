
/**
 * ! Eneter the number of Row Is : 5 ? 

E E E E E E E E E 
  D D D D D D D
    C C C C C
      B B B
        A 

 */

import java.util.Scanner;

public class program124 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Eneter the number of Row Is :");
        int n = Sc.nextInt();
        printPattern(n);

    }

    public static void printPattern(int n) {
        int star = 2 * n - 1;
        int space = 0;
        int num = n + 64;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= space; j++)
                System.out.print("  ");

            for (int j = 1; j <= star; j++)
                System.out.print((char) (num) + " ");
            star -= 2;
            space++;
            num--;

            System.out.println();
        }
    }

}
