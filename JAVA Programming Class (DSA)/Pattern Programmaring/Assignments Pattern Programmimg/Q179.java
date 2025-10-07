
/**
 * ! Enter the Number Of Row IS :
7
      A 
    A B A
  A B C B A
A B C D C B A
  A B C B A
    A B A
      A
      
 */

import java.util.Scanner;

public class Q179 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number Of Row IS :");
        int n = Sc.nextInt();
        printPattern(n);

    }

    public static void printPattern(int n) {

        if (n % 2 == 0) {
            System.out.println("Pattern is NOT Possible for Even Row!");
            return;
        }

        int star = 1;
        int rowMid = n / 2 + 1;
        int space = n / 2;

        for (int i = 1; i <= n; i++) {
            int num = 65;

            for (int j = 1; j <= space; j++)
                System.out.print("  ");
            int colMid = star / 2 + 1;

            for (int j = 1; j <= star; j++) {
                if (j < colMid) {
                    System.out.print((char) num++ + " ");

                } else {
                    System.out.print((char) num-- + " ");
                }

            }
            if (i < rowMid) {
                star += 2;
                space--;

                num++;

            } else {
                star -= 2;
                space++;

                num--;

            }
            System.out.println();
        }

    }

}
