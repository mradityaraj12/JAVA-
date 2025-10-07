
/**
 * ! Enter the number of row and columns:  5 ?

        1 
      1 2
    1 2 3
  1 2 3 4
1 2 3 4 5
 */

import java.util.Scanner;

public class program35 {
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
                System.out.print(j + " ");
            star++;
            space--;

            System.out.println();
        }
    }

}
