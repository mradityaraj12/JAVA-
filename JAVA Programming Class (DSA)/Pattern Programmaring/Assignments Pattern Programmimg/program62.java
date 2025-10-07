
/**
 * ! Enter the number of row and columns: 6 ?

          A    
        A    B
      A    B    C
    A    B    C    D
  A    B    C    D    E
A    B    C    D    E    F

 */

import java.util.Scanner;

class program62 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of row and columns:");
        int n = Sc.nextInt();
        getPrintPattern(n);

    }

    public static void getPrintPattern(int n) {
        int star = 1;
        int space = n - 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= space; j++)
                System.out.print("  ");

            for (int j = 1; j <= star; j++)

                System.out.print((char) (j + 64) + "    ");

            star++;
            space--;

            System.out.println();
        }
    }

}